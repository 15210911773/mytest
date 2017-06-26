package cn.itcast.crm.controller;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.itcast.crm.bean.BaseDict;
import cn.itcast.crm.bean.Customer;
import cn.itcast.crm.bean.QueryVo;
import cn.itcast.crm.service.BaseDictService;
import cn.itcast.crm.service.CustomerService;
import cn.itcast.crm.utils.Page;

/**
 * 客户管理controller
 * <p>Title: CustomerController</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p> 
 * @version 1.0
 */
@Controller
public class CustomerController {

	@Autowired
	private BaseDictService baseDictService;
	@Autowired
	private CustomerService customerService;
	
	@Value("${typecode.source}")
	private String typeCodeSource;
	@Value("${typecode.industry}")
	private String typeCodeIndustry;
	@Value("${typecode.level}")
	private String typeCodeLevel;
	
	@RequestMapping("/list")
	//返回string代表逻辑视图
	public String showCustomerList(QueryVo queryVo, 
			@RequestParam(defaultValue="1")Integer page, Model model) throws Exception {
		//解决get乱码的问题
		String custName = queryVo.getCustName();
		if (custName != null && !"".equals(custName)) {
			custName = new String(custName.getBytes("iso8859-1"), "utf-8");
			queryVo.setCustName(custName);
		}
		//初始化查询条件列表
		//查询客户来源列表
		List<BaseDict> fromType = baseDictService.getDictListByTypeCode(typeCodeSource);
		//所属行业
		List<BaseDict> industryType = baseDictService.getDictListByTypeCode(typeCodeIndustry);
		//客户级别
		List<BaseDict> levelType = baseDictService.getDictListByTypeCode(typeCodeLevel);
		//把初始化数据传递给jsp
		model.addAttribute("fromType", fromType);
		model.addAttribute("industryType", industryType);
		model.addAttribute("levelType", levelType);
		
		//查询客户列表
		Page<Customer> page2 = customerService.getCustomerList(queryVo, page);
		model.addAttribute("page", page2);
		//参数回显
		model.addAttribute("custName", queryVo.getCustName());
		model.addAttribute("custSource", queryVo.getSource());
		model.addAttribute("custIndustry", queryVo.getIndustry());
		model.addAttribute("custLevel", queryVo.getLevel());
		
		//返回逻辑视图
		return "customer";
	}
	
	@RequestMapping("/customer/edit")
	@ResponseBody
	public Customer getCustomerById(Long id) {
		Customer customer = customerService.getCustomerById(id);
		return customer;
	}
	
	@RequestMapping("/customer/update")
	@ResponseBody
	public Map updateCustomer(Customer customer) {
		customerService.updateCustomer(customer);
		Map result = new HashMap<>();
		result.put("status", "OK");
		return result;
	}
	
	@RequestMapping("/customer/delete")
	@ResponseBody
	public Map deleteCustomer(Long id) {
		customerService.deleteCustomer(id);
		Map result = new HashMap<>();
		result.put("status", "OK");
		return result;
	}
}

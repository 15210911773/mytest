package cn.itcast.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.crm.bean.Customer;
import cn.itcast.crm.bean.QueryVo;
import cn.itcast.crm.dao.CustomerMapper;
import cn.itcast.crm.service.CustomerService;
import cn.itcast.crm.utils.Page;

/**
 * 客户管理Service
 * <p>Title: CustomerServiceImpl</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p> 
 * @version 1.0
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerMapper customerMapper;
	
	@Override
	public Page<Customer> getCustomerList(QueryVo queryVo, int page) {
		// 1、计算分页的是start
		int start = (page - 1) * queryVo.getRows();
		queryVo.setStart(start);
		// 2、调用Mapper查询客户列表
		List<Customer> customerList = customerMapper.getCustomerList(queryVo);
		// 3、count查询记录数
		int count = customerMapper.getCustomerListCount(queryVo);
		// 4、创建一个Page对象，并设置属性。
		Page<Customer> resultPage = new Page<>();
		resultPage.setPage(page);
		resultPage.setRows(customerList);
		resultPage.setSize(queryVo.getRows());
		resultPage.setTotal(count);
		// 5、返回page对象
		return resultPage;
				
	}

	@Override
	public Customer getCustomerById(long id) {
		Customer customer = customerMapper.getCustomerById(id);
		return customer;
	}

	@Override
	public void updateCustomer(Customer customer) {
		customerMapper.updateCustomer(customer);
		
	}

	@Override
	public void deleteCustomer(long id) {
		customerMapper.deleteCustomer(id);
		
	}

}

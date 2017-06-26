package cn.itcast.crm.service;

import cn.itcast.crm.bean.Customer;
import cn.itcast.crm.bean.QueryVo;
import cn.itcast.crm.utils.Page;

public interface CustomerService {

	Page<Customer> getCustomerList(QueryVo queryVo, int page);
	Customer getCustomerById(long id);
	void updateCustomer(Customer customer);
	void deleteCustomer(long id);
}

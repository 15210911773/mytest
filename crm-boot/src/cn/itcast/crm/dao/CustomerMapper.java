package cn.itcast.crm.dao;

import java.util.List;

import cn.itcast.crm.bean.Customer;
import cn.itcast.crm.bean.QueryVo;

public interface CustomerMapper {

	List<Customer> getCustomerList(QueryVo queryVo);
	int getCustomerListCount(QueryVo queryVo);
	Customer getCustomerById(long id);
	void updateCustomer(Customer customer);
	void deleteCustomer(long id);
}

package com.telecom.tel.Service;

import java.util.List;
import java.util.Optional;

import com.telecom.tel.Model.Customer;

public interface CustomerService {
	List<Customer> getAllCustomers();
	void addCustomer(Customer cust);
	void deleteCustomer(int id);
	void editCustomer(Customer cust);
	Optional<Customer> getCustomer(int id);
	
	boolean existsByGovId(int govId);
	Customer getCustomerByGgovtID(int ggovtID);
}

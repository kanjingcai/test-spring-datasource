package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dto.CustomerDTO;
import com.test.mapper.CustomerMapper;

@Service
public class CustomerService {

	@Autowired
	public CustomerMapper customerMapper;

	public List<CustomerDTO> queryCustomerById(Integer id) {
		return customerMapper.selectCustomer(id);
	}

	public void addCustomer(CustomerDTO customerDTO) {
		customerMapper.addCustomer(customerDTO);
	}

}

package com.test.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.datasource.DataSourceContextHolder;
import com.test.datasource.DataSourceType;
import com.test.dto.CustomerDTO;
import com.test.service.CustomerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/applicationContext*.xml" })
public class TestCustomer {

	@Autowired
	private CustomerService customerService;

	/**
	 * 动态数据源测试
	 */
	@Test
	public void testQueryCustomer() {
		DataSourceContextHolder.set(DataSourceType.SLAVE);
		List<CustomerDTO> customerDTO = customerService.queryCustomerById(1);
		System.out.println(customerDTO);
		DataSourceContextHolder.remove();
		
		DataSourceContextHolder.set(DataSourceType.MASTER);
		customerDTO = customerService.queryCustomerById(1);
		System.out.println(customerDTO);
	}
	
	/**
	 * Mapper接口注解方式
	 *  
	 * @see 2016年5月13日
	 * @author kanjc
	 */
	@Test
	public void testAdd() {
		List<CustomerDTO> customerDTO = customerService.queryCustomerById(1);
		System.out.println(customerDTO);

		/*CustomerDTO cd = new CustomerDTO();
		cd.setUserName("wangwu");
		cd.setPassword("888888888");
		customerService.addCustomer(cd);*/
		
		customerDTO = customerService.queryCustomerById(null);
		System.out.println(customerDTO);
	}


}

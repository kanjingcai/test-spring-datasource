package com.test.mapper;

import java.util.List;

import com.test.annotation.DataSource;
import com.test.datasource.DataSourceType;
import com.test.dto.CustomerDTO;

public interface CustomerMapper {

	@DataSource(values = DataSourceType.SLAVE)
	List<CustomerDTO> selectCustomer(Integer id);

	@DataSource(values = DataSourceType.MASTER)
	void addCustomer(CustomerDTO customerDTO);

}

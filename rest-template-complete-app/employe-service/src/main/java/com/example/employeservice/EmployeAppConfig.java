package com.example.employeservice;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class EmployeAppConfig {

	
	@Bean
	public ModelMapper modelMapper()
	{
		return new  ModelMapper();
	}
}

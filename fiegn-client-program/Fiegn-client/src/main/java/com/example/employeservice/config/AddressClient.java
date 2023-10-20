package com.example.employeservice.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.employeservice.entity.AddressResponse;

@FeignClient(name="Abc",url="http://localhost:8085")
public interface AddressClient {

	@GetMapping("/address/{id}")
	AddressResponse getAddressByEmpId(@PathVariable("id")int id);
}

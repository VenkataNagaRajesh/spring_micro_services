package com.example.AddressController.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.RequiredArgsConstructor;

@RestController
public class EmployeController {

	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/employe")
	public String getEmploye()
	{
		
		
		String address = restTemplate.getForObject("http://localhost:8082/address",String.class );
		return "name:Abhlash, email:abhilash@gmail.com"+address;
	}
}

package com.example.employeservice.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.employeservice.entity.AddressResponse;
import com.example.employeservice.entity.Employe;
import com.example.employeservice.entity.EmployeResponse;
import com.example.employeservice.repository.EmpRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeService {

	private final EmpRepo empRepo;
	private final ModelMapper modelMapper;
	private final RestTemplate restTemplate;
	
	public EmployeResponse getEmployeById(int id)
	{
		
		Employe employe = empRepo.findById(id).get();
		AddressResponse addressResponse = new AddressResponse();
		
		EmployeResponse empResponse = 
		modelMapper.map(employe, EmployeResponse.class);
		
		addressResponse  = restTemplate.getForObject("http://localhost:8085/address/{id}", AddressResponse.class,id);
		empResponse.setAddressResponse(addressResponse);
		return empResponse;
	}
}

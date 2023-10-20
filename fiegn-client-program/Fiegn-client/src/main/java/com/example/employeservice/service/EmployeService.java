package com.example.employeservice.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.employeservice.config.AddressClient;
import com.example.employeservice.entity.AddressResponse;
import com.example.employeservice.entity.Employe;
import com.example.employeservice.entity.EmployeResponse;
import com.example.employeservice.repository.EmpRepo;

import lombok.RequiredArgsConstructor;

@Service
public class EmployeService {

	@Autowired
	private  EmpRepo empRepo;
	@Autowired
	private  ModelMapper modelMapper;

	@Autowired
	private AddressClient addressClient;
	
	
	public EmployeResponse getEmployeById(int id)
	{
		
		Employe employe = empRepo.findById(id).get();
	
	System.out.println(addressClient);	
		EmployeResponse empResponse = 
		modelMapper.map(employe, EmployeResponse.class);
	System.out.println(empResponse);
	AddressResponse addressResponse   = addressClient.getAddressByEmpId(id);
		System.out.println("here"+addressResponse);
		empResponse.setAddressResponse(addressResponse);
		return empResponse;
	}
}

package com.example.employeservice.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.employeservice.entity.Address;
import com.example.employeservice.entity.AddressResponse;
import com.example.employeservice.repository.AddressRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AddressService {

	private final AddressRepo addressRepo;
	private final ModelMapper modelMapper;
	
	public AddressResponse addressResponse(int id)
	{
		Address address = addressRepo.findAddressByEmployeId(id);
		
		AddressResponse addressResponse = 
		modelMapper.map(address, AddressResponse.class);
		
		return addressResponse;
	}
}

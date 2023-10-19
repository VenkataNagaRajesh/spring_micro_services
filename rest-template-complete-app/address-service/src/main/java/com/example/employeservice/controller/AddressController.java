package com.example.employeservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.employeservice.entity.AddressResponse;
import com.example.employeservice.service.AddressService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class AddressController {
	
	
	private final AddressService addresService;
	
	@GetMapping("/address/{empId}")
	public ResponseEntity<AddressResponse> getEmpAddress(@PathVariable("empId") int id)
	{
		AddressResponse addressResponse = addresService.addressResponse(id);
		
		return ResponseEntity.status(HttpStatus.OK).body(addressResponse);
	}
}

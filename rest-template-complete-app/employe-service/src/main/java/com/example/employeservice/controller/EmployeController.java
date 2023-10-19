package com.example.employeservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.employeservice.entity.EmployeResponse;
import com.example.employeservice.service.EmployeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class EmployeController {
	
	private final EmployeService empService;
	
	
	@GetMapping("/employees/{id}")
	public ResponseEntity<EmployeResponse> getEmployeDetails(@PathVariable("id") int id)
	{
		
		EmployeResponse employeResponse = empService.getEmployeById(id);
		
		return ResponseEntity.status(HttpStatus.OK).body(employeResponse);
	}
}

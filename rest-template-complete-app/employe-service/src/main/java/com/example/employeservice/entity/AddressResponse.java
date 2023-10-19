package com.example.employeservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressResponse {

	private int eid;
	private String line1;
	private String line2;
	private String line3;
	
}

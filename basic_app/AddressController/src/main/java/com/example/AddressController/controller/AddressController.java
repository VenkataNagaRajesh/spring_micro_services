package com.example.AddressController.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
	@GetMapping("/address")
	public String getEmploye() {

		return "door.no:26774, village:sri hari puram" ;
	}
}

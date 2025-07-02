package com.gaurav.Hospital.Management.System;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;

@SpringBootApplication
@RestController
public class HospitalManagementSystemApplication {

	public static void main(String[] args) {

		SpringApplication.run(HospitalManagementSystemApplication.class, args);

	}

	@GetMapping("/hello")
	public String hello(){
		return "Hello World";
	}

}

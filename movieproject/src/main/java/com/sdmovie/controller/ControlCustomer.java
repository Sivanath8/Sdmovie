package com.sdmovie.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@Configuration

@ComponentScan
@RestController
public class ControlCustomer {
//	@Autowired
//	CustomerService customerservice;

	@RequestMapping("/")
	public  String verifyUsers() {
		String var = "Siva";
		System.out.println(var);
		return "Sdmovie";

	}
	
	

}

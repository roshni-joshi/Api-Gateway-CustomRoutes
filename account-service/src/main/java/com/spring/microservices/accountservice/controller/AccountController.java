package com.spring.microservices.accountservice.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

	private Environment env;

	public AccountController(final Environment env) {
		this.env = env;
	}

	@GetMapping("/status/check")
	public String status() {
		return "Account-ws working on port : " + env.getProperty("local.server.port");
	}
}

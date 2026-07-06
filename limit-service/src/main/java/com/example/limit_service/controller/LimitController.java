package com.example.limit_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.limit_service.configuration.Configuration;
import com.example.limit_service.model.Limits;

@RestController
public class LimitController {

	@Autowired
	private Configuration configuration;
	@GetMapping("/limits")
	public Limits reteiveLimit() {
		return new Limits(configuration.getMin(), configuration.getMax());
		// return new Limits(2, 992);
	}
}

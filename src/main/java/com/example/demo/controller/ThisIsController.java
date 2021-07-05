package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.ThisIsModel;
import com.example.demo.service.ThisIsService;

@Controller
public class ThisIsController {
	@Autowired
	ThisIsModel model;
	@Autowired
	ThisIsService service;
	
	@GetMapping("/")
	public String hi() {
		return "index";
		
	}
	
	@GetMapping("/add")
	public String hello(ThisIsModel model) {
		model.getId();
		model.getName();
		model.getPhone();
		service.add(model);
		return "index";
	}
	

}

package com.mindtree.studentapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

	
	@RequestMapping("/")
	public String adminlanding() {
		return "adminlanding";
	}
	
	
	
}

package com.mindtree.controller.SpringBootApp;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableAutoConfiguration
@Controller

public class HomeController1 {
	
	@RequestMapping(value = "/")
	public String serveBase() {
		System.out.println("\nhello\n");
		String result = "Hello World!";

		return "one";
	}
	
	
	

	}



package com.cher.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@RequestMapping("/")
	public String home() {
		return "<h1>Hello Human</h1>";
	}
	
	@RequestMapping("/name")
	public String name(@RequestParam(value="q", required=false) String name, String last) {
		if(name == null && last == null) {
			return "You did not put your name.";
		} else {
			return "Hello " + name + " " + last;
		}
	}
	

}

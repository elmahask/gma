package com.gma.assistance.gma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/")
public class IndexController {

	@GetMapping({"/","/index","/home"})
	public String index() {
		return "index/index";
	}

	@GetMapping("/about")
	public String about() {
		return "index/about";
	}
	
	@GetMapping("/login")
	public String login() {
		return "index/login";
	}
}

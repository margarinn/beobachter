package com.sateumami.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@GetMapping("/test1")
	@ResponseBody
	public String printHello() {
		return "Hello";
	}
}

package com.sateumami.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@GetMapping("/test1")
	@ResponseBody
	public String printHello() {
		return "hello";
	}
	
	@GetMapping("/learnmore.html")
	public String printLearnMore() {
		return "learnmore";
	}
	
	@GetMapping("/index")
	public String indexing() {
		return "index";
	}
	
	@GetMapping("/thankyou")
	public String thankYou() {
		return "thanks";
	}
}

package com.sateumami.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sateumami.model.FeedbackModel;

@Controller
public class MainController {
	@GetMapping("/test1")
	@ResponseBody
	public String printHello() {
		return "why are we even here? just to suffer?";
	}
	
	@GetMapping("/learnmore")
	public String printLearnMore() {
		return "learnmore";
	}
	
	@GetMapping("/login")
	public String adminLogin() {
		return "Login";	
	}
	
	@GetMapping("/index")
	public String indexing() {
		return "index";
	}
	
	@PostMapping("/feedback")
	public String userFeedback(@ModelAttribute FeedbackModel feedback ) {
		System.out.println(feedback.toString());
		return "thanks";
	}
	
	@GetMapping("/edit")
	public String editing() {
		return "EditMenu";
	}
	
	@GetMapping("/admin")
	public String beAdmin() {
		return "DashboardAdmin";
	}
	
	@GetMapping("/feedbacks")
	public String feedbacks() {
		return "menufeedback";
	}
	
}

package com.sateumami.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sateumami.model.FeedbackModel;
import com.sateumami.model.LoginModel;

@Controller
public class MainController {
	@GetMapping("/test1")
	public String printHello() {
		return "home";
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
	
	@PostMapping("/admin")
	public String beAdmin(@ModelAttribute LoginModel login) {
		return "DashboardAdmin";
	}
	
	@GetMapping("/readmin")
	public String gotoAdmin() {
		return "DashboardAdmin";
	}
	
	@GetMapping("/feedbacks")
	public String feedbacks() {
		return "menufeedback";
	}
	
}

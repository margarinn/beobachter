package com.sateumami.controllers;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sateumami.feedbacks.Feedback;
import com.sateumami.feedbacks.FeedbackService;

@RestController
@RequestMapping("/api/v1/feedbacks")
public class FeedbackController {
	@Autowired
	private FeedbackService feedbackService;
	
	@GetMapping
	public ResponseEntity<List<Feedback>> getAllFeedbacks(){
		return new ResponseEntity<List<Feedback>>(feedbackService.allFeedbacks(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Feedback>> getSingleFeedback(@PathVariable ObjectId id){
		return new ResponseEntity<Optional<Feedback>>(feedbackService.singleFeedback(id), HttpStatus.OK);
	}

	
}

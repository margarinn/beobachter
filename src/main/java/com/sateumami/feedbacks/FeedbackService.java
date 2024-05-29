package com.sateumami.feedbacks;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService {
	@Autowired
	private FeedbackRepository feedbackRepository;

	public List<Feedback> allFeedbacks(){
		return feedbackRepository.findAll();
	}
	
	public Optional<Feedback> singleFeedback(ObjectId id){
		return feedbackRepository.findById(id);
	}
		
}

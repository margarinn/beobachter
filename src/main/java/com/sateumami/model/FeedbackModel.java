package com.sateumami.model;

public class FeedbackModel {
	
	private String Feedback;

	public String getFeedback() {
		return Feedback;
	}

	public void setFeedback(String feedback) {
		this.Feedback = feedback;
	}

	@Override
	public String toString() {
		return "Feedback [Feedback=" + Feedback + "]";
	}

	
	
}
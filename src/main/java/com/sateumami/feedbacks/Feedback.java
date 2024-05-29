package com.sateumami.feedbacks;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;



@Document(collection = "feedbacks")
public class Feedback {
	
	@Id
	private ObjectId id;
	
	private String feedback;

	public ObjectId getid() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	
}

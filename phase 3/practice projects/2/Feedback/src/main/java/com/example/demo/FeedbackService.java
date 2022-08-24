package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service    
public class FeedbackService {

	
	@Autowired    
	private FeedbackRepository fr;   
	
	public void addFeedback(FeedbackEntity fe)  
	{    
	fr.save(fe);    
	
	}  
	
}

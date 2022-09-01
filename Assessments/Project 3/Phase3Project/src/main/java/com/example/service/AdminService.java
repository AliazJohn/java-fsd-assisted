package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Admin;
import com.example.entity.Questions;
import com.example.entity.Quiz;

import com.example.repo.AdminRepo;
import com.example.repo.QuestionRepo;
import com.example.repo.QuizRepo;

@Service
public class AdminService {
	@Autowired
	private QuestionRepo questionRepo;
	
	@Autowired
	private QuizRepo quizRepo;
	
	@Autowired
	private AdminRepo adminRepo;
	
	//Add questions
	public Questions addQuestions(Questions question) {
		return questionRepo.save(question);
		
	}
	
	public Quiz addQuiz(Quiz quiz) {
		return quizRepo.save(quiz);
		
	}
	//by  id
	public Questions QuestionsById(int id) {
		if(questionRepo.findById(id).isPresent()) {
			return questionRepo.findById(id).get();
		}
		else {
			return null;
		}
		
	}
	
	//login
	public String adminlogin(Admin a) {
	       if(adminRepo.findByEmail(a.getEmail())!=null) {
	    	   if(adminRepo.findByPassword(a.getPassword())!=null) {
	    		   return "login success";
	    	   }else {
	    		   return "login failure";
	    	   }
	           
	       }
	       else
	    	   return "login failure";
	    }

}

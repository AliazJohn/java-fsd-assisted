package com.example.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.entity.score;
import com.example.entity.UserQuiz;
import com.example.entity.Questions;
import com.example.repo.UQuizRepo;
import com.example.repo.UserRepo;
import com.example.repo.quizResultRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo userRepo;
	
	
	public User addUser(User user) {
		return userRepo.save(user);
	}
	
	
	@Autowired
    private AdminService adminService;
	
	@Autowired
	private UQuizRepo uquizRepo;
	
	@Autowired
	private quizResultRepo quizResRepo;
	
	
	
	public UserQuiz addUserQuiz(UserQuiz userquiz) {
		//score s= new score();
		Questions qs = adminService.QuestionsById(userquiz.getQid());
		if(quizResRepo.findByEmail(userquiz.getEmail())!=null) {
			score s= quizResRepo.findByEmail(userquiz.getEmail());
			s.setEmail(userquiz.getEmail());
			s.setQuizid(userquiz.getQuizid());
			if(userquiz.getAnswers().equals(qs.getCorrectOpt())) {
				s.setScore(s.getScore()+1);
			}
			quizResRepo.save(s);
		}
		else {
			score s= new score();
			s.setEmail(userquiz.getEmail());
			s.setQuizid(userquiz.getQuizid());
			if(userquiz.getAnswers().equals(qs.getCorrectOpt())) {
				s.setScore(s.getScore()+1);
			}
			quizResRepo.save(s);
		}
		
		return uquizRepo.save(userquiz);
	}
	
	
	public String userlogin(User us) {
	       if(userRepo.findByEmail(us.getEmail())!=null) {
	    	   if(userRepo.findByPasswd(us.getPasswd())!=null) {
	    		   return "login success";
	    	   }else {
	    		   return "login failure";
	    	   }
	           
	       }
	       else
	    	   return "login failure";
	    }


	public score getScore(String email) {
		if(quizResRepo.findByEmail(email)!=null) {
			score s= quizResRepo.findByEmail(email);
			return s;
		}
		else {score s= quizResRepo.findByEmail(email);
		return s;}
			
	}
	
}

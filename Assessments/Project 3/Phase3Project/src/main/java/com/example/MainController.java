package com.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Admin;
import com.example.entity.Questions;
import com.example.entity.Quiz;
import com.example.entity.User;
import com.example.entity.UserQuiz;
import com.example.entity.score;
import com.example.service.AdminService;
import com.example.service.UserService;

@RestController
@RequestMapping("/api")
public class MainController {

	/*@RequestMapping("/")
    public String hello(){
        return "Hello World";
    }

    @RequestMapping("/protected")
    public String protectedHello(){
        return "Hello World, i was protected";
    }

    @RequestMapping("/admin")
    public String admin(){
        return "Hello World from admin";
    }*/
    
    @Autowired
    private AdminService adminService;
    @PostMapping("/addquestion")
    public ResponseEntity<Questions> addQuestions(@RequestBody Questions q){
    	Questions questions = adminService.addQuestions(q);
    	if(questions!=null)
    		return new ResponseEntity<Questions>(questions, HttpStatus.CREATED);
    	else
    		return new ResponseEntity<Questions>(questions, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    @PostMapping("/addquiz")
    public ResponseEntity<Quiz> addQuiz(@RequestBody Quiz qz){
    	Quiz quiz = adminService.addQuiz(qz);
    	if(quiz!=null)
    		return new ResponseEntity<Quiz>(quiz, HttpStatus.CREATED);
    	else
    		return new ResponseEntity<Quiz>(quiz, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    
    @Autowired
    private UserService userService;
    @PostMapping("/usersignup")
    public ResponseEntity<User> addUser(@RequestBody User u){
    	User user = userService.addUser(u);
    	if(user!=null)
    		return new ResponseEntity<User>(user, HttpStatus.CREATED);
    	else
    		return new ResponseEntity<User>(user, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    
    @PostMapping("/userquiz")
    public ResponseEntity<UserQuiz> addUserQuiz(@RequestBody UserQuiz uq){
    	UserQuiz userquiz = userService.addUserQuiz(uq);
    	if(userquiz!=null)
    		return new ResponseEntity<UserQuiz>(userquiz, HttpStatus.CREATED);
    	else
    		return new ResponseEntity<UserQuiz>(userquiz, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    
    @GetMapping("/{id}")
	public ResponseEntity<Questions> QuestionsById(@PathVariable int id){
    	Questions questions = adminService.QuestionsById(id);
		if(questions!=null)
			return new ResponseEntity<Questions>(questions,HttpStatus.FOUND);
		else
			return new ResponseEntity<Questions>(questions,HttpStatus.NOT_FOUND);
	}
    
    @GetMapping(value = "getscore/{email}",produces = MediaType.APPLICATION_JSON_VALUE) 
	public score getScore(@PathVariable("email") String email) {
		return userService.getScore(email);
	}
    
    
    @PostMapping(value = "userlogin")
	public String UserLogin(@RequestBody User u) {
		return userService.userlogin(u);
	}
    
    @PostMapping(value = "adminlogin")
	public String AdminLogin(@RequestBody Admin a) {
		return adminService.adminlogin(a);
	}

}
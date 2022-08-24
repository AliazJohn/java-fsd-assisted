package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
@Autowired    
private FeedbackService fs;  
@ResponseBody
@RequestMapping(method = {RequestMethod.POST, RequestMethod.GET}, value = "feedback")
public String addFeedback(@RequestParam String name, @RequestParam String email, @RequestParam String feed)  {
	FeedbackEntity fe = new FeedbackEntity();
	fe.setName(name);
	fe.setEmail(email);
	fe.setFeedback(feed);
	
	fs.addFeedback(fe);  
return "success";
}

   

}
package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.User;
import com.service.UserService;

@Controller
@RequestMapping
public class UserController {
	
	@Autowired
	UserService userservice;
	
	//load adduser form
	@GetMapping("addUser")
	public String addUser() {
		return "AddUser";
	}
	
	//save user
	@PostMapping("insertUser")
	public String insertUser(@ModelAttribute("insertUser") User user) {
		userservice.addUser(user);
		return "redirect:/userReport";
		
	}
	
	//load user data
		@GetMapping("userReport")
		public String loadUser(Model m)
		{
			m.addAttribute("User", userservice.getAllUser());
			m.addAttribute("title", "User Report");
			
			return "UserReport";
		}
		
		
		//load edit form
		 
		@GetMapping("/editUser/{id}")
		public String loadEditForm(@PathVariable(value="id") Long id, Model m)
		{
			User usr=userservice.getUserById(id);
			
			System.out.println(usr);
			m.addAttribute("user", usr);
			m.addAttribute("title", "Edit User");
			
			return "EditUser";
			
		}
		
		
		
		@PostMapping("/editUser/updateUser")
		public String updateEmp(@ModelAttribute("updateUser") User user)
		{
			userservice.updateUser(user);
			
			return "redirect:/userReport";
			
		}
		
		
		
		
		@GetMapping("/deleteUser/{id}")
		public String deleteUser(@PathVariable Long id)
		{
			userservice.deleteUser(id);
			
			
			return "redirect:/userReport";
		}
}

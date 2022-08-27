package com.phase3.demo;

public class userController {
	public String authenticate(String email, String password) {
		if(email.equals("aliyas@mail.com")&&password.equals("123pass"))
		return "success";
		else
			return "failure";
	}
	
	public userDao setUser() {
userDao user = new userDao();
user.setEmail("aliyas@mail.com");
user.setPassword("123pass");
return user;
	}
	public userDao setUserName() {
		userDao user = new userDao();
		user.setEmail("aliyas@mail.com");
		
		return user;
			}
	public userDao setUserPassword() {
		userDao user = new userDao();
		user.setPassword("123pass");
		return user;
			}
	public userDao setNewUser(){
		userDao user = new userDao();
		user.setEmail("ron@mail.com");
		user.setPassword("6589");
		return user;		
	}

}

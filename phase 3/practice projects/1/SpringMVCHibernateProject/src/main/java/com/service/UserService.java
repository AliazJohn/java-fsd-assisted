package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bean.User;
import com.dao.Userdao;

@Component
@Service
public class UserService {
	
	@Autowired
	Userdao userdao;
	
	//add user
	public void addUser(User usr) {
		userdao.addUser(usr);
	}
	
	//get all user
	public List<User> getAllUser(){
		return userdao.getAllUser();
	}
	
	//get user by id
	public User getUserById(Long id) {
		return userdao.getUserById(id);
	}
	
	//update User
	public void updateUser(User usr) {
		userdao.updateUser(usr);
	}
	
	//delete User
	public void deleteUser(Long id) {
		userdao.deleteUser(id);
	}
}

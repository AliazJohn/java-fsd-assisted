package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.bean.User;

@Component
public class Userdao {
	
	@Autowired
	HibernateTemplate hiberneteTemplate;
	
	//add user
	@Transactional
	public void addUser(User usr) {
		hiberneteTemplate.save(usr);
	}
	
	//get all user
	public List<User> getAllUser(){
		return hiberneteTemplate.loadAll(User.class);
	}
	
	//get user by id
	@Transactional
	public User getUserById(Long id) {
		User usr = hiberneteTemplate.get(User.class, id);
		return usr;
	}
	
	//update user
	@Transactional
	public void updateUser(User usr) {
		hiberneteTemplate.update(usr);
	}
	
	//delete user
	@Transactional
	public void deleteUser(Long id) {
		hiberneteTemplate.delete(hiberneteTemplate.load(User.class, id));
	}
}

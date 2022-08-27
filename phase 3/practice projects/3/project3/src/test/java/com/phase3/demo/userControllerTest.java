package com.phase3.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;


import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class userControllerTest {
	private userController u;
	private userDao usrdao;
	@BeforeEach
	void setUp() throws Exception {
		u = new userController();
		usrdao=new userDao();
		System.out.println("started");
	}

	@AfterEach
	void tearDown() throws Exception {
		//u=null;
		//usrdao=null;
		System.out.println("test completed!");
	}

	@Test
	@DisplayName("Valid User Testing")
	void userTest() {
		usrdao=u.setUser();
		assertEquals(u.authenticate(usrdao.getEmail(), usrdao.getPassword()), "success");
		
	}
	
	@Test
	@DisplayName("No password testing")
	void usernameTest() {
		usrdao=u.setUserName();
		assertEquals(u.authenticate(usrdao.getEmail(), usrdao.getPassword()), "success");
	}
	
	@Test
	@DisplayName("No email Testing")
	void userpasswordTest() {
		usrdao=u.setUserPassword();
		assertEquals(u.authenticate(usrdao.getEmail(), usrdao.getPassword()), "success");
	}
	
	
	@Test
	@DisplayName("invalid User Testing")
	void newUserTest() {
		usrdao=u.setNewUser();
		assertEquals(u.authenticate(usrdao.getEmail(), usrdao.getPassword()), "failure");
	}
	

}

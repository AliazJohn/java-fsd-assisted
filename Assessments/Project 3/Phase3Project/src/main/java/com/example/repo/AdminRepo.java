package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Admin;


@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer>{
	public Admin findByEmail(String email);
	public Admin findByPassword(String password);
}
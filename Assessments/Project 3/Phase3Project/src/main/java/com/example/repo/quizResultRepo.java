package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.score;

@Repository
public interface quizResultRepo extends JpaRepository<score, Integer>{
	public score findByEmail(String email);
}

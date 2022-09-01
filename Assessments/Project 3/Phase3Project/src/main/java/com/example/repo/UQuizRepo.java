package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.UserQuiz;

@Repository
public interface UQuizRepo extends JpaRepository<UserQuiz, Integer>{

}
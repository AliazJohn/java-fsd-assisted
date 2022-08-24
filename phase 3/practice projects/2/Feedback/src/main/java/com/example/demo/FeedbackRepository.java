package com.example.demo;


import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface FeedbackRepository extends CrudRepository<FeedbackEntity, String>   

{    
}    

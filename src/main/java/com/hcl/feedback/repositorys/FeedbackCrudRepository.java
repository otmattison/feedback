package com.hcl.feedback.repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hcl.feedback.model.Feedback;

@Repository
public interface FeedbackCrudRepository extends CrudRepository<Feedback, Integer>{

}
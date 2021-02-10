package com.hcl.feedback.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.feedback.model.Feedback;
import com.hcl.feedback.repositorys.FeedbackCrudRepository;

@RestController
@RequestMapping("feedback")
public class FeedbackController {
	
	@Autowired
	FeedbackCrudRepository repo;
	

	@PostMapping("save")
	public Feedback save(@RequestBody Feedback feedback) {
		
		return  repo.save(feedback);
	}
	 
	@GetMapping("/show/{id}")
	public Optional<Feedback> show(@PathVariable int id) {
		Optional<Feedback> feedback = repo.findById(id);
			return feedback;
		
		
	}
}

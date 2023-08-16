package com.cg.tripadvisor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.tripadvisor.dto.Review;
import com.cg.tripadvisor.service.ReviewService;

@RestController
@RequestMapping("api/v1/review")
public class ReviewController {
	
	@Autowired
	ReviewService reviewService;
	
	@PostMapping("/add")
	public ResponseEntity<Review> addReview(@RequestBody Review review){
		return new ResponseEntity<Review>(reviewService.save(review),HttpStatus.OK);
	}
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<Review> getById(@PathVariable int id){
		return new ResponseEntity<Review>(reviewService.getById(id),HttpStatus.OK);
	}
	

}

package com.cg.tripadvisor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.tripadvisor.dao.ReviewRepository;
import com.cg.tripadvisor.dto.Review;

@Service
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	ReviewRepository repository;
	@Override
	public Review save(Review review) {
		return repository.save(review);
	}

}

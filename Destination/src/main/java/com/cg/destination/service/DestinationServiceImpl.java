package com.cg.destination.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cg.destination.dao.DestinationRepository;
import com.cg.destination.dto.Destination;
import com.cg.destination.dto.Review;
import com.cg.destination.feignClient.ReviewFeign;

@Service
public class DestinationServiceImpl implements DestinationService {

	@Autowired
	DestinationRepository destinationRepository;
	
	@Autowired
	ReviewFeign feign;
	
	@Autowired 
	RestTemplate template;

	@Override
	public Destination addDestination(Destination destination) {
		// TODO Auto-generated method stub
		return destinationRepository.save(destination);
	}

	@Override
	public List<Review> searchReviewByDestination(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Destination> searchDestinationByRating(int rating) {
		// TODO Auto-generated method stub
		List<Destination> destinations = destinationRepository.findAll();
		return destinations.stream().filter(p -> p.getRating() == rating).collect(Collectors.toList());
	}

	@Override
	public Destination assignReviewToDestination(int reviewId, int destinationId) {
		// TODO Auto-generated method stub
		Review review=feign.getById(reviewId);
		System.out.println(review);
//		Review review=template.getForObject("http://localhost:2022/api/v1/review/getById/"+reviewId, Review.class);
//		System.out.println(review);
		Destination destination=destinationRepository.findById(destinationId).get();
		destination.setReviews(review.getId());
		return destinationRepository.save(destination);
	}

}

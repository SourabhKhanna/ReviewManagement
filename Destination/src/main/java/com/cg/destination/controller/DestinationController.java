package com.cg.destination.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.destination.dto.Destination;
import com.cg.destination.dto.Review;
import com.cg.destination.service.DestinationService;

@RestController
@RequestMapping("/api/v1/destintaion")
public class DestinationController {
	
	@Autowired
	DestinationService destinationService;
	
	
	@PostMapping("/addDestination")
	public ResponseEntity<Destination> addDestination(@RequestBody Destination destination ){
		return new ResponseEntity<Destination>(destinationService.addDestination(destination),HttpStatus.OK);
	}
	
	@GetMapping("/getByCity/{city}")
	public ResponseEntity<List<Review>> searchReviewByDestination(@PathVariable String city){
		return new ResponseEntity<List<Review>>(destinationService.searchReviewByDestination(city),HttpStatus.OK);
	}
	
	@GetMapping("/getByRating/{rating}")
	public ResponseEntity<List<Destination>> searchDestinationByRating(@PathVariable int rating){
		return new ResponseEntity<List<Destination>>(destinationService.searchDestinationByRating(rating),HttpStatus.OK);
	}
	
	@PostMapping("/assignReview/{reviewId}/{destinationId}")
	public ResponseEntity<Destination> assignReviewToDestination(@PathVariable int reviewId , @PathVariable int destinationId){
		return new ResponseEntity<Destination>(destinationService.assignReviewToDestination(reviewId,destinationId),HttpStatus.OK);
	}
	

}

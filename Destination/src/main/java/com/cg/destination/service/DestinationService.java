package com.cg.destination.service;

import java.util.List;

import com.cg.destination.dto.Destination;
import com.cg.destination.dto.Review;

public interface DestinationService {
	public Destination addDestination(Destination destination);
	public List<Review> searchReviewByDestination(String city);
	public List<Destination> searchDestinationByRating(int rating);
	public Destination assignReviewToDestination(int reviewId , int destinationId);

}

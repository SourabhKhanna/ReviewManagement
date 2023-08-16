package com.cg.tripadvisor.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.tripadvisor.dto.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer> {

}

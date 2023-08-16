package com.cg.destination.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cg.destination.dto.Review;

@FeignClient(name = "review-service", url = "localhost:2022/api/v1/review")
public interface ReviewFeign {
	@GetMapping("/getById/{id}")
	public Review getById(@PathVariable int id);

}

package com.cg.tripadvisor.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class Review {
	
	@Id
	private int id;
	private String description;
	@OneToOne
	private Reviewer reviewer;
}

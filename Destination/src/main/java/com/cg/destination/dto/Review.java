package com.cg.destination.dto;

import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Review {
	
	private int id;
	private String description;
	@Transient
	private Reviewer reviewer;
	

}

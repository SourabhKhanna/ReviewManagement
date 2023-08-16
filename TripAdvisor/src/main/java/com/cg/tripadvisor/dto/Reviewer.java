package com.cg.tripadvisor.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class Reviewer {
	
	@Id
	private int id;
	private String name;
	private String email;

}

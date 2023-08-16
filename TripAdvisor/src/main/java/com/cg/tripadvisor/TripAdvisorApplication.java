package com.cg.tripadvisor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TripAdvisorApplication {

	public static void main(String[] args) {
		SpringApplication.run(TripAdvisorApplication.class, args);
	}

}

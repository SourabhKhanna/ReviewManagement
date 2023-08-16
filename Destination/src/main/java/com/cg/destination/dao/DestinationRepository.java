package com.cg.destination.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.destination.dto.Destination;

public interface DestinationRepository extends JpaRepository<Destination, Integer> {

}

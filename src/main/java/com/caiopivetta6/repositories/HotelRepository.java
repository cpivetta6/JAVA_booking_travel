package com.caiopivetta6.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiopivetta6.domain.Address;
import com.caiopivetta6.domain.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {

	
	
}

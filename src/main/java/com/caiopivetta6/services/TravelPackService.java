package com.caiopivetta6.services;

import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caiopivetta6.domain.TravelPack;
import com.caiopivetta6.repositories.TravelPackRepository;

@Service
public class TravelPackService {
	
	@Autowired
	private TravelPackRepository repository;
	
	public TravelPack find(Integer id) {
		
		Optional<TravelPack> obj = repository.findById(id);
		
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Object not found! Id: " + id + ", Tipo: " + TravelPack.class.getName()));

	}
}

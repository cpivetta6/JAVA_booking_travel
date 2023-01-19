package com.caiopivetta6.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caiopivetta6.domain.TravelPack;
import com.caiopivetta6.service.TravelPackService;

@RestController
@RequestMapping(value = "/rent")
public class TravelPackResource {
	
	@Autowired
	private TravelPackService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<TravelPack> findById (@PathVariable Integer id) {
		
		TravelPack obj = service.find(id);
		
		return ResponseEntity.ok().body(obj);
	}
	
}



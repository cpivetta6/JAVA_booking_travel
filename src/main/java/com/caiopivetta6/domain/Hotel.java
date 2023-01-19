package com.caiopivetta6.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "hotel_tb")
public class Hotel implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private double dailyPrice;
	
	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name = "city")
	private City city;
	
	@JsonBackReference
	@OneToMany(mappedBy = "hotel")
	private List<TravelPack> travelPack = new ArrayList<>();
	
	public Hotel() {
		
	}

	public Hotel(Integer id, String name, double dailyPrice, City city) {
		super();
		this.id = id;
		this.name = name;
		this.dailyPrice = dailyPrice;
		this.city = city;
	}
	
	

	public List<TravelPack> getTravelPack() {
		return travelPack;
	}

	public void setTravelPack(List<TravelPack> travelPack) {
		this.travelPack = travelPack;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDailyPrice() {
		return dailyPrice;
	}

	public void setDailyPrice(double dailyPrice) {
		this.dailyPrice = dailyPrice;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hotel other = (Hotel) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}

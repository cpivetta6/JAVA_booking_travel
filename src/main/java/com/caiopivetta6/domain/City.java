package com.caiopivetta6.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "city_tb")
public class City implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	
	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name = "state_id")
	private State state;
	
	@JsonIgnore
	@OneToMany(mappedBy = "city")
	private List<Hotel> hotels = new ArrayList<>();
	
	@JsonManagedReference
	@OneToMany(mappedBy = "city")
	private List<Ristorant> ristorants = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "city")
	private List<TravelPack> travelPacks = new ArrayList<>();
	
	public City() {
		
	}

	public City(Integer id, String name, State state) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
	}
	
	
	
	
	public List<Ristorant> getRistorants() {
		return ristorants;
	}

	public void setRistorants(List<Ristorant> ristorants) {
		this.ristorants = ristorants;
	}

	public List<TravelPack> getTravelPacks() {
		return travelPacks;
	}

	public void setTravelPacks(List<TravelPack> travelPacks) {
		this.travelPacks = travelPacks;
	}

	public List<Hotel> getHotels() {
		return hotels;
	}

	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
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
		City other = (City) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}

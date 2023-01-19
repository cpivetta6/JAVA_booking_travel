package com.caiopivetta6.domain;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

public class TravelPack implements Serializable {

	
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Instant date;
	private Integer days;
	
	private City city;
	
	private Hotel hotel;
	
	private Ristorant ristorant;

	public TravelPack() {
		
	}

	public TravelPack(Integer id, Instant date, Integer days) {
		super();
		this.id = id;
		this.date = date;
		this.days = days;
	}
	
	

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Ristorant getRistorant() {
		return ristorant;
	}

	public void setRistorant(Ristorant ristorant) {
		this.ristorant = ristorant;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Instant getDate() {
		return date;
	}

	public void setDate(Instant date) {
		this.date = date;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
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
		TravelPack other = (TravelPack) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}

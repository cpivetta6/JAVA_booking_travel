package com.caiopivetta6.domain;

import java.io.Serializable;
import java.util.Objects;

public class Hotel implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private double dailyPrice;
	
	public Hotel() {
		
	}

	public Hotel(Integer id, String name, double dailyPrice) {
		super();
		this.id = id;
		this.name = name;
		this.dailyPrice = dailyPrice;
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

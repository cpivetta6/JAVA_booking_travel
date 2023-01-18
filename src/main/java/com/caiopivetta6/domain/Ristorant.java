package com.caiopivetta6.domain;

import java.io.Serializable;
import java.util.Objects;

public class Ristorant implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private double priceMeal;
	
	public Ristorant() {
		
	}

	public Ristorant(Integer id, String name, double priceMeal) {
		super();
		this.id = id;
		this.name = name;
		this.priceMeal = priceMeal;
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

	public double getPriceMeal() {
		return priceMeal;
	}

	public void setPriceMeal(double priceMeal) {
		this.priceMeal = priceMeal;
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
		Ristorant other = (Ristorant) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}

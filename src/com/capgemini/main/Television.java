package com.capgemini.main;

import java.util.Objects;

public class Television {
	
	private String company;
	private String type;
	private boolean ThreeDEnabled;
	private double price;
	
	
	
	public Television() {
		super();
		
	}



	public Television(String company, String type, boolean threeDEnabled, double price) {
		super();
		this.company = company;
		this.type = type;
		ThreeDEnabled = threeDEnabled;
		this.price = price;
	}



	public String getCompany() {
		return company;
	}



	public void setCompany(String company) {
		this.company = company;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public boolean getThreeDEnabled() {
		return ThreeDEnabled;
	}



	public void setThreeDEnabled(boolean threeDEnabled) {
		ThreeDEnabled = threeDEnabled;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash(company,type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if(obj instanceof Television) {
			return false;
		}
		
		
		Television tv = (Television) obj;
		if(this.company==tv.company && this.type==tv.type && this.price==tv.price) {
			return true;
		}
	
		return false;
	}

	

}

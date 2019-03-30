package com.capgemini.main;

import java.util.Objects;

public class School {
	

	private String name;
	private String city;
	private String schoolDistrict;
	private String greatSchoolRanking;
	
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}

	public School(String name, String city, String schoolDistrict, String greatSchoolRanking) {
		super();
		this.name = name;
		this.city = city;
		schoolDistrict = schoolDistrict;
		this.greatSchoolRanking = greatSchoolRanking;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSchoolDistrict() {
		return schoolDistrict;
	}

	public void setSchoolDistrict(String schooldistrict) {
		schoolDistrict = schooldistrict;
	}

	public String getGreatSchoolRanking() {
		return greatSchoolRanking;
	}

	public void setGreatSchoolRanking(String greatSchoolRanking) {
		this.greatSchoolRanking = greatSchoolRanking;
	}
	
	
	@Override
	public int hashCode() {
		
		return Objects.hash(name,city,schoolDistrict);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if(obj instanceof School) {
			return false;
		}
		
		
		School school = (School) obj;
		if(this.name==school.name && this.city==school.city && this.schoolDistrict==school.schoolDistrict) {
			return true;
		}
	
		return false;
	}
	

}

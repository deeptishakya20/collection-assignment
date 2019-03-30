package com.capgemini.main;

import java.util.Objects;

public class Student implements Comparable<Student> {
	
	private int rollNumber;
	private String studentName;
	private int studentAge;
	private String city;
	private int contactNumber;
	private String studentFavoriteFruit;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNumber, String studentName, int studentAge, String city, int contactNumber,String studentFavoriteFruit) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.city = city;
		this.contactNumber = contactNumber;
		this.studentFavoriteFruit = studentFavoriteFruit;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public  String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	
	public String getStudentFavoriteFruit() {
		return studentFavoriteFruit;
	}

	public void setStudentFavoriteFruit(String studentFavoriteFruit) {
		this.studentFavoriteFruit = studentFavoriteFruit;
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash(rollNumber,studentFavoriteFruit);
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if(obj instanceof Student) {
			return false;
		}

		Student student = (Student) obj;
		if(this.rollNumber==student.rollNumber) {
			return true;
		}
	
		return false;
	}

	@Override
	public int compareTo(Student s) {
		return  this.studentName.compareTo(s.studentName);
	}
	
	
}


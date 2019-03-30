package com.capgemini.main;

import java.util.Comparator;
import java.util.Objects;

public class Car implements Comparable<Car> {

	private String make;
	private String model;
	private int year;
	private double price;

	public Car() {
		super();

	}

	public Car(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return year;
	}

	public void setPrice(double year) {
		this.price = price;
	}

	@Override
	public int hashCode() {

		return Objects.hash(make, model);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (obj instanceof Car) {
			return false;
		}

		Car car = (Car) obj;
		if (this.make == car.make && this.model == car.model) {
			return true;
		}

		return false;
	}

	// Comparable<Car> c=(o)->this.make.compareTo(o.make);

	@Override
	public int compareTo(Car o) {
		return this.make.compareTo(o.make);

	}

}

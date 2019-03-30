package com.capgemini.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.main.Car;

public class TestCar {
	private static Car suzuki;
	private static Car wagonr;
	private static Car chevrolet;

	@BeforeClass
	public static void setUp() {

		suzuki = new Car("India", "swift", 1996, 500000);
		wagonr = new Car("USA", "Maruti", 1995, 700000);
		chevrolet = new Car("Europe", "Chevy", 2005, 560000);
	}

	@Test
	public void testWheatherItIsAcceptingDuplicates() {
		HashSet<Car> set = new HashSet<Car>();
		set.add(suzuki);
		set.add(wagonr);
		set.add(chevrolet);
		assertEquals(3, set.size());

	}

	@Test
	public void testWheatherTheOrderIsMaintained() {
		ArrayList<Car> array = new ArrayList<Car>();
		array.add(suzuki);
		array.add(wagonr);
		array.add(chevrolet);
		Iterator<Car> iterator = array.iterator();

		assertEquals("India", iterator.next().getMake());
		assertEquals("USA", iterator.next().getMake());
		assertEquals("Europe", iterator.next().getMake());
	}

	@Test
	public void testWheatherItIsInSortedOrderOrNot() {

		TreeSet<Car> tree = new TreeSet<Car>();
		tree.add(suzuki);
		tree.add(wagonr);
		tree.add(chevrolet);
		Iterator<Car> iterator = tree.iterator();

		assertEquals("Europe", iterator.next().getMake());
		assertEquals("India", iterator.next().getMake());
		assertEquals("USA", iterator.next().getMake());
	}

	@AfterClass
	public static void teerDown() {
		suzuki = null;
		wagonr = null;
		chevrolet = null;
	}
}
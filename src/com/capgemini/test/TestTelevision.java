package com.capgemini.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import com.capgemini.main.Television;

public class TestTelevision {

	private static Television sony;
	private static Television samsung;
	private static Television cisco;

	@BeforeClass
	public static void setUp() {
		sony = new Television("Sony", "LCD", true, 50000);
		samsung = new Television("Samsung", "LED", true, 75000);
		cisco = new Television("Cisco", "Plasma", false, 30000);

	}

	@Test
	public void testWheatherItIsAcceptingDuplicates() {
		HashSet<Television> set = new HashSet<Television>();
		set.add(sony);
		set.add(samsung);
		set.add(cisco);

		assertEquals(3, set.size());

	}

	public void testWheatherTheOrderIsMaintained() {
		ArrayList<Television> array1 = new ArrayList<Television>();
		array1.add(sony);
		array1.add(samsung);
		array1.add(cisco);

		Iterator<Television> iterator = array1.iterator();
		assertEquals("Sony", iterator.next().getCompany());
		assertEquals("Samsung", iterator.next().getCompany());
		assertEquals("Cisco", iterator.next().getCompany());
	}

	
	@AfterClass
	public static void teerDown() {
		sony = null;
		samsung = null;
		cisco = null;
	}
}

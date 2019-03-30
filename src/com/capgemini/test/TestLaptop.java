package com.capgemini.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.main.Laptop;

public class TestLaptop {
	
	private static Laptop lenovoLaptop;
    private static Laptop dellLaptop;
	private static Laptop hpLaptop;
	
	@BeforeClass
	public static void setUp() {
		lenovoLaptop=new Laptop("Lenovo","dragon","windows 8","i5");
		dellLaptop=new Laptop("Dell","Inspiron 5558","windows 10","i7");
		hpLaptop=new Laptop("HP","NoteBook","windows 10","i5");
		
	}
	@Test
	public void testWheatherItIsAcceptingDuplicates() {
		HashSet<Laptop> set=new HashSet<Laptop>();
		set.add(lenovoLaptop);
		set.add(dellLaptop);
		set.add(hpLaptop);
		
		assertEquals(3,set.size());
		
	}
	@Test
	public void testWheatherTheOrderIsMaintained() {
		ArrayList<Laptop> array1=new ArrayList<Laptop>();
		array1.add(lenovoLaptop);
		array1.add(dellLaptop);
		array1.add(hpLaptop);
		
		Iterator<Laptop> iterator=array1.iterator();
		assertEquals("Lenovo", iterator.next().getCompany());
		assertEquals("Dell", iterator.next().getCompany());
		assertEquals("HP", iterator.next().getCompany());
	}
	

	@AfterClass
	public static void teerDown() {
		lenovoLaptop=null;
		dellLaptop=null;
		hpLaptop=null;
	}
	
}

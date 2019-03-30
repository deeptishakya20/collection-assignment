package com.capgemini.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.main.CellPhone;


public class TestCellphone {
	
	private static CellPhone redmi;
	private static CellPhone samsung;
	private static CellPhone nokia;
	
	

	@BeforeClass
	public static void setUp() {
		redmi=new CellPhone("Mi","note5","12MP rear camera CMOS image sensor, dual LED flash, Touch to focus "," Android 8.1.0",14000);
		samsung=new CellPhone("Samsung","js4","Sensible Styling,Multitask with Ease","Tizen", 25000);
		nokia=new CellPhone("Nokia","grand","5.25 inch HD TFT LCD Screen","Kitkate",35000);
		
	}
	@Test
	public void testWheatherItIsAcceptingDuplicates() {
		HashSet<CellPhone> set=new HashSet<CellPhone>();
		set.add(redmi);
		set.add(samsung);
		set.add(nokia);
		
		assertEquals(3,set.size());
		
	}
	@Test
	public void testWheatherTheOrderIsMaintained() {
		ArrayList<CellPhone> array1=new ArrayList<CellPhone>();
		array1.add(redmi);
		array1.add(samsung);
		array1.add(nokia);
		
		Iterator<CellPhone> iterator=array1.iterator();
		assertEquals("Mi", iterator.next().getCompany());
		assertEquals("Samsung", iterator.next().getCompany());
		assertEquals("Nokia", iterator.next().getCompany());
	}
	
	@AfterClass
	public static void teerDown() {
		redmi=null;
		samsung=null;
		nokia=null;
	}
	
	

}

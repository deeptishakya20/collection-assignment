package com.capgemini.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.main.CellPhone;
import com.capgemini.main.School;

public class TestSchool {

	private static School dps;
	private static School stFrancis;
	private static School ips;

	@BeforeClass
	public static void setUp() {
		dps=new School("Delhi Public School","Delhi","Huzur","A+");
		stFrancis=new School("St Francis School","Bhopal","Raza", "B");
		ips=new School("International Public School","Pune","Kunar","A");
		
	}
	@Test
	public void testWheatherItIsAcceptingDuplicates() {
		HashSet<School> set=new HashSet<School>();
		set.add(dps);
		set.add(stFrancis);
		set.add(ips);
		
		assertEquals(3,set.size());
		
	}
	@Test
	public void testWheatherTheOrderIsMaintained() {
		ArrayList<School> array1=new ArrayList<School>();
		array1.add(dps);
		array1.add(stFrancis);
		array1.add(ips);
		
		Iterator<School> iterator=array1.iterator();
		assertEquals("A+", iterator.next().getGreatSchoolRanking());
		assertEquals("B", iterator.next().getGreatSchoolRanking());
		assertEquals("A", iterator.next().getGreatSchoolRanking());
	}
	
	@AfterClass
	public static void teerDown() {
		dps=null;
		stFrancis=null;
		ips=null;
	}
	

}

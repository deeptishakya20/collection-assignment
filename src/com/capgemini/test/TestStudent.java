package com.capgemini.test;

import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.main.Student;

public class TestStudent {

	private static Student student1;
	private static Student student2;
	private static Student student3;

	
	@BeforeClass
	public static void setUp() {
		student1=new Student(17,"Jhon",23,"London",89886786,"Apple");
		student2=new Student(14,"Marry",22,"Bristol",876577812,"Grapes");
		student3=new Student(19,"Joy",20,"Sydney",67683976,"Watermelon");
		
	}

	@Test
	public void testWhetherTheOrderIsMaintained() {
		ArrayList<Student> array1=new ArrayList<Student>();
		array1.add(student1);
		array1.add(student2);
		array1.add(student3);
		
		Iterator<Student> iterator=array1.iterator();
		assertEquals(17, iterator.next().getRollNumber());
		assertEquals(14, iterator.next().getRollNumber());
		assertEquals(19, iterator.next().getRollNumber());
	}
	
	@Test
	public void testWhetherThenaturalOrderIsMaintained() {
		TreeSet<Student> tree=new TreeSet<Student>();
		tree.add(student1);
		tree.add(student2);
		tree.add(student3);
		
		Iterator<Student> iterator = tree.iterator();

		assertEquals("Jhon", iterator.next().getStudentName());
		assertEquals("Joy", iterator.next().getStudentName());
		assertEquals("Marry", iterator.next().getStudentName());
		
	}
	
	@Test
	public void testGetFruitNameWithTheirKeyValue(){
		HashMap<String, String> map=new HashMap<String, String>();
		map.put(student1.getStudentName(),"Apple");
		map.put(student2.getStudentName(),"Grapes");
		map.put(student3.getStudentName(),"Watermelon");
		
		assertEquals("Apple",map.get(student1.getStudentName()));
		assertEquals("Grapes",map.get(student2.getStudentName()));
		assertEquals("Watermelon",map.get(student3.getStudentName()));
		
		assertTrue(map.values().contains("Apple"));
		assertTrue(map.values().contains("Grapes"));
		assertTrue(map.values().contains("Watermelon"));
		assertFalse(map.values().contains("Jhon"));
		assertFalse(map.values().contains("Marry"));
		assertFalse(map.values().contains("Joy"));
		
		
		assertTrue(map.keySet().contains("Jhon"));
		assertTrue(map.keySet().contains("Marry"));
		assertTrue(map.keySet().contains("Joy"));
		assertFalse(map.keySet().contains("Apple"));
		assertFalse(map.keySet().contains("Grapes"));
		assertFalse(map.keySet().contains("Watermelon"));
		
		
		
		
		
		
	}
	
	
	
	
}

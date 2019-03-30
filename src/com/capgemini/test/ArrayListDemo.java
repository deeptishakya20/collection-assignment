package com.capgemini.test;
import java.util.ArrayList;
import java.util.Iterator;

import java.util.Iterator;

public class ArrayListDemo {
	
	public static void main(String args[]) {
		
		ArrayList<String> names=new ArrayList();
		names.add("Bob");
		names.add("Anna");
		Iterator<String> it = names.iterator();
		while(it.hasNext()){
			String name=it.next();
			System.out.println(name);
		}
	}

	
}



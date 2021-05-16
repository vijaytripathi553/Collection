package com.live.interview;

import java.util.HashMap;
import java.util.Map;

public class HashMapSearchKeyDemo {
	private static Map<Integer,String> searchParticularKeyInMap(Map<Integer,String>courses)
	{
		if(courses.containsKey(5))
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}
				
				
		return courses;
	}

	public static void main(String[] args) {
		// Creating map
		Map<Integer, String> courses=new HashMap<Integer,String>();
		courses.put(1, "Core Java");
		courses.put(2, "Advance Java");
	    courses.put(3, "Spring MVC");
		courses.put(4, "Hibernate");
		
		Map<Integer, String> total=HashMapSearchKeyDemo.searchParticularKeyInMap(courses);
		System.out.println(total);
		
		

	}

}

package com.live.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertListToSet {

	public static void main(String[] args) {
		// Creating one list
		List<String> list=new ArrayList<String>();
		//Inserting some elements into list
		list.add("C");
		list.add("C++");
		list.add("Java");
		list.add("Python");
		list.add("Node.js");
		// printing List element
		System.out.println("ArrayList before Conversion:"+list);
		
		
		// converting the above v=created list into set. So first creating one set of type string
		Set<String> set=new HashSet<String>(list);   // Passing object of ArryList into parameter which will convert the list objects int set
		// Trying to print set object 
		System.println("List is converted into Set");
		System.out.println(set);
		
		
		

	}

}

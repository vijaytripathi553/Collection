package com.log2base2.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnsupportedOperationExceptionSolution {
	

	private static List<Integer> arrayToArrayList(Integer[] array1) 
	{
		//🔴 STEP 1: Conversion from Array to ArrayList
		List<Integer> list=Arrays.asList(array1);  // Now, This is the fixed size list. You can't add/remove element from it.
													
		//list.add(100);	// If you will try to add/remove element it will raise 🔴UnsupportedOperationException🔴 
		
		//🔴 STEP 2: To fix this problem we have created new list in which first will add to list and afterwards will be able to add / remove element in this list
		
		List<Integer> newList=new ArrayList<>();
		
		newList.addAll(list);
		
		//🔴 STEP 3: Now we can add and even delete elements fromthis list
		newList.add(23);
		newList.add(456);
		newList.remove(0);
		
		
		
		
		
		return newList;
	}
	
	// Main Method
	public static void main(String[] args) {
		Integer array1[]=new Integer[] {10,20,30,40};
		
		List<Integer> result=arrayToArrayList(array1);
		System.out.println(result);
	}


}

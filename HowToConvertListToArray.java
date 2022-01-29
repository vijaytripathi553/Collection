package com.bosscoder.stackworkshop;

import java.util.*;

public class HowToConvertListToArray {
	// Main Method
	public static void main(String[] args) {
		int array1[]=new int[] {1,6,4,10,2,5};
		
		int result[]=convertListToArray(array1);
		System.out.println(Arrays.toString(result)); 
	}

	// Method to Convert list into array
	private static int[] convertListToArray(int[] array1)
	{
		List<Integer> list=new ArrayList<Integer>();
		
		for (int i = 0; i < array1.length; i++) 
		{
			// Adding element to list
			list.add(array1[i]);
		}
		int displayArray[]=display(list);
		
		return displayArray;
	}

	// Method to display Array Element
	private static int[] display(List<Integer> list)
	{

		int[] array5 = new int[list.size()];
		
		for (int i = 0; i < list.size(); i++) 
		{
			array5[i]=list.get(i);
			//System.out.println(list.get(i));
			// This is how we initialize the array after declaration
			//array5 = new int[] { list.get(i) };
		}
		return array5;
	}
}

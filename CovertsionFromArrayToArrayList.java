package com.log2base2.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CovertsionFromArrayToArrayList
{
	
	private static List<int[]> convertArrayToList(int[] array1)
	{
		//List<String[]> arrayToList=Arrays.asList(array1);
		
		//STEP 1: Converting An Array to List
		List<int[]> arrayToList=Arrays.asList(array1);
		
		List<int[]> newl=new ArrayList<>();
		newl.addAll(arrayToList);
		
		//newl.remove(3);
//		arrayToList.add(10);
		
		for(int [] s:newl)
		{
			for (int i = 0; i < s.length; i++)
			{
				System.out.print(s[i]+" ");
				
			}
		}
		
		
		
		//STEP 2: After Conversition lets iterate over the list
		
		for (int i = 0; i < arrayToList.size(); i++) 
		{
//			return arrayToList;
//			System.out.println(arrayToList.get(i));
			
		}
		
		
		
		return null;
	}
	// Main method
	public static void main(String[] args) {
		//String array1[]=new String[] {"abc","PQR","xyz"};
		int array1[]=new int[] {3,4,5};
		
		List<int[]> result=convertArrayToList(array1);
		System.out.println(result);
		
		
	}
}

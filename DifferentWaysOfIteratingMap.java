package com.live.interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DifferentWaysOfIteratingMap {
	
	
	// Iterating map through Iterator
	private static Map<String,String> iterateMapThroughIterator(Map<String,String> capital){
		//System.out.println(capital);
		Iterator<Map.Entry<String,String>>itr=capital.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<String,String> entry=itr.next();
			System.out.println("Key:"+entry.getKey()+" Values:"+entry.getValue());
		}
		
		return capital;
	}
	
	// Iterating map through keySet
		private static Map<String,String> iterateMapThroughKeySet(Map<String,String> capital){
			//System.out.println(capital);
			Iterator<String>itr1=capital.keySet().iterator();
			while(itr1.hasNext())
			{
				String findingKey=itr1.next();   // Now ,we got key and stored within a findingKey variable
				System.out.print("Keys are:"+findingKey+" ");
				System.out.print("Values are:"+capital.get(findingKey));
				System.out.println();
			}
			
			return capital;
		}
		
		//Iterate map through lambda expression
		private static void iterateMapThroughLambdaExpression(Map<String,String> capital){
			capital.forEach((k,v)->System.out.print(k+""+v));
			
		}
		
		// Iterate map through Stream API
		private static void iterateMapThroughStreamAPI(Map<String,String> capital){
			capital.entrySet().stream().forEach(e->System.out.println(e.getKey()+" "+e.getValue()));
			
			
		}


	public static void main(String[] args) {
		Map<String,String> capital=new HashMap<String,String>();
		capital.put("IND", "New Delhi");
		capital.put("ENG", "London");
		capital.put("US", "Canada");
		//DifferentWaysOfIteratingMap.iterateMapThroughIterator(capital);
		//DifferentWaysOfIteratingMap.iterateMapThroughKeySet(capital);
		//DifferentWaysOfIteratingMap.iterateMapThroughLambdaExpression(capital);
		DifferentWaysOfIteratingMap.iterateMapThroughStreamAPI(capital);
		
		

	}

}

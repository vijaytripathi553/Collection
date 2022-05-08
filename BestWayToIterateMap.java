package com.live.interview;

import java.util.HashMap;
import java.util.Map;


//🟢🟢This program is all about the iterating map through for each loop
public class BestWayToIterateMap 
{
	
	// Method to iterate map
	private static Map<String, String> bestWayToIterateMap(Map<String,String> country)
	{
		for(Map.Entry<String, String> map:country.entrySet())
		{
			String key=map.getKey();
			String value=map.getValue();
			System.out.println(key);
			System.out.println(value);
			
		}
		return country;
	}
	
	
	// Main Method
	public static void main(String[] args) {
		Map<String,String> country=new HashMap<String,String>();
		
		country.put("IND", "India");
		country.put("US", "United State");
		country.put("AUD", "Austrailia");
		
		Map<String ,String> result=bestWayToIterateMap(country);
		System.out.println(result);
	}

}
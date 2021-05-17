package com.live.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertListToMapStudent {
	// Private data members of Student class
	private int id;
	private String firstName;
	private String lastName;
	private String Email;
	
	// Constructor to initialise the data members of a class
	 ConvertListToMapStudent(int id,String firstName,String lastName,String Email)
	{
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.Email=Email;
	}
	 
	 
	 public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	@Override
	public String toString() {
		return "ConvertListToMapStudent [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", Email="
				+ Email + "]";
	}

	// Main Method
	 public static void main(String[] args) {
		 
		 // 1st Approach- We can create the object of the class then we create one list. No to that list we pass the object of the class to store data on list.
		 ConvertListToMapStudent c=new ConvertListToMapStudent(10, "Ram", "Tripathi", "ram@gmail.com");
		 // Creating one list to store Student Attributes
		//List<ConvertListToMapStudent> stud=new ArrayList<ConvertListToMapStudent>();
		//stud.add(c);
		//System.out.println(stud);
		
		//2nd Approach- Insted of creting the object of the class seperately during list cretion we can create it by passing the same as a arguement to the list .
		List<ConvertListToMapStudent> stud=new ArrayList<ConvertListToMapStudent>();
		stud.add(new ConvertListToMapStudent(101, "Omkar", "Pandit", "omkarpanditji@gmail.com")); 
		System.out.println(stud);
		
		// Now in order to convert this list into map we have to create one map
		Map<Integer,String>map=new HashMap<Integer,String>();
		//After creating map we have to iterate the list time one by one and then move those item into map
		for (ConvertListToMapStudent st : stud) {
			map.put(st.getId(), st.getFirstName());
			System.out.println(map);
			
		}
		
		
	 }
	
		 
	}
		


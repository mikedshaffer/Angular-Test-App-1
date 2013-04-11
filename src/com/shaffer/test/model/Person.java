package com.shaffer.test.model;

public class Person 
{
	String lastName;
	String firstName;
	
	public Person(String firstName, String lastName) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
}

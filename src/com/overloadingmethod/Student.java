package com.overloadingmethod;

public class Student 
{	
	public static void main(String[] args) 
	{
		Details d = new Details();
		d.getDetails("Privith", 9951080952l, "Hyderabad");
		System.out.println("**********");
		d.getDetails("Privith", "privithsadhu1108@gmail.com", 9951080952l, "Hyderabad", "Telangana");
	}

}

class Details
{
	public void getDetails(String name, long mobile, String city) 
	{
		System.out.println("Name : " + name);
		System.out.println("Mobile : " + mobile);
		System.out.println("City : " + city);
	}
	
	public void getDetails(String name, String email, long mobile, String city, String state) 
	{
		System.out.println("Name : " + name);
		System.out.println("Email : " + email);
		System.out.println("Mobile : " + mobile);
		System.out.println("City : " + city);
		System.out.println("State : " + state);
		
	}
	
}





package com.overridding;

public class SampleOne 
{

	public static void main(String[] args) 
	{
		B b = new B();
		b.fun();
		
	}
	
}

class A
{
	public int x = 100;
	public void fun() 
	{
		System.out.println("Basic Class Method");
		
	}
	
}
class B extends A
{
	public int x = 200;
	public void fun() 
	{
		System.out.println(x);
		//System.out.println(super.x);
		System.out.println("Derived Class Method");
		super.fun();
	}
}



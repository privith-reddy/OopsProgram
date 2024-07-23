package com.memberclass;

public class SampleOne 
{

	public static void main(String[] args)
	{
		Sample s = new Sample();
		System.out.println(s.x);
		System.out.println(Sample.y);
		
		s.m1();
		Sample.m2();



	}

	
}

class Sample
{
	public int x = 100;
	public static  int y = 200;
	public void m1() 
	{
		System.out.println("Instance");
	}
	public static void  m2() 
	{
		System.out.println("Static");
	}
	
}





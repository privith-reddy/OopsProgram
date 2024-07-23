package com.overridding;

public class SampleThree {

	public static void main(String[] args) 
	{
		Der d = new Der();
		System.out.println(d.x);
		d.f1(10);
		Der.f2("Hi", 20);
		
		Base b = new Base();
		System.out.println(b.x);
		b.f1(20);
		Base.f2("Hi", 20);
		

	}

}
//Example of over-riding and hiding

class Base
{
	public int x = 100;
	public void f1(int x) 
	{
		System.out.println("Hello");
	}
	public static void f2(String s, int i) 
	{
		System.out.println("Base");
		
	}
}

class Der extends Base
{
	public int x = 200;
	public void f1(int x) 
	{
		System.out.println("Hi");
	}
	public static void f2(String s, int i) 
	{
		System.out.println("Derived");
		
	}
	
}
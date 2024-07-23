package com.overloadingmethod;

public class SampleOne 
{

	public static void main(String[] args) 
	{
		A a = new A();
		
		int res1 = a.m1();
		System.out.println(res1);
		
		int res2 = a.m1(10);
		System.out.println(res2);
		
		int res3 = a.m1(10, "Hello");
		System.out.println(res3);
		
		int res4 = a.m1("Hello", 10);
		System.out.println(res4);
	

	}

}

class A
{
	public int m1() 
	{
		return 100;
	}
	public int m1(int i) 
	{
		return 200;
	}
	public int m1(int i, String s) 
	{
		return 300;
	}
	public int m1(String s, int i) 
	{
		return 400;
	}
}




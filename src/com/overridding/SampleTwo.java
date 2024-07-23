package com.overridding;

public class SampleTwo 
{

	public static void main(String[] args) 
	{
		ScientificCalc sc = new ScientificCalc();
		
		int res1 = sc.add(10, 20);
		System.out.println("Addition : " + res1);
		
		int res2 = sc.mul(20, 10);
		System.out.println("Multiplication : " + res2);
		
		int res3 = sc.sub(20, 10);
		System.out.println("Substraction : " + res3);
		
		float res4 = sc.div(10, 5);
		System.out.println("Division : " + res4);
		
		int res5 = sc.cube(2);
		System.out.println("Cube : " + res5);
		
		int res6 = sc.square(2);
		System.out.println("Square : " + res6);
		
		
	}
}

class BasicCalc
{
	public int add(int i, int j) 
	{
		return i + j;
		
	}
	public int mul(int i, int j) 
	{
		return i * j;
		
	}
	public int sub(int i, int j) 
	{
		return i - j;
		
	}
	public float div(float i, float j) 
	{
		return i / j;
		
	}
}

class ScientificCalc extends BasicCalc
{
	public int cube(int i) 
	{
		return i * i * i;
		
	}
	public int square(int i) 
	{
		return i * i;
		
	}
}







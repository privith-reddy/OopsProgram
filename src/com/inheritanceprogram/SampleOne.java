package com.inheritanceprogram;

public class SampleOne 
{

	public static void main(String[] args)
	{
		N n = new N();
		System.out.println(n.x);
		System.out.println(n.y);

	}

}


class M
{
	public int x = 10; 
}
class N extends M
{
	public int y = 20;
}






package com.inheritanceprogram;

public class SampleTwo 
{

	public static void main(String[] args) 
	{
		B b = new B();
		System.out.println(b.j);
		System.out.println(b.i);
		D d = new D();
		System.out.println(d.l);
		System.out.println(d.i);
		System.out.println(d.j);
		C c = new C();
		System.out.println(c.k);
		System.out.println(c.i);
		System.out.println(d.j);
	}

}
class A
{
	public int i = 200;
}
class B extends A
{
	public int j = 300;
}
class C extends B
{
	public int k = 400;
}
class D extends B
{
	public int l = 500;
}






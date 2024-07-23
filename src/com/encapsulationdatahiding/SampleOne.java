package com.encapsulationdatahiding;

public class SampleOne 
{
	public static void main(String[] args) 
	{
		Bank b = new Bank();
		int bal1 =b.getMoney(1234);
		System.out.println("Berfore Mod: " +bal1);
		
		
		b.setMoney(50000, 1234);
		int bal2 = b.getMoney(1234);
		System.out.println("After Mod: " + bal2);
		
		
		
	}
}

class Bank
{
	//private variable can be accessed with in declared class
	private int money = 10000;
	
	public int getMoney(int passcode) 
	{
		if(passcode == 1234) 
		{
			return money;
		}
		else 
		{
			return 0;
			
		}
		
	}
	public void setMoney(int m, int passcode) 
	{
		if(passcode == 1234) 
		{
			money = m;
		}
		
		else 
		{
			System.out.println("Incorrect passcode try again ");
			
		}
	}
	
}




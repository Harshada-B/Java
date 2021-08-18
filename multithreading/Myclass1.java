package com.yash.multithreading;

public class Myclass1 implements Runnable
{
	@Override
	public void run() 
	{

		try
		{
			System.out.println("my thread is running");
			int a=10,b=19,c;
			c=a+b;
			c=a-b;
			System.out.println("Addition is"+c);
			Thread.sleep(2000);
			System.out.println("subtraction is"+c);

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String args[])
	{
		Myclass1 m1=new Myclass1();
		Thread t1=new Thread(m1);
		t1.start();
	}

}

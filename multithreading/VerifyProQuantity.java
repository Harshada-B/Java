package com.yash.multithreading;

public class VerifyProQuantity extends Thread
{
	public synchronized void verifyproductquality(String pquality)
	{
		System.out.println("the product quality is verified::"+pquality);

	}
	public void run()
	{
		 verifyproductquality("Good");
	}
}

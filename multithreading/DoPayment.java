package com.yash.multithreading;

public class DoPayment extends Thread
{
	public synchronized void dopayment(int payment)
	{
		System.out.println("payment done::"+payment);
	}
	public void run()
	{
		dopayment(1200);
	}
}

package com.yash.multithreading;

public class PrintReceipt extends Thread
{
	public synchronized void printreceipt(String print)
	{
		System.out.println("Recepiet printed::"+print);
	}
	public void run()
	{
		printreceipt("printed");
	}
}

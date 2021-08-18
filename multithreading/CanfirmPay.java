package com.yash.multithreading;

public class CanfirmPay extends Thread
{
	public synchronized void canfirmpay(String canfirm)
	{
		System.out.println("payment canfirmed::"+canfirm);
	}
	public void run()
	{
		canfirmpay("payment canfirmed");
	}
}

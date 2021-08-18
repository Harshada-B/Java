package com.yash.arrays;

public class TestArray 
{
	public static boolean cantains(int[] arr,int item)
	{
		for(int n:arr)
		{
			if(item==n)
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String args[])
	{
		int [] year= {1999,2000,2001,2003,2005,2020};
		System.out.println(cantains(year,2000));
		System.out.println(cantains(year,2021));
	}
}

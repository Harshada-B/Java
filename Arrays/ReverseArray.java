package com.yash.arrays;

public class ReverseArray 
{
	public static void main(String args[])
	{
		int [] array1= {1,2,3,4,5};
		int [] array2= new int [array1.length];
		for(int i=0;i<array2.length;i++)
		{
			array2[i]=array1[array1.length -1-i];
			System.out.println("array1 " + i + " is now " + array2[i]);
		}
	}
}

package com.yash.arrays;

public class Array 
{

	public static void main(String args[])
	{
		int [] rollno= {1,2,3,4,5,6,7,8,9,10};
		System.out.println(rollno.length);
		//print array using for loop
		for(int i=0;i<rollno.length;i++)
		{
			System.out.println(rollno[i]);
		}
		//print array in reverse oreder
		System.out.println("array in reverese order");
		for(int i=rollno.length -1;i>=0;i--)
		{
			System.out.println(rollno[i]);
		}
		//print array using for loop
		System.out.println("element in array using foreach loop");
		for(int element:rollno)
		{
			System.out.println(element);
		}
	}

}

package com.yash.arrays;

public class DuplicateArray
{
	public static void main(String args[])
	{
		String [] product={"mobile","bags","laptop","mobile","laptop"};
		System.out.println("The Duplicate elements from array are:");
		for(int i=0;i<product.length;i++)
		{
			for(int j=i+1;j<product.length;j++)
			{
				if(product[i].equals(product[j]))
				{
					System.out.println(product[i]);
				}
			}
		}
	}
}

package com.yash.arrays;
import java.util.Arrays;
public class SortArray
{
	public static void main(String args[])
	{
		String [] product={"mobile","bags","laptop","mobile","laptop"};
		System.out.println("array before sorting: " + Arrays.toString(product));
		Arrays.sort(product);
		System.out.println("array after sorting:" +Arrays.toString(product));
	}
}

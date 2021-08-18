package com.yash.arrays;

public class ReverseSwap 
{
	public static void main(String args[])
	{
		String rang="harry";
		System.out.println("original String:"+rang);
		String reversed=inPlaceReverse(rang);
		System.out.println("reversed String:"+reversed);
	}

	private static String inPlaceReverse(String input) 
	{
		final StringBuilder builder = new StringBuilder(input);
		int length = builder.length();
		for(int i=0;i<length/2;i++)
		{
			final char Current = builder.charAt(i);
			final int otherEnd = length-i-1;
			builder.setCharAt(i, builder.charAt(otherEnd));
			builder.setCharAt(otherEnd, Current);

		}
		return builder.toString();
	}


}

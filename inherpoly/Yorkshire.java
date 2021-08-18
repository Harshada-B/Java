package com.yash.inheritance;

public class Yorkshire extends Dog
{
	public static int breedWeight1=78;
	public Yorkshire(String d_name) {
		super(d_name);
		// TODO Auto-generated constructor stub
	}
	public int avgBreedWeight()
	{
		return breedWeight1;
	}
	public String getD_Name()
	{
		return super.getD_name();
	}
}

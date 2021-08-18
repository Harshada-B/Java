package com.yash.inheritance;

public class Labrador extends Dog
{
	private String color;
	private static int breedWeight=85; 
	public Labrador(String d_name,String color) {
		super(d_name);
		// TODO Auto-generated constructor stub
	}
	public static int avgBreedWeight()
	{
		return breedWeight;	
	}
	public String speak()
	{
		return "Tuffy";
		
	}

}

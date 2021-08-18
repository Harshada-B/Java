package com.yash.inheritance;

public class DogTest
{
	public static void main(String args[])
	{
		Dog d=new Dog("speak");
		System.out.println("name of dog :"+d.speak());
		Labrador l=new Labrador(null, null);
		l.avgBreedWeight();
		System.out.println("Labrador weight::"+l.avgBreedWeight()+ "Name::"+l.speak());
		
		Yorkshire y=new Yorkshire(null);
		y.avgBreedWeight();
		System.out.println("yorkshire weight::"+y.avgBreedWeight());
		
	}
}

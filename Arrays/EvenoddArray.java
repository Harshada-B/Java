package com.yash.arrays;
import java.util.Scanner;
public class EvenoddArray 
{

	public static void main(String Args[])
	{
		int Num_Count=20;
		Scanner sc=new Scanner(System.in);
		// accept array and declare array for even and odd no
		int [] array=new int[Num_Count];
		int [] even=new int[Num_Count];
		int [] odd=new int[Num_Count];

		//for loop for entering num upto 20
		System.out.println("Enter 20 numbers:");
		for(int i=0;i<Num_Count;i++)
		{
			array[i]=sc.nextInt();
		}
		int a=0,b=0;
		for(int i=0;i<Num_Count;i++)
		{
			if(array[i]%2==0)
				even[a++] = array[i];
			else
				odd[b++] = array[i];
		}
		System.out.println("Even Numbers:");
		for (int i = 0; i < a; i++)
		{
			System.out.print(even[i] + " ");
		}

		System.out.println("\nOdd Numbers:");
		for (int i = 0; i < b; i++)
		{
			System.out.print(odd[i] + " ");
		}
	}

}

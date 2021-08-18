package Assignment1;
import java.util.Scanner;
public class Primeno 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=sc.nextInt();
		int temp=0;
		for(int i=2;i<n-1;i++)
		{
			if(n%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp>0)
		{
			System.out.println("no is not prime");
		}
		else
		{
			System.out.println("no is prime");
		}
	}

}

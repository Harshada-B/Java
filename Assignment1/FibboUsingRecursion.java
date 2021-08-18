package Assignment1;
import java.util.Scanner;
public class FibboUsingRecursion
{
	static int a=0,b=1,c;
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		FibboUsingRecursion obj=new FibboUsingRecursion();
		obj.Series(n);
	}
	void Series(int i)
	{
		if(i>=1)
		{
			c=a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
			Series(i-1);
		}

	}
}

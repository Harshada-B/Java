package Assignment1;
import java.util.Scanner;
public class CheckPower 
{
	public static void main(String args[])
	{
		int n=0;
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number:");
			n=sc.nextInt();
			boolean powerOfTwo = CheckNumberispoweroftwo(n);
			if(powerOfTwo)

				System.out.println(n +"is power of two");
			else
				System.out.println(n +"is not power of two");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static  boolean CheckNumberispoweroftwo(int number)
	{
		return(number > 0) && ((number & (number -1))==0);
	}
}

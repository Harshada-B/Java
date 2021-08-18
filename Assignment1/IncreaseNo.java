package Assignment1;
import java.util.Scanner;
public class IncreaseNo {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		IncreaseNo obj=new IncreaseNo();
		obj.CheckNumber();
	}
	static void CheckNumber()
	{
		int num = 0;
		int Digit=num % 10;
		num=num/10;
		boolean flag = false;
		while(num>0)
		{
			if(Digit<=num % 10)
			{
				flag=true;
				break;
			}
			Digit=num % 10;
		}
		if(flag)
		{
			System.out.println("Digits are not in increasing order:");
		}
		else
		{
			System.out.println("Digits are increasing order:");
		}


	}

}

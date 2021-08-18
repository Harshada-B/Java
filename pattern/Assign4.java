package pattern;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Assign4 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double pay=sc.nextDouble();
		sc.close(); 

		NumberFormat inFormat=NumberFormat.getCurrencyInstance(new Locale("en","in"));
		String india=inFormat.format(pay);
		System.out.println("India::"+india);
	}
}

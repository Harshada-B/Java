package pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assign3 
{
public static void main(String args[])
{
	String str="one 9two4 three7 four1five";
	
	System.out.println("String::one 9two4 three7 four1five");
	String reg1="([0-9]+)";
	Pattern p1=Pattern.compile(reg1);
	String reg2="([a-z]+)";
	Pattern p2=Pattern.compile(reg2);
	
	Matcher m1=p1.matcher(str);
	Matcher m2=p2.matcher(str);
	System.out.println("Digits in string are:");
	while(m1.find())
	{
		System.out.println(m1.group()+"");
	}
	System.out.println("words in string are:");
	while(m2.find())
	{
		System.out.println(m2.group()+"");
	}
}
}

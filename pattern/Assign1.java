package pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assign1
{
	public static boolean isValidLandlineNo(String str)  
	{  
	 
	Pattern ptrn = Pattern.compile("(0|91)?[0-9][0-9]{9}");
	Matcher match = ptrn.matcher(str);  
	return (match.find() && match.group().equals(str));  
	}  
	  
	public static void main(String args[])  
	{       
	String str = "0787392349";  
	if (isValidLandlineNo(str))  
	System.out.println("It is a valid mobile number.");   
	else  
	System.out.println("Entered mobile number is invalid.");      
	}  
}

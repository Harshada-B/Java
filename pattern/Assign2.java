package pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assign2 
{
	private static boolean isValidAdharNo(String str) {
		String regex="^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$";
		Pattern p= Pattern.compile(regex);
		if(str==null)
		{
			return false;
		}
		Matcher m=p.matcher(str);
		return m.matches();
	}
	public static void main(String args[])
	{
		String s1="3646 2598 7893";
		System.out.println(isValidAdharNo(s1));
		
		String s2="36461-2598-7893";
		System.out.println(isValidAdharNo(s2));
		
		String s3="364-2598-7893";
		System.out.println(isValidAdharNo(s3));
		
		String s4="0646-2598-7893";
		System.out.println(isValidAdharNo(s4));
		
		String s5="3646-02598-789";
		System.out.println(isValidAdharNo(s5));
	}


}

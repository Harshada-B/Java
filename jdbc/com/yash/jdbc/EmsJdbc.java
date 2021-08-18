package com.yash.jdbc;

import java.util.Scanner;
import java.util.logging.Logger;

public class EmsJdbc 
{
	static Logger logger=Logger.getAnonymousLogger();
	public static void main(String args[])
	{
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("select your choice:");
			System.out.println("1: Get All Employee detail");
			System.out.println("2: insert employee record");
			System.out.println("3: update employee record");
			System.out.println("4: delete record");
			System.out.println("5: exit");
			i=sc.next();
			switch(i)
			{
			case 1:
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

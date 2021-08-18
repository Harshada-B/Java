package com.yash.inheritance;

import java.util.Arrays;

public class Bank 
{
public static void main(String args[])
{
	Account[] acc=new Account[2];
	acc[0]=new SavingAccount(78675,0.25);
	acc[1]=new CurrentAccount(45415,4000);
	
	System.out.println(Arrays.toString(acc));
}
}

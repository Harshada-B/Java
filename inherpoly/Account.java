package com.yash.inheritance;

public class Account
{
private double balance;
private int Acc_no;
public Account(int a)
{
	balance=0;
	Acc_no=123;
}
public void deposit(double sum)
{
	if(sum>0)
		balance=sum;
	else 
		System.out.println("Account.deposit::"+"can not deposite negative amount:");
}
public void withdraw(double sum)
{
	if(sum>0)
		balance=sum;
	else 
		System.out.println("Account.withdraw::"+"can not withdraw negative amount:");
}
public double getBalance()
{
	return balance;
}
public double getAccountNumber()
{
	return Acc_no;
}
@Override
public String toString() {
	return "Account [balance=" + balance + ", Acc_no=" + Acc_no + "]";
}
public final void print()
{
	System.out.println(toString());
}
}

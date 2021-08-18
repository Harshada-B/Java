package com.yash.inheritance;

public class SavingAccount extends Account 
{

	private double interest;

	public SavingAccount(int Acc_no,double interest) {
		super(Acc_no);
		this.interest=interest;
		// TODO Auto-generated constructor stub
	}
	public double getInterest()
	{
		double x=getBalance()+getBalance()*interest;
		return x;

	}
public void AddInterest(double interest)
{
	double x=super.getBalance()*interest;
	super.deposit(x);
}
@Override
public String toString() {
	return "SavingAccount [interest=" + interest + "]";
}

}

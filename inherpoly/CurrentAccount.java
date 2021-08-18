package com.yash.inheritance;

public class CurrentAccount extends Account
{

	private double limit;

	public CurrentAccount(int Acc_no,double limit) {
		super(Acc_no);
		this.limit=limit;
		// TODO Auto-generated constructor stub
	}
	public double getlimit()
	{
		return this.limit;
	}
public void setLimit(double limit)
{
	if(limit<=this.limit)
		super.withdraw(limit);
	else
		System.out.println("sorry,limit Exceeded");
}
@Override
public String toString() {
	return "CurrentAccount [limit=" + limit + "]";
}

}

package com.yash.inheritance;

public class PersonEmployee 
{
public static void main(String args[])
{
	Person p=new Person();
	p.setName("Harshada");
	p.setAddress("pune");
	
	employee e=new employee();
	e.setjoinyear(2021);
	e.setInsuranceNum("drfgt67456");
	e.salary(50000);
	System.out.println("Name::"+p.getName());
	System.out.println("year of joining::"+e.getjoinyear);
	System.out.println("Insurance Number::"+e.getInsuranceNum());
	System.out.println("Salary::"+e.getsalary());
}
}

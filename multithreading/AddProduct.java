package com.yash.multithreading;

import java.util.ArrayList;
import java.util.List;

public class AddProduct extends Thread 
{
/*static List<Product> list= AddProduct.addproducts();
public static List<Product> addproducts() 
{
	list.add(new Product(1,"laptop",1,48798));
	return list;
}
public void run()
{
	addproducts();
}*/
	public synchronized void addproduct(String product)
	{
		System.out.println("the product is added::"+product);

	}
	public void run()
	{
		 addproduct("added");
	}
}

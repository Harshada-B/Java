package com.yash.multithreading;

import java.util.ArrayList;
import java.util.List;

public class ProductList extends Thread
{
	/*static List<Product> list1= AddProduct.addproducts();
	public static List<Product> getListOfProduct() 
	{
		return list1;
	}
	/*public synchronized void productlist(String product)
	{
		System.out.println(product);

	}
	public void run()
	{
		getListOfProduct();
	}*/
	public synchronized void productlist(String productlist)
	{
		System.out.println("the product list ::"+productlist);

	}
	public void run()
	{
		 productlist("laptop");
	}
}

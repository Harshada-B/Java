package com.yash.multithreading;

public class ProductMain 
{
	public static void main(String args[])
	{
		ProductList p=new ProductList();
		AddProduct ap=new AddProduct();
		VerifyProQuantity pq=new VerifyProQuantity();
		DoPayment dp=new DoPayment();
		CanfirmPay cp=new CanfirmPay();
		PrintReceipt pr=new PrintReceipt();
		p.start();
		ap.start();
		pq.start();
		dp.start();
		cp.start();
		pr.start();
		
	}
}

package com.infogain.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infogain.DAO.ProductDAOImpl;
import com.infogain.Exception.ProductInHandError;
import com.infogain.bean.Product;

public class ClientCode {

	Scanner sc=new Scanner(System.in);
	Product product;
	ProductDAOImpl productDAOImpl;
	public static void main(String[] args) {
		ClientCode c=new ClientCode();
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/infogain/res/spring-conf.xml");
		c.product=(Product)ctx.getBean("product");
		c.productDAOImpl=(ProductDAOImpl)ctx.getBean("productDAOBean");
		
		try{
		   c.enterData();
		}
		catch(Exception e)
		{
			
		}
	}
	
	public void enterData() throws Exception
	{		
		while(true)
		{
			System.out.println("Select an option");
			System.out.println("\n0.Exit \n1.Add Product \n2.Search Product \n3.Update Product");
			int choice=Integer.parseInt(sc.nextLine());
			
			switch(choice)
			{
			case 0 :
				System.exit(0);
				break;
			case 1:
				   addProduct();
				break;
			case 2:
				  serachProduct();
				break;
			case 3:
				 updateProduct();
				break;
			default:
				System.out.println("Please select a suitable option");
			}
		}//end while
	}//end enterData
	
	public void addProduct() throws Exception
	{
		
		
		
		System.out.println("Enter product Id");
		int pId=Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter product name");
		String productName=sc.nextLine();
		
		System.out.println("Enter Product cost");
		int productCost=Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Quantity in hand");
		int quantityInHand=Integer.parseInt(sc.nextLine());
		
		Product p=new Product(pId, productName, productCost, quantityInHand);
		
		
			p.validateQuality(p);
		
		if(quantityInHand >= 1)
		{
			
			productDAOImpl.addProduct(p);
		}
		
		
	}//end addProduct
	
	public void updateProduct()
	{
		System.out.println("Enter product Id you want to update");
		int pId=Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter total units sold");
		int unitSold=Integer.parseInt(sc.nextLine());
		
	    boolean result=productDAOImpl.updateProduct(pId, unitSold);
	    
	    if(result)
	    {
	    	System.out.println("Product wiht PID="+pId+" is updated");
	    }
	    else
	    {
	    	System.out.println("Product wiht PID="+pId+" is not updated");
	    }
	}//end updateProduct
	
	public void serachProduct()
	{
		System.out.println("Enter Product id to be searched");
		int pId=Integer.parseInt(sc.nextLine());
		Product p=productDAOImpl.searchProduct(pId);
		
		if(p==null)
		{
			System.out.println("Product with PID="+pId+" does not exists");
		}
		else
		{
			System.out.println(p);
		}
	}
	
}//end Class

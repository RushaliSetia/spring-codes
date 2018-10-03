package com.infogain.aspects;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.util.Date;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

import com.infogain.Exception.ProductInHandError;
import com.infogain.bean.Product;

@Aspect
public class ProductAspect {

	@AfterThrowing(pointcut="args(data)", throwing="ex")
	public void logCreater(Product data,Exception ex) {
		System.out.println(ex.getMessage() + " "+data);
		System.out.println("Executed");
	}

	@After("args(data)")
	public void afterSales(Product data) {
		try {
			File file = new File("Product_Sales_log.txt");
			FileOutputStream fos = new FileOutputStream(file, true);
			PrintWriter pw = new PrintWriter(fos);
			String line = System.getProperty("line.separator");

			InetAddress ipAddr = InetAddress.getLocalHost();
			pw.write(ipAddr + " [" + new Date() + "]" + "[" + data + "]"+line);
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

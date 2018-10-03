package com.info.aop;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.util.Date;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;


@Aspect
public class BookAspect {

	@After("args(bookId)")
	public void log(int bookId)
	{
		try
		{
			File file=new File("LogFile.txt");
			FileOutputStream fos=new FileOutputStream(file, true);
			String line=System.getProperty("line.separator");
			PrintWriter pw=new PrintWriter(fos);
			
			InetAddress ipAddr=InetAddress.getLocalHost();
			pw.write(ipAddr+" ["+new Date()+"]"+"[bookId="+bookId+"]"+line+"");
			pw.close();
			
			System.out.println("LogFile created.......");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@AfterReturning(pointcut="args(bookId)", returning="result")
	public void returnNull(int bookId,String result)
	{
		try{
		File file=new File("LogFile.txt");
		FileOutputStream fos=new FileOutputStream(file, true);
		String line=System.getProperty("line.separator");
		PrintWriter pw=new PrintWriter(fos);
		
		InetAddress ipAddr=InetAddress.getLocalHost();
		if(result==null || result=="")
		{
			pw.write(ipAddr+" ["+new Date()+"]"+"[bookId=null]"+line+"");
			pw.close();
		}
		else
		{
			pw.write(ipAddr+" ["+new Date()+"]"+"[bookId="+bookId+"]"+line+"");
			pw.close();
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

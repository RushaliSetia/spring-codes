package com.info.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import com.info.bean.Book;


public class BookDAOImpl {

	private DataSource dataSource;
	private Connection con;
	 Book book;
	public BookDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	public BookDAOImpl(DataSource dataSource, Connection con) {
		super();
		this.dataSource = dataSource;
		this.con = con;
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public String toString() {
		return "BookDAPImpl [dataSource=" + dataSource + ", con=" + con + "]";
	}
	
	 public Book getBookById(int bookId)
	 {
		
		 try{
		    con=dataSource.getConnection();
       		PreparedStatement ps=con.prepareStatement("select * from book where bookId=?");
       		ps.setInt(1, bookId);
       		ResultSet res=ps.executeQuery();
       		
       		while(res.next())
       		{
       			book=new Book(res.getString(1),res.getInt(2),res.getString(3));
       		}
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 
	     return book;
	 }
	
}

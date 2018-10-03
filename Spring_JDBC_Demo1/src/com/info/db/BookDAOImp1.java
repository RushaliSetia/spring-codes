package com.info.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.info.beans.Book;

public class BookDAOImp1 implements BookDAO {
	DataSource datasource;
	Connection con;
    public BookDAOImp1() {
		// TODO Auto-generated constructor stub
	}
	public DataSource getDatasource() {
		return datasource;
	}

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public BookDAOImp1(DataSource datasource, Connection con) {
		super();
		this.datasource = datasource;
		this.con = con;
	}

	@Override
	public String toString() {
		return "BookDAOImp1 [datasource=" + datasource + ", con=" + con + "]";
	}

	public Book getBookById (int id) throws Exception{
		Book book = null;

		try {
			con=datasource.getConnection();
			System.out.println("------->con" + con);
			PreparedStatement ps = con.prepareStatement("select * from book where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			

			while (rs.next()) {
				book = new Book();
				book.setAuthor(rs.getString("author"));
				book.setName(rs.getString("name"));
				book.setId(id);
			}
			if(id<2)
			throw new Exception("exception");
			
		} catch (SQLException e) {
			
		} // end catch
		return book;
	}

}// end imp1

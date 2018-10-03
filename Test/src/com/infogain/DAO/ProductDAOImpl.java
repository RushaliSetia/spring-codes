package com.infogain.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import com.infogain.bean.Product;

public class ProductDAOImpl implements ProductDAO {

	private DataSource dataSource;
	private Connection con;

	public ProductDAOImpl() {
		System.out.println("--------->>" + getClass());
	}

	public ProductDAOImpl(DataSource dataSource, Connection con) {
		super();
		try {
			this.dataSource = dataSource;
			this.con = con;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public void addProduct(Product p) {
		int isInserted = 0;
		try {
			con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into Product values(?,?,?,?)");
			ps.setInt(1, p.getpId());
			ps.setString(2, p.getProductName());
			ps.setInt(3, p.getProductCost());
			ps.setInt(4, p.getQualityInHand());

			isInserted = ps.executeUpdate();

			if (isInserted != 0) {
				System.out.println("Product added");
			} else {
				System.out.println("Product not added");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}// end addProduct

	public Product searchProduct(int pId) {
		Product product = null;
		try {
			con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from Product where pid=?");
			ps.setInt(1, pId);

			ResultSet res = ps.executeQuery();

			while (res.next()) {
				product = new Product(pId, res.getString(2), res.getInt(3), res.getInt(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return product;
	}// end searchProduct

	public boolean updateProduct(int pId, int unitSold) {
		int isUpdated = 0;
		Product product = null;
		try {
			con = dataSource.getConnection();
			PreparedStatement ps1 = con.prepareStatement("select * from Product where pid=?");
			ps1.setInt(1, pId);

			ResultSet res = ps1.executeQuery();

			while (res.next()) {
				product = new Product(pId, res.getString(2), res.getInt(3), res.getInt(4));
				break;
			}

			PreparedStatement ps = con.prepareStatement("update Product set quanityInHand=? where pid=?");
			ps.setInt(1, (product.getQualityInHand() - unitSold));
			ps.setInt(2, pId);

			isUpdated = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (isUpdated != 0) {
			return true;
		} else {
			return false;
		}
	}// end updateProduct
}

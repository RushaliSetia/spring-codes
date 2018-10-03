package com.infogain.DAO;

import com.infogain.bean.Product;

public interface ProductDAO {

	public void addProduct(Product p);	
	public Product searchProduct(int pId);
	public boolean updateProduct(int pId,int unitSold);
}

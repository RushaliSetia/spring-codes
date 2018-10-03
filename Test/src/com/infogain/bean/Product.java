package com.infogain.bean;

import com.infogain.Exception.ProductInHandError;

public class Product {

	int pId;
	String productName;
	int productCost;
	int qualityInHand;

	public Product() {
		System.out.println("------->>" + getClass());
	}

	public Product(int pId, String productName, int productCost, int qualityInHand) {
		super();
		this.pId = pId;
		this.productName = productName;
		this.productCost = productCost;
		this.qualityInHand = qualityInHand;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductCost() {
		return productCost;
	}

	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}

	public int getQualityInHand() {
		return qualityInHand;
	}

	public void setQualityInHand(int qualityInHand) {
		this.qualityInHand = qualityInHand;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", productName=" + productName + ", productCost=" + productCost
				+ ", qualityInHand=" + qualityInHand + "]";
	}

	public void validateQuality(Product p) throws Exception {
		if (validQuantity(p.qualityInHand)) {
			throw new Exception("Product in Hand Error");
		} else {
          System.out.println("not exception");
		}

	}// end validateQuality

	public boolean validQuantity(int quantity) {
		if (quantity < 1) {
			return true;
		} else {
			return false;
		}
	}
}

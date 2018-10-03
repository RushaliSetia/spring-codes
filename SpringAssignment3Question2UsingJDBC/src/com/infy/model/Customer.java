package com.infy.model;

public class Customer {

	private int cid;
	private String name;
	private int age;
	private int pamount;
	public Customer(int cid, String name, int age, int pamount) {
		super();
		this.cid = cid;
		this.name = name;
		this.age = age;
		this.pamount = pamount;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPamount() {
		return pamount;
	}
	public void setPamount(int pamount) {
		this.pamount = pamount;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", age=" + age + ", pamount=" + pamount + "]";
	}
	public Customer() {
		super();
	}
	
	
}

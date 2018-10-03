package com.infy.model;

public class Person {

	private int pid;
	private String name;
	private String gender;
	private int age;
	public Person() {
		super();
	}
	public Person(int pid, String name, String gender, int age) {
		super();
		this.pid = pid;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
}

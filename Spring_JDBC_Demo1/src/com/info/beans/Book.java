package com.info.beans;

public class Book {
   String author;
   String name;
   int id;
   public Book() {
	// TODO Auto-generated constructor stub
}
public Book(String author, String name, int id) {
	super();
	this.author = author;
	this.name = name;
	this.id = id;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "Book [author=" + author + ", name=" + name + ", id=" + id + "]";
}
/*public int display()throws Exception
{
	throw new Exception("exception raised");
	//System.out.println("display");
	//return 1;
	}*/
   
}

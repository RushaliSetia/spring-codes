package com.info.db;

import com.info.beans.Book;

public interface BookDAO {
	  public Book getBookById(int id) throws Exception;
}

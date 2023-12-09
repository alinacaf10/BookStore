package com.DAO;

import com.bean.Book;

import java.util.List;

public interface BookDAO {

     List<Book> getAllBook();
     Book findBookById(int id);

     boolean addBook();

     boolean deleteBook();

     Book updateBook(Book book);

}

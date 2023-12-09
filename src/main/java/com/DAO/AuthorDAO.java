package com.DAO;

import com.bean.Author;

import java.util.List;

public interface AuthorDAO {
     List<Author> getAllAuthor();
     Author findAuthorById(int id);

     boolean addAuthor();

     boolean deleteAuthor();
     Author updateAuthor(Author author);

}

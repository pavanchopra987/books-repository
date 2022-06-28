package com.learn.spring.monday.task276.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.spring.monday.task276.Model.Books;
import com.learn.spring.monday.task276.Repository.BooksRepository;



@Service
public class BooksService {

	@Autowired
	BooksRepository booksRepository;
	
	public void addBook(Books book) {
		booksRepository.save(book);
	}
	
	public List<Books> getAll(){
		return booksRepository.findAll();
	}
	
	public void deleteBook(int id) {
		booksRepository.delete(Books.builder().id(id).build());
	}
}

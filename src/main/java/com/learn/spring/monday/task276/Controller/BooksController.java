package com.learn.spring.monday.task276.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.learn.spring.monday.task276.Model.Books;
import com.learn.spring.monday.task276.Service.BooksService;

@RestController
public class BooksController {

	@Autowired
	BooksService bs;
	
	@GetMapping("/")
	public String home() {
		return "welcome to home page";
	}
	
	@GetMapping("/addbook")
	public String addBook(int id, String name, String author) {
		bs.addBook(Books.builder().id(id).name(name).author(author).build());
		return "book added";
	}
	
	@GetMapping("/getbooks")
	public String getAll() {
		Gson gson = new Gson();
		String json = gson.toJson(bs.getAll());
		return json;
	}
	
	@GetMapping("/deletebook")
	public String deleteBook(int id) {
		bs.deleteBook(id);
		return "book delete";
	}
}

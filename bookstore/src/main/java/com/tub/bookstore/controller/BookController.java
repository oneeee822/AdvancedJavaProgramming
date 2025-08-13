package com.tub.bookstore.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tub.bookstore.resources.Book;

@RestController
public class BookController {

	Book book1 = new Book("S1002", "Lord of the Ring", "J.K Rolling", "dd", 2.6);
	Book book2 = new Book("S1003", "Ring", "Rolling", "d", 7.43);
	
	List<Book> data = new ArrayList<Book>();
	
	@RequestMapping("/topics")
	public List bookData() {
		data.add(book1);
		data.add(book2);
		return data;
	}
	
	
	
}

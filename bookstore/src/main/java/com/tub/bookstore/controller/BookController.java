package com.tub.bookstore.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tub.bookstore.resources.Book;
import com.tub.bookstore.services.BookServices;

@RestController
public class BookController {
	
	@Autowired BookServices bookService;

	Book book1 = new Book("S1002", "Lord of the Ring", "J.K Rolling", "dd", 2.6);
	Book book2 = new Book("S1003", "Ring", "Rolling", "d", 7.43);
	
	List<Book> data = new ArrayList<Book>();
	
	@GetMapping("/topics")
	public List<Book> bookData() {
		return bookService.getAllTopics();
	}
	
	@GetMapping("/topics/{id}")
	public Book getOneBook(@PathVariable String id) {
		return bookService.getTopicById(id);
	}
	
	@PostMapping("/topics")
	public void addBook(@RequestBody Book book) {
		bookService.addOneBook(book);
	}
	
	@DeleteMapping("/topics/{id}")
	public void deleteBook(@PathVariable String id) {
		bookService.deleteOneBook(id);
	}
	
	@PutMapping("/topics/{id}")
	public void update(@RequestBody Book book, @PathVariable String id) {
		bookService.updateBook(book, id);
	}
	
}

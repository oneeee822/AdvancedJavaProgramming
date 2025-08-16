package com.tub.bookstore.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tub.bookstore.repository.BookRepository;
import com.tub.bookstore.resources.Book;

@Service
public class BookServices {
	
	@Autowired
	BookRepository bookRepository;
	
	/*
	List<Book> data = new ArrayList<Book>();
	//Constructor
	BookServices(){
		Book book1 = new Book("S1002", "Lord of the Ring", "J.K Rolling", "dd", 2.6);
		Book book2 = new Book("S1003", "Ring", "Rolling", "d", 7.43);
		data.add(book1);
		data.add(book2);
	}
	*/

	//Get All command
	public List<Book> getAllTopics(){
		//return data;
		List<Book> tempList = new ArrayList();
		bookRepository.findAll().forEach(tempList::add);
		
		return tempList;
	}
	
	//Get Book by ID
	public Optional<Book> getTopicById(String id) {
		//return data.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return bookRepository.findById(id);
	}
	
	public void addOneBook(Book book) {
		//data.add(book);
		bookRepository.save(book);
	}
	
	public void deleteOneBook(String id) {
		//data.removeIf(t->t.getId().equalsIgnoreCase(id));
		bookRepository.deleteById(id);
	}
	
	public void updateBook(Book book, String id) {
		/*
		  int i = 0;
		  for(Book t : data) {
			if(t.getId().equals(id)) {
				data.set(i, book);
			}
			i++;
		}
		 */
		bookRepository.save(book);
		
	}
}

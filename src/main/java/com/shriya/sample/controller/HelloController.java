package com.shriya.sample.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shriya.sample.model.Book;

@RestController
public class HelloController {
	
	List<Book> bookList = new ArrayList<>(Arrays.asList(new Book("Java Core","1","James Gosling"),
			new Book("Cloud Computing","2","ABC"),
			new Book("Computer Networks","3","XYZ")));
//	bookList.add(new Book("Java Core","1","James Gosling"));
//	bookList.add(new Book("Cloud Computing","2","ABC"));
//	bookList.add(new Book("Computer Networks","3","XYZ"));
	
	@GetMapping("/hello")
	public String getHelloMsg() {
		return "Hello";
	}
	
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		
		return bookList; 
	}

	@GetMapping("/books/{id}")
	public Book getBookById(@PathVariable String id) {
		return bookList.stream().filter(b->b.getId().equals(id)).findFirst().get();
	}
	
	@PostMapping("/books")
	public void addBook(@RequestBody Book book) {
		bookList.add(book);
	}
	
	@PutMapping("/books/{id}")
	public void updateBook(@PathVariable String id, @RequestBody Book book) {
		for(Book boo: bookList) {
			if(boo.getId().equals(id)) {
				bookList.set((Integer.parseInt(id)-1), book);
				}
		}
		
	}
	
	@DeleteMapping("/books/{id}")
	public void deleteBook(@PathVariable String id) {

			bookList.removeIf(b->b.getId().equals(id));
		
	}
	
}

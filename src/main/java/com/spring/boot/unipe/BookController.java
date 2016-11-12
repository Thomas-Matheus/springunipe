package com.spring.boot.unipe;



import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	@RequestMapping(value="/books", method = RequestMethod.GET)
	public ResponseEntity<List<Book>> listAllBook(){
		
		List<Book> listFakeBook = new ArrayList<Book>();
		listFakeBook.add(new Book(1,"Project Management","Margin Fawler","1232131231"));
		listFakeBook.add(new Book(2,"Pattern of Enterprise Application Architecture",
				"Martin Fawler","123341"));
		listFakeBook.add(new Book(3,"Scrum Guide","Jeff Sutherland","1232131231"));
		listFakeBook.add(new Book(4,"Angular 2","The boys","1232131231"));
		
		return new ResponseEntity<List<Book>>(listFakeBook, HttpStatus.OK);
	}
	
	@RequestMapping(value="/books/{id}", method = RequestMethod.GET)
	public ResponseEntity<Book> getBooks(@PathVariable String id){
		
		Book book = new Book(1,"Software Architecture", "I don't know","123HAUDHoODJA");
		
		return book == null ? 
				new ResponseEntity<Book>(HttpStatus.NOT_FOUND):
					new ResponseEntity<Book>(book,HttpStatus.OK);
	}
	
	@RequestMapping(value="/book/add", method=RequestMethod.POST)
	public ResponseEntity<Book> createBook(@RequestBody Book bookTitle){
		try {
			
			return new ResponseEntity<Book>(HttpStatus.CREATED);
			
		} catch (Exception e) {
			return new ResponseEntity<Book>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@RequestMapping(value="/book/edit/{id}", method=RequestMethod.PUT)
	public ResponseEntity<Book> editBook(@PathVariable String id,@RequestBody Book book){

		return book == null ? 
				new ResponseEntity<Book>(HttpStatus.NOT_FOUND):
					new ResponseEntity<Book>(book,HttpStatus.OK);
	}
}

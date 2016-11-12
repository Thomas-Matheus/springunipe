package com.spring.boot.unipe;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Book implements Serializable {
	private static final long serialVersionUID = -7799369695818057571L;
	
	@Id
	private int id;
	private String name;
	private String author;
	private String isbn;
	
	public Book() {
		
	}
	
	
	public Book(int id, String name, String author, String isbn) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.isbn = isbn;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", isbn=" + isbn + "]";
	}
	
	
	
	
	
	


}

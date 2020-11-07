package com.example;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String author;
	
	@Column(unique = true)
	private String isbn;
	
	 @OneToMany(mappedBy = "book", fetch = FetchType.LAZY,
	            cascade = CascadeType.ALL)
	private Set<Page> pages;
	 
	 public Book() {
		 
	 }

	 
	public Book(String name, String author, String isbn) {
		this.name = name;
		this.author = author;
		this.isbn = isbn;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public Set<Page> getPages() {
		return pages;
	}

	public void setPages(Set<Page> pages) {
		this.pages = pages;
	}
	 
	 
	
}

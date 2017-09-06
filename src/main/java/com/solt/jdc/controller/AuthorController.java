package com.solt.jdc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.solt.jdc.entities.Author;

@Named
@RequestScoped
public class AuthorController implements Serializable{
	private static final long serialVersionUID=1L;
	private Author author=new Author();
	private List<Author> authorList;
	
	public AuthorController() {
		
		populateAuthorList();
	}
	

	public Author getAuthor() {
		return author;
	}


	public void setAuthor(Author author) {
		this.author = author;
	}


	public List<Author> getAuthorList() {
		return authorList;
	}


	public void setAuthorList(List<Author> authorList) {
		this.authorList = authorList;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	private void populateAuthorList() {
		authorList=new ArrayList<>();
		authorList.add(new Author("pyae","sone","computer"));
		authorList.add(new Author("aung","aung","science"));
		authorList.add(new Author("maung","maung","english"));
		authorList.add(new Author("thaw","thaw","bio"));
		
	}
	public void addAuthor(){
		getAuthorList().add(new Author(author.getFirstName(),author.getLastName(),author.getBio()));
	}

}

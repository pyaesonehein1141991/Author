package com.solt.jdc.entities;

import java.io.Serializable;

public class Author implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID= 1L;
	private String firstName;
	private String lastName;
	private String bio;
	public Author(){
		this.firstName=null;
		this.lastName=null;
		this.bio=null;
		
	}
	public Author(String firstName,String lastName,String bio){
		this.firstName=firstName;
		this.lastName=lastName;
		this.bio=bio;
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	

}

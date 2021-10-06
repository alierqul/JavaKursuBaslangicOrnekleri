package com.aliergul.oop.example05;

import java.util.Arrays;
import java.util.Date;

public abstract class Person {
	private long personelID;
	private String firstName;
	private String lastName;
	private Date birthDay;
	private String adress;
	private long[] telephone;
	
	public Person(long personelID, String firstName, String lastName) {
		super();
		this.personelID = personelID;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return "Person [personelID=" + personelID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", birthDay=" + birthDay + ", adress=" + adress + ", telephone=" + Arrays.toString(telephone) + "]";
	}
	
	public long getPersonelID() {
		return personelID;
	}
	
	public void setPersonelID(long personelID) {
		this.personelID = personelID;
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
	
	public Date getBirthDay() {
		return birthDay;
	}
	
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	
	public String getAdress() {
		return adress;
	}
	
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public long[] getTelephone() {
		return telephone;
	}
	
	public void setTelephone(long[] telephone) {
		this.telephone = telephone;
	}
	
}

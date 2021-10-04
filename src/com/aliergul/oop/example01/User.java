package com.aliergul.oop.example01;

import java.util.ArrayList;
import java.util.List;

import com.aliergul.bilgeadam.boost.util.ConsoleHelper;

public class User {
	private static List<User> list;
	private String name;
	private String surname;
	private String email;
	private String number;
	private String pass;
	
	public static void showAllUsers() {
		if (list != null)
			for (User user : list) {
				ConsoleHelper.print(user.toString(), 2, true);
			}
		
	}
	
	public static void addNewUser(User user) {
		if (list == null)
			list = new ArrayList<User>();
		list.add(user);
	}
	
	public static User loginEmailPass(String email, String pass) {
		User u = new User(email, pass);
		if (list.contains(u))
			return list.get(list.indexOf(u));
		
		return null;
	}
	
	@Override
	public boolean equals(Object obj) {
		User u = (User) obj;
		boolean sonuc = u.email.equalsIgnoreCase(this.email) && u.pass.equalsIgnoreCase(this.pass);
		return sonuc;
	}
	
	private User(String email, String pass) {
		this.email = email.toLowerCase();
		this.pass = pass;
	}
	
	public User(String name, String surname, String email, String number, String pas) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email.toLowerCase();
		this.number = number;
		this.pass = pas;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email.toLowerCase();
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", surname=" + surname + ", email=" + email + ", number=" + number + ", pass="
				+ pass + "]";
	}
	
}

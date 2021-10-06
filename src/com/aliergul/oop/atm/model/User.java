package com.aliergul.oop.atm.model;

import java.util.List;

/**
 * Kullanıcı Giriş Bilgileri
 * 
 * @author ERGUL
 *
 */
public class User extends Person {
	
	private String userName;
	private String pass;
	private int failedLoginCount;
	private List<Long> listFailedLoginTime;
	
	public User(String identity, String firsName, String lastName, String userName, String pass) {
		super(identity, firsName, lastName);
		this.userName = userName;
		this.pass = pass;
	}
	
}

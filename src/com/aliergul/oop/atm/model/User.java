package com.aliergul.oop.atm.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Kullanıcı Giriş Bilgileri
 * 
 * @author ERGUL
 *
 */
public class User extends Person implements IAccountProcess {

	private String userName;
	private String pass;

	private static List<CurrentAccount> listCurrentAccount;
	private static List<User> listUser;

	static {
		if (listUser == null)
			listUser = new ArrayList<User>();
		if (listUser.size() == 0) {
			User u = new User("12345678100", "1234", "1234", "root", "root");
			u.addCurrentAccounttoList(new CurrentAccount(u), u.identity);
			listUser.add(u);
			User u1 = new User("12345678101", "1234", "1234", "test", "test");
			u.addCurrentAccounttoList(new CurrentAccount(u1), u1.identity);
			listUser.add(u1);
			User u2 = new User("12345678102", "1234", "1234", "test2", "test2");
			u.addCurrentAccounttoList(new CurrentAccount(u2), u2.identity);
			listUser.add(u2);
		}

	}

	public User(String identity, String firsName, String lastName, String userName, String pass) {
		super(identity, firsName, lastName);
		this.userName = userName;
		this.pass = pass;
		listUser.add(this);
	}

	@Override
	public void addCurrentAccounttoList(CurrentAccount currentAccount, String identy) {
		if (listCurrentAccount == null)
			listCurrentAccount = new ArrayList<CurrentAccount>();
		listCurrentAccount.add(currentAccount);

	}

	public static User login(String userName, String pass) {
		for (User u : listUser) {
			if (u.getPass().equals(pass) && u.getUserName().equals(userName)) {
				return u;
			}
		}
		return null;
	}

	public static String findUser(String userName) {
		for (User u : listUser) {
			if (u.getUserName().equals(userName)) {
				return u.identity;
			}
		}
		return "";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}

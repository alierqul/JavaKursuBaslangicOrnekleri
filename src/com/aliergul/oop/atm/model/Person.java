package com.aliergul.oop.atm.model;

/**
 * Ata Sınıf Olarak tanımlandı.
 * 
 * @author ERGUL
 *
 */

abstract public class Person {
	private static int countID;
	protected int ID;
	protected String identity;
	protected String firsName;
	protected String lastName;

	public Person(String identity, String firsName, String lastName) {
		this.ID = ++countID;
		this.identity = identity;
		this.firsName = firsName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Person [ID=" + ID + ", identity=" + identity + ", firsName=" + firsName + ", lastName=" + lastName
				+ "]";
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}

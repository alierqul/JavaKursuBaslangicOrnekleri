package com.aliergul.oop.atm.model;

/**
 * Vadesiz Hesap
 * 
 * @author ERGUL
 *
 */
public class CurrentAccount extends Person {
	private String iban = "";
	// 16Basamaklı
	private String accountNumber = "";
	
	public CurrentAccount(String identity, String firsName, String lastName) {
		super(identity, firsName, lastName);
		this.iban = createIbanNumber();
	}
	
	private String createIbanNumber() {
		String iban = Bank.ULKE_KODU + Bank.KONTROL_BASAMAGI + " " + Bank.BANKA_KODU + " " + Bank.REZERV_ALAN + " "
				+ createAccountNumber();
		return iban;
	}
	
	private String createAccountNumber() {
		StringBuilder builder = new StringBuilder();
		builder.append(Bank.SUBE_KODU + " ");
		for (int i = 0; i < 12; i++) {
			builder.append((int) (Math.random() * 10));
		}
		this.accountNumber = builder.toString();
		return builder.toString();
	}
	
	public String getIban() {
		return iban;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
}

package com.aliergul.oop.atm.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author ERGUL
 *
 */
public class CurrentAccount extends Person implements IAccountProcess {
	private String iban = "";
	// 16Basamaklı
	private long accountNumber = 0L;
	private double balance = 0;
	private static List<Map<String, CurrentAccount>> listAllIbanList;

	public double getBalance() {
		return balance;
	}

	public void incBalance(double balance) {
		this.balance += balance;
	}

	public void decBalance(double balance) {
		// TODO Eksi bakiyeyi kontrol et
		this.balance -= balance;
	}

	public CurrentAccount(String identity, String firsName, String lastName) {
		super(identity, firsName, lastName);
		this.iban = createIbanNumber();
		this.balance = 0d;
		addCurrentAccounttoList(this, identity);
	}

	public CurrentAccount(User user) {
		super(user.identity, user.firsName, user.lastName);
		this.iban = createIbanNumber();
		addCurrentAccounttoList(this, user.identity);
	}

	private String createIbanNumber() {
		String iban = Bank.ULKE_KODU + Bank.KONTROL_BASAMAGI + " " + Bank.BANKA_KODU + " " + Bank.REZERV_ALAN + " "
				+ createAccountNumber();
		return iban;
	}

	private String createAccountNumber() {
		StringBuilder builder = new StringBuilder();
		this.accountNumber = (listAllIbanList == null) ? 0 : listAllIbanList.size();
		builder.append(Bank.SUBE_KODU + " " + String.format("%012d", this.accountNumber));

		return builder.toString();
	}

	public String getIban() {
		return iban;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public static CurrentAccount findCurrentAccount(String identy) {
		for (Map<String, CurrentAccount> map : listAllIbanList) {
			for (Map.Entry<String, CurrentAccount> entry : map.entrySet()) {
				String key = entry.getKey();
				CurrentAccount val = entry.getValue();
				if (key.equals(identy))
					return val;
			}

		}
		return null;
	}

	public static void updateListCurrentAccount(CurrentAccount account, String identy) {
		Map<String, CurrentAccount> map = new HashMap<String, CurrentAccount>();
		map.put(identy, account);
		listAllIbanList.add((int) account.accountNumber, map);
	}

	@Override
	public void addCurrentAccounttoList(CurrentAccount currentAccount, String identy) {
		if (listAllIbanList == null)
			listAllIbanList = new ArrayList<>();
		Map<String, CurrentAccount> map = new HashMap<String, CurrentAccount>();
		map.put(identy, currentAccount);
		listAllIbanList.add(map);

	}

}

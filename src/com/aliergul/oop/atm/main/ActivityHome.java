package com.aliergul.oop.atm.main;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import com.aliergul.bilgeadam.boost.util.ConsoleHelper;
import com.aliergul.oop.atm.model.CurrentAccount;

public class ActivityHome {
	private static Scanner in = new Scanner(System.in);
	private static final int LINE_COUNT = 30;
	private static final String HOME_NAME = "ERGUL BANK";
	private static final String TITLE_BALANCE = "Bakiye Sorma";
	private static final String TITLE_ADDBALANCE = "Para Çekme";
	private static final String TITLE_OUT_BALANCE = "Para Yatırma";
	private static final String TITLE_EFT = "EFT";
	private static final String TITLE_TRANSFER = "Havale";
	private static final String TITLE_EXIT = "Güvenli Çıkış (0 & 99)";
	
	private CurrentAccount currentAccount = null;
	
	public static void main(String[] args) {
		
		do {
			switch (showHomeMenu()) {
				case 1:
					askBalance(args[0]);
					break;
				case 3:
					addBalance(args[0]);
					break;
				case 4:
					transfer(args[0]);
					break;
				case 5:
					eft(args[0]);
					break;
				case 2:
					outBalance(args[0]);
					break;
				case 0, 99:
					AtmTespApp.main(null);
					System.exit(0);
					break;
				default:
					break;
			}
			ConsoleHelper.printLine(20);
		} while (true);
	}
	
	private static void eft(String identy) {
		ConsoleHelper.printTitle(TITLE_EFT, LINE_COUNT);
		CurrentAccount account = CurrentAccount.findCurrentAccount(identy);
		ConsoleHelper.print(" Önceki Bakiye = " + account.getBalance() + " TL", 2, true);
		ConsoleHelper.print("Gönderilecek Tutar Giriniz: ", 2, false);
		double cash = in.nextDouble();
		in.nextLine();
		ConsoleHelper.print("Alıcı Hesabı Giriniz      : ", 2, false);
		String name = in.nextLine();
		ConsoleHelper.print("İban Giriniz              : ", 2, false);
		String iban = in.nextLine();
		account.decBalance(cash);
		
		ConsoleHelper.print(name.toUpperCase() + " adına  " + cash + " TL Gönderildi.", 2, true);
		ConsoleHelper.print(" Yeni Bakiyeniz = " + account.getBalance() + " TL", 2, true);
		in.nextLine();
		
	}
	
	private static void transfer(String identy) {
		ConsoleHelper.printTitle(TITLE_TRANSFER, LINE_COUNT);
		CurrentAccount account = CurrentAccount.findCurrentAccount(identy);
		ConsoleHelper.print(" Önceki Bakiye = " + account.getBalance() + " TL", 2, true);
		ConsoleHelper.print("Gönderilecek Tutar Giriniz: ", 2, false);
		double cash = in.nextDouble();
		in.nextLine();
		ConsoleHelper.print("Alıcı Hesabı Giriniz      : ", 2, false);
		String name = in.nextLine();
		ConsoleHelper.print("Tc kimlik Giriniz         : ", 2, false);
		String receiverIdenty = in.nextLine();
		CurrentAccount receiverAccaunt = CurrentAccount.findCurrentAccount(receiverIdenty);
		if (receiverAccaunt != null) {
			account.decBalance(cash);
			receiverAccaunt.incBalance(cash);
			ConsoleHelper.print(name.toUpperCase() + " adına  " + cash + " TL Gönderildi.", 2, true);
			ConsoleHelper.print(" Yeni Bakiyeniz = " + account.getBalance() + " TL", 2, true);
			in.nextLine();
		} else {
			ConsoleHelper.print("Hesap Bulunamadı. Bilgilerinizi Kontrol ediniz.", 2, true);
		}
		
	}
	
	private static void outBalance(String identy) {
		ConsoleHelper.printTitle(TITLE_OUT_BALANCE);
		CurrentAccount account = CurrentAccount.findCurrentAccount(identy);
		ConsoleHelper.print(" Önceki Bakiye = " + account.getBalance() + " TL", 2, true);
		ConsoleHelper.print(" Çekilecek Tutar Giriniz: ", 2, false);
		double cash = in.nextDouble();
		account.decBalance(cash);
		ConsoleHelper.print(" Yeni Bakiye = " + account.getBalance() + " TL", 2, true);
		in.nextLine();
		
	}
	
	private static void addBalance(String identy) {
		ConsoleHelper.printTitle(TITLE_ADDBALANCE, LINE_COUNT);
		CurrentAccount account = CurrentAccount.findCurrentAccount(identy);
		ConsoleHelper.print(" Önceki Bakiye = " + account.getBalance() + " TL", 2, true);
		ConsoleHelper.print(" Yatırılacak Tutar Giriniz: ", 2, false);
		double cash = in.nextDouble();
		account.incBalance(cash);
		ConsoleHelper.print(" Yeni Bakiye = " + account.getBalance() + " TL", 2, true);
		in.nextLine();
	}
	
	private static void askBalance(String identy) {
		ConsoleHelper.printTitle(TITLE_BALANCE, LINE_COUNT);
		ConsoleHelper.print(" ToplamBakiye = " + CurrentAccount.findCurrentAccount(identy).getBalance() + " TL", 2,
				true);
	}
	
	private static int showHomeMenu() {
		Map<Integer, String> mapMenu = new TreeMap<>();
		mapMenu.put(1, TITLE_BALANCE);
		mapMenu.put(2, TITLE_ADDBALANCE);
		mapMenu.put(3, TITLE_OUT_BALANCE);
		mapMenu.put(4, TITLE_TRANSFER);
		mapMenu.put(5, TITLE_EFT);
		mapMenu.put(99, TITLE_EXIT);
		
		return ConsoleHelper.showMenu(HOME_NAME, mapMenu);
		
	}
}

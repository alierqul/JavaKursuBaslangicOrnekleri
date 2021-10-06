package com.aliergul.oop.atm.main;

import java.util.Scanner;

import com.aliergul.bilgeadam.boost.util.ConsoleHelper;
import com.aliergul.oop.atm.model.CurrentAccount;

public class ActivityHome {
	private static Scanner in = new Scanner(System.in);
	private static final String HOME_NAME = "  ERGUL BANK  ";
	private static final String TITLE_BALANCE = "[  1- Bakiye Sorma  ]";
	private static final String TITLE_ADDBALANCE = "[  2- Para Çekme    ]";
	private static final String TITLE_OUT_BALANCE = "[  3- Para Yatırma  ]";
	private static final String TITLE_EFT = "[  5- EFT           ]";
	private static final String TITLE_TRANSFER = "[  4- Havale        ]";
	private static final String TITLE_EXIT = "[  0- Güvenli Çıkış ]";

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
			case 0:
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
		ConsoleHelper.printTitle(TITLE_EFT);
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
		ConsoleHelper.printTitle(TITLE_TRANSFER);
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
		ConsoleHelper.printTitle(TITLE_ADDBALANCE);
		CurrentAccount account = CurrentAccount.findCurrentAccount(identy);
		ConsoleHelper.print(" Önceki Bakiye = " + account.getBalance() + " TL", 2, true);
		ConsoleHelper.print(" Yatırılacak Tutar Giriniz: ", 2, false);
		double cash = in.nextDouble();
		account.incBalance(cash);
		ConsoleHelper.print(" Yeni Bakiye = " + account.getBalance() + " TL", 2, true);
		in.nextLine();
	}

	private static void askBalance(String identy) {
		ConsoleHelper.printTitle(TITLE_BALANCE);
		ConsoleHelper.print(" ToplamBakiye = " + CurrentAccount.findCurrentAccount(identy).getBalance() + " TL", 2,
				true);
	}

	private static int showHomeMenu() {
		ConsoleHelper.printTitle(HOME_NAME);
		ConsoleHelper.print(TITLE_BALANCE, 2, true);
		ConsoleHelper.print(TITLE_ADDBALANCE, 2, true);
		ConsoleHelper.print(TITLE_OUT_BALANCE, 2, true);
		ConsoleHelper.print(TITLE_TRANSFER, 2, true);
		ConsoleHelper.print(TITLE_EFT, 2, true);
		ConsoleHelper.print(TITLE_EXIT, 2, true);
		return ConsoleHelper.selectDigitSecim();

	}
}

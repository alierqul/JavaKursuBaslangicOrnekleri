/**
 * 
 */
package com.aliergul.oop.atm.main;

import java.util.Scanner;

import com.aliergul.bilgeadam.boost.util.ConsoleHelper;
import com.aliergul.oop.atm.model.CurrentAccount;
import com.aliergul.oop.atm.model.User;

/**
 * @author ERGUL
 *
 */
public class AtmTespApp {
	private static Scanner in;
	private static final String APP_NAME = "ATM UYGULAMASI";
	private static int failedLoginCount = 5;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		do {
			switch (showMainMenu()) {
			case 1:
				showLogin();

				break;
			case 2:
				showRegister();
				break;
			case 0:
				System.exit(0);
				break;
			default:
				break;
			}

		} while (true);

	}

	private static void failedLoginAlert() {
		System.err.println("\t\t Giriş Başarısız. \n Kullanıcı adı ve Şifrenizi Kontrol ediniz.");

	}

	private static int showMainMenu() {
		ConsoleHelper.printTitle(APP_NAME);
		ConsoleHelper.print(" 1- Login                   ", 2, true);
		ConsoleHelper.print(" 2- Hala Hesabınız Yok mu ? ", 2, true);
		ConsoleHelper.print(" 0- Vazgeç                  ", 2, true);

		return ConsoleHelper.selectDigitSecim();

	}

	public static void showLogin() {

		if (failedLoginCount > 0) {

			ConsoleHelper.printTitle("Hoş Geldiniz...");

			String userName, userPass;
			ConsoleHelper.print(" Kullanıcı Adınız        : ", 2, false);
			userName = in.next().trim().toLowerCase();
			ConsoleHelper.print(" Şifre Giriniz           : ", 2, false);
			userPass = in.next();
			User u = User.login(userName, userPass);
			if (u != null) {
				failedLoginCount = 5;
				ActivityHome.main(new String[] { u.getIdentity() });
				System.exit(0);
			} else {
				failedLoginCount--;
				failedLoginAlert();
			}
		} else {

			System.err.println("Çok Fazla Başarısız Deneme Yaptınız.");
			System.err.println("Lütfen Bankanız ile irtibata Geçiniz.");
			System.exit(0);

		}

	}

	public static int showRegister() {
		ConsoleHelper.printTitle("Hoş Geldiniz...");

		String userName;
		String userPass;
		String userFirstName;
		String userLastName;
		String userIdenty;
		ConsoleHelper.print(" Tc Kimlik No        : ", 2, false);
		userIdenty = in.next();
		ConsoleHelper.print(" İsim                : ", 2, false);
		userFirstName = in.next();
		ConsoleHelper.print(" Soyİsim             : ", 2, false);
		userLastName = in.next();
		ConsoleHelper.print(" Kullanıcı Eposta    : ", 2, false);
		userName = in.next();
		ConsoleHelper.print(" Şifre               : ", 2, false);
		userPass = in.next();

		User user = new User(userIdenty, userFirstName, userLastName, userName, userPass);
		user.addCurrentAccounttoList(new CurrentAccount(user), user.getIdentity());
		return 0;
	}
}

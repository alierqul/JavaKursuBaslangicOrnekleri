/**
 * 
 */
package com.aliergul.oop.atm.main;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

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
	
	private static final int LINE_COUNT = 30;
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
		System.err.println("\t\tGiriş Başarısız.\n\t\tKullanıcı adı ve Şifrenizi Kontrol ediniz.");
		System.err
				.println("\n\t\tKalan Deneme Hakkı: " + failedLoginCount + "\n\t\tDevam Etmek İçin Bir tuşa basınız.");
		String a = in.next();
		
	}
	
	private static int showMainMenu() {
		Map<Integer, String> menuLogin = new TreeMap();
		menuLogin.put(1, "Giriş Yap");
		menuLogin.put(2, "Hala bir Hesabınız Yok mu ?");
		menuLogin.put(99, "Güvenli Çıkış (0 & 99)");
		
		return ConsoleHelper.showMenu(APP_NAME, menuLogin);
		
	}
	
	public static void showLogin() {
		
		if (failedLoginCount > 0) {
			
			ConsoleHelper.printTitle("Hoş Geldiniz...", LINE_COUNT);
			
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
				failedLoginAlert();
				failedLoginCount--;
			}
		} else {
			
			System.err.println("\t\tÇok Fazla Başarısız Deneme Yaptınız.");
			System.err.println("\t\tLütfen Bankanız ile irtibata Geçiniz.");
			System.err.println("\t\tProgram Sonu!");
			System.exit(0);
			
		}
		
	}
	
	public static int showRegister() {
		ConsoleHelper.printTitle("Hoş Geldiniz...", LINE_COUNT);
		
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

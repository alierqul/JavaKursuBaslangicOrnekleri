/**
 * 
 */
package com.aliergul.oop.example01;

import java.util.Scanner;

import com.aliergul.bilgeadam.boost.util.ConsoleHelper;

/**
 * @author ERGUL
 *
 */
public class Login {
	private static final String TAG = "Login Sayfası";
	private static Scanner in = new Scanner(System.in);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		do {
			
			switch (showMenu()) {
				case 1:
					loginAPP();
					break;
				case 2:
					registerAPP();
					break;
				case 3:
					User.showAllUsers();
					break;
				default:
					break;
			}
			ConsoleHelper.printLine(TAG);
		} while (!ConsoleHelper.selectMenu("Çıkmak için Sıfır").equals("0"));
		ConsoleHelper.print("Yeni Bekleriz", 3, false);
	}
	
	private static void loginAPP() {
		String email, pass;
		ConsoleHelper.print("1 - Email    =", 2, false);
		email = in.nextLine();
		ConsoleHelper.print("1 - Password =", 2, false);
		pass = in.nextLine();
		User userDetais = User.loginEmailPass(email, pass);
		if (userDetais != null) {
			ConsoleHelper.printTitle("Hoş Geldiniz. ");
			showUserProfile(userDetais);
		} else {
			ConsoleHelper.printLine(TAG);
			ConsoleHelper.print("Hata: Giriş Başarısız", 2, true);
			
		}
	}
	
	private static void showUserProfile(User u) {
		ConsoleHelper.printLine(TAG);
		ConsoleHelper.print("isim      = " + u.getName(), 2, true);
		ConsoleHelper.print("Soyisim   = " + u.getSurname(), 2, true);
		ConsoleHelper.print("email     = " + u.getEmail(), 2, true);
		ConsoleHelper.print("Telefon   = " + u.getNumber(), 2, true);
		ConsoleHelper.print("Pasword   = " + "******", 2, true);
		
	}
	
	private static int showMenu() {
		ConsoleHelper.printTitle(TAG);
		ConsoleHelper.print("1 - Login", 2, true);
		ConsoleHelper.print("2 - Register", 2, true);
		ConsoleHelper.print("0 - Çıkış", 2, true);
		int secim = in.nextInt();
		in.nextLine();
		return secim;
	}
	
	private static void registerAPP() {
		String name, surname, num, email, pas;
		ConsoleHelper.print("1 - Name =", 2, false);
		name = in.nextLine();
		ConsoleHelper.print("1 - Surname =", 2, false);
		surname = in.nextLine();
		ConsoleHelper.print("1 - Email =", 2, false);
		email = in.nextLine();
		ConsoleHelper.print("1 - Telefon =", 2, false);
		num = in.nextLine();
		ConsoleHelper.print("1 - Password =", 2, false);
		pas = in.nextLine();
		User user = new User(name, surname, email, num, pas);
		User.addNewUser(user);
	}
	
}

/**
 * 
 */
package com.aliergul.bilgeadam.boost.examples;

import java.util.Scanner;

import com.aliergul.bilgeadam.boost.util.ConsoleHelper;

/**
 * @author ERGUL
 *
 */
public class Lesson_004_StringIslemleri2 {
	static Scanner secim;
	static Scanner in;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		secim = new Scanner(System.in);
		in = new Scanner(System.in);
		String oldPass = "";
		String newPass = "";
		do {
			System.out.print("Eski Şifre Gir: ");
			oldPass = in.nextLine();
			System.out.print("Yeni Şifre Gir: ");
			newPass = in.nextLine();
			showAnimate();
			if (Pasword.assign(oldPass, newPass)) {
				System.out.println("Şifre Değiştirildi.");
			} else {
				System.err.println("Hatalı İşlem. Şifre Değiştirme Başarısız.");
			}
		} while (secimYap());
		System.out.println("Program Sonu. \nYine Bekleriz.");
	}
	
	public static void showAnimate() {
		ConsoleHelper helper = new ConsoleHelper();
		for (int i = 0; i < 10; i++) {
			
			// simulate a piece of task
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	static boolean secimYap() {
		System.out.print("Tekrar deneyin Çıkış 0 ");
		String sec = secim.next();
		
		return sec.equals("0") ? false : true;
	}
	
	class Pasword {
		private static String pass = "";
		
		static boolean assign(String oldPassword, String newPasword) {
			String encodeOldPass = passEncode(oldPassword, true);
			if (encodeOldPass.equals(pass) && newPasword != null) {
				pass = passEncode(newPasword, true);
				return true;
			} else
				return false;
		}
		
		private static String passEncode(String pass, boolean encode) {
			if (pass.isEmpty())
				return "";
			char[] chrArray = pass.toCharArray();
			int i = 0;
			for (char c : chrArray) {
				if (encode) {
					chrArray[i] = (char) ((int) c - 10);
				} else {
					chrArray[i] = (char) ((int) c + 10);
				}
				i++;
			}
			return String.valueOf(chrArray);
		}
		
	}
}

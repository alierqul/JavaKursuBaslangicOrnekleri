/**
 * 
 */
package com.aliergul.bilgeadam.boost.examples;

import java.util.Scanner;

/**
 * @author ERGUL
 *         Kullanıcıdan alınan şifrenin tekrar doğrulanması.
 */
public class Example_019_PasswordRePasword {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String pass = "1";
		String rePass = "1";
		while (true) {
			
			System.out.println("\t\t======================================");
			System.out.println("\t\t===     Password Program           ===");
			System.out.println("\t\t======================================");
			System.out.print("\t\tPassword                : ");
			pass = in.next();
			System.out.print("\t\tPassword Tekrar giriniz : ");
			rePass = in.next();
			
			if (pass.equals(rePass)) {
				System.out.println("\n\n\t\tŞifreniz Başarıyla oluşturuldu.");
			} else {
				System.err.println("\n\n\t\tŞifreler eşleşmiyor.");
			}
			System.out.println("\n\n\t\tDevam etmek ister misiniz? [Çıkış=0]");
			System.out.println();
			if (in.next().equals("0"))
				break;
			
		}
		System.out.println("\n\n\t\t\t... Yine Bekleriz ...");
		in.close();
	}
	
}

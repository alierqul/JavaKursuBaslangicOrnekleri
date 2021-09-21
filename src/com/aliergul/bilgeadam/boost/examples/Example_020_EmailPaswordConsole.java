/**
 * 
 */
package com.aliergul.bilgeadam.boost.examples;

import java.util.Scanner;

/**
 * @author ERGUL
 *         Klavyeden girilecek email ve şifre kntrol edilecek.
 *         şifre ve email doğru ise admn sayfasına yönlendirilecek.
 *         şifre ve mail yanlışsa 4 kere yanlış hakkımız
 *         kartımız bloke oldu müşteri hizmetlerini arayınız
 *         444 555 99 99
 *         equal.IgnoreCase trim
 *         kullanıcının şifresni maskeleme
 *         döng kullanılacak.
 * 
 */
public class Example_020_EmailPaswordConsole {
	private static final String DB_EMAIL = "root@mail.com";
	private static final String DB_PASS = "root";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Scanner cikis = new Scanner(System.in);
		String email = "1";
		String pass = "1";
		int denemeHakki = 3;
		
		boolean hesapDurumu = true;
		
		System.out.println("\t\t======================================");
		System.out.println("\t\t===      Email Password            ===");
		while (true) {
			System.out.println("\t\t======================================");
			System.out.print("\n\t\t= Email    : ");
			email = in.nextLine().trim().toLowerCase();
			System.out.print("\t\t= Password : ");
			pass = in.nextLine().trim();
			
			if (email.equals(DB_EMAIL) && pass.equals(DB_PASS) && hesapDurumu) {
				loginPage();
				break;
			} else if (denemeHakki <= 1) {
				
				System.err.println("\n\t\tHesabınız Bloke oldu.\n\t\tmüşteri hizmetlerini arayınız 444 555 99 99    ");
				
			} else {
				denemeHakki -= 1;
				System.err.println("\n\t\tŞifre ya da email hatalı Tekrar Deneyiniz.\n\t\tKalan Deneme Hakkınız     :"
						+ denemeHakki);
				
			}
			System.err.print("\n\t\tTekrar denemek için = [E - e] [Çıkış=0]:");
			pass = cikis.next();
			if (pass.equals("0"))
				break;
		}
		System.out.println("\n\n\t\t\t... Yine Bekleriz ...");
		in.close();
		cikis.close();
	}
	
	static void loginPage() {
		System.out.println("\n\n\t\tAdmin Sayfasına yönlendiriliyorsunuz.");
		System.out.println("\n\t\tHoşgeldiniz  :" + DB_EMAIL);
		System.out.println("\n\n\t\tŞifreniz     : " + DB_PASS.replace(DB_PASS, "******"));
		
	}
	
}

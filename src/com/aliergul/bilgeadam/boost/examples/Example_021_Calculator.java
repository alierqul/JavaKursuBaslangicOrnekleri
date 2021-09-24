/**
 * 
 */
package com.aliergul.bilgeadam.boost.examples;

import java.util.Scanner;

import com.aliergul.bilgeadam.boost.util.ConsoleHelper;

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
 *         kullanıcdan almış olduğum 2 tane sayı
 *         1 tuşuna basarsa (toplama)
 *         2 tuşuna basarsa (çıkarma)
 *         3 tuşuna basarsa (bölme)
 *         4 tuşuna basarsa (çarpma)
 *         5 üslü sayı 4 2 (Math)
 *         6
 *         kullanıcıdan almış olduğumuz kelimeyi ters çevirecek
 *         java Malatya avaj
 * 		
 *         7 kullanıcıdan almış olduğumuz kelimenin içinde kaç tane a harfi
 *         var
 *         8 kullanıcıdan girmiş olduğu ş harfi varsa hepsini s çevirsin
 *         almış olduğumuz kelimeyi ters çevirecek
 * 		
 *         9 // kullanıcı tarafından kelimeyi tersten yazıdan algoritma
 *         // Bilge
 *         // egliB
 *         // elB
 *         // içerisindeki 'e' sessli harften kaç tane var
 *         // içesindeki 'e' sessli harfini çıkarsın
 *         // lB
 *         //
 *         //sonuçtan çıkan harfleri alsın farklı metoda verecek ve farklı
 *         metotta
 *         //0<=x<=10 5 bölünebilen sayıları çıkarsın
 *         //lB12346789
 *         0 tuşuna basarsa (çıkış yapsın)
 * 		
 */
public class Example_021_Calculator {
	private static final String DB_EMAIL = "root@mail.com";
	private static final String DB_PASS = "root";
	private static final String TITLE_GIRIS = "-Login Ekranı-";
	private static final String TITLE_MENU = "- ADMİN PANELİ -";
	private static Scanner secimTusu;
	private static Scanner in;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new Scanner(System.in);
		secimTusu = new Scanner(System.in);
		String email = "1";
		String pass = "1";
		
		int denemeHakki = 3;
		boolean hesapDurumu = true;
		
		makeTitle(TITLE_GIRIS);
		while (true) {
			makeLine(TITLE_GIRIS);
			System.out.print("\n\t\t= Email    : ");
			email = in.nextLine().trim().toLowerCase();
			System.out.print("\t\t= Password : ");
			pass = in.nextLine().trim();
			
			if (email.equals(DB_EMAIL) && pass.equals(DB_PASS) && hesapDurumu) {
				loginPage(email, pass);
				break;
			} else if (denemeHakki <= 1) {
				System.err.println("\n\t\tEmail:" + email + "\n\t\tŞifre: " + maskPassword(pass)
						+ "\n\t\tHesabınız Bloke oldu.\n\t\tmüşteri hizmetlerini arayınız 444 555 99 99    ");
				
			} else {
				denemeHakki -= 1;
				System.err.println("\n\t\tEmail:" + email + "\n\t\tŞifre: " + maskPassword(pass)
						+ "\n\t\tŞifre ya da email hatalı Tekrar Deneyiniz.\n\t\tKalan Deneme Hakkınız     :"
						+ denemeHakki);
				
			}
			System.err.print("\n\t\tTekrar denemek için = [E - e] [Çıkış=0]:");
			pass = secimTusu.next();
			if (pass.equals("0"))
				break;
		}
		System.out.println("\n\n\t\t\t... Yine Bekleriz ...");
		in.close();
		
		secimTusu.close();
	}
	
	static String maskPassword(String pass) {
		StringBuilder mask = new StringBuilder();
		for (int i = 0; i < pass.length(); i++) {
			mask.append("*");
		}
		return mask.toString();
		
	}
	
	static void loginPage(String email, String pass) {
		System.out.println("\n\n\t\tAdmin Sayfasına yönlendiriliyorsunuz.");
		System.out.print("\n\t\tHoşgeldiniz  :\n\t\tEmail        : " + email);
		System.out.println("\n\t\tŞifreniz     : " + maskPassword(pass));
		int secim = 1;
		while ((secim = viewMainMenu()) != 0) {
			switch (secim) {
				case 1: {
					toplaIslemi();
					break;
				}
				case 2: {
					cikarmaIslemi();
					break;
				}
				case 3: {
					carpmaIslemi();
					break;
				}
				case 4: {
					bolmeIslemi();
					break;
				}
				case 5: {
					usAlmaIslemi();
					break;
				}
				case 6: {
					reverseString();
					break;
				}
				case 7: {
					sayHarfIslemi();
					break;
				}
				case 8: {
					turkceKarekter();
					break;
				}
				case 9: {
					soruDokuzCozum();
					break;
				}
				
			}
			// Döngü sonu
			
		}
		
	}
	
	private static void makeTitle(String msg) {
		makeLine(msg);
		System.out.printf("\t\t==== %s ====", msg);
		makeLine(msg);
	}
	
	private static void makeLine(String msg) {
		int msgLong = msg.length();
		int lineLong = (msgLong % 2 == 0) ? msgLong + 10 : msgLong + 11;
		System.out.print("\n\t\t");
		for (int i = 0; i < lineLong; i++) {
			System.out.print("=");
		}
		System.out.print("\n");
	}
	
	private static int viewMainMenu() {
		
		makeTitle(TITLE_MENU);
		System.out.println("\t\t= 1- Toplama");
		System.out.println("\t\t= 2- Çıkarma");
		System.out.println("\t\t= 3- Çarpma");
		System.out.println("\t\t= 4- Bölme");
		System.out.println("\t\t= 5- Üslü Sayı alma");
		System.out.println("\t\t= 6- Girilen Kelimenin tersini yazdırma");
		System.out.println("\t\t= 7- Girilen metinin içinde istenen Harfleri sayma");
		System.out.println("\t\t= 8- Girilen metinin içinde Türkçe karakterleri bulma ve düzeltme");
		System.out.println("\t\t= 9- Girilen metinin ters cevir e leri sil tekrar yaz bla bla bla");
		System.out.print("\n\t\t= Lütfen Seçim yapınız. Çıkmak için [0] tuşlamanız yeterlidir.");
		int sayi = secimTusu.nextInt();
		return sayi;
	}
	
	private static void toplaIslemi() {
		makeLine(TITLE_MENU);
		System.out.print("\n\t\t= Birinci Sayı    : ");
		int a = in.nextInt();
		System.out.print("\n\t\t= İkinci Sayı     : ");
		int b = in.nextInt();
		System.out.print("\n\t\t= Toplam Sonucu   : " + (a + b));
		
	}
	
	private static void cikarmaIslemi() {
		makeLine(TITLE_MENU);
		System.out.print("\n\t\t= Birinci Sayı     : ");
		int a = in.nextInt();
		System.out.print("\n\t\t= İkinci Sayı      : ");
		int b = in.nextInt();
		System.out.print("\n\t\t= Çıkarma Sonucu   : " + (a - b));
		
	}
	
	private static void carpmaIslemi() {
		makeLine(TITLE_MENU);
		System.out.print("\n\t\t= Birinci Sayı    : ");
		int a = in.nextInt();
		System.out.print("\n\t\t= İkinci Sayı     : ");
		int b = in.nextInt();
		System.out.print("\n\t\t= Çarpma Sonucu   : " + (a * b));
		
	}
	
	private static void bolmeIslemi() {
		makeLine(TITLE_MENU);
		System.out.print("\n\t\t= Birinci Sayı       : ");
		int a = in.nextInt();
		System.out.print("\n\t\t= İkinci Sayı        : ");
		int b = in.nextInt();
		if (b == 0) {
			System.out.print("\n\t\t= Tanımsız       : " + (a - b));
		} else
			System.out.print("\n\t\t= Bölme Sonucu   : " + ((double) a / b));
		
	}
	
	private static void usAlmaIslemi() {
		makeLine(TITLE_MENU);
		System.out.print("\n\t\t= Birinci Sayı       : ");
		int a = in.nextInt();
		System.out.print("\n\t\t= Üs Derecesi        : ");
		int b = in.nextInt();
		if (b == 0) {
			System.out.print("\n\t\t= Tanımsız       : " + (a - b));
		} else
			System.out.print("\n\t\t= Üs Alma        : " + Math.pow(a, b));
		
	}
	
	private static void sayHarfIslemi() {
		makeLine(TITLE_MENU);
		System.out.print("\n\t\t= Metin Gir              : ");
		String msg = in.nextLine().trim();
		System.out.print("\n\t\t= Bulunacak Karakter     : ");
		char chr = in.nextLine().charAt(0);
		
		System.out.printf("\n\t\t= %s Harfi Sayısı        : %d \n", chr,
				ConsoleHelper.sayHarf(msg, String.valueOf(chr)));
		
	}
	
	private static void turkceKarekter() {
		makeLine(TITLE_MENU);
		int sum = 0;
		System.out.print("\n\t\t= Metin Gir              : ");
		String msg = in.nextLine().trim().toLowerCase();
		String newStr = "";
		char[] charArray = msg.toCharArray();
		
		for (int i = 0; i < msg.length(); i++) {
			switch (charArray[i]) {
				case 'ş': {
					newStr += 's';
					break;
				}
				case 'ğ': {
					newStr += 'g';
					break;
				}
				case 'ç': {
					newStr += 'c';
					break;
				}
				case 'ö': {
					newStr += 'o';
					break;
				}
				case 'ü': {
					newStr += 'u';
					break;
				}
				default:
					newStr += charArray[i];
					break;
			}
		}
		System.out.printf("\n\t\t= Düzeltilmiş Kelime        : %s \n", newStr);
		
	}
	
	private static void reverseString() {
		makeLine(TITLE_MENU);
		System.out.print("\n\t\t= Metin Giriniz       : ");
		String str = in.nextLine().trim();
		int strLength = str.length();
		System.out.print("\n\t\t= Metin Tersi         : " + ConsoleHelper.reverseString(str));
		
	}
	
	private static void soruDokuzCozum() {
		makeLine(TITLE_MENU);
		
		String newStr = "";
		System.out.print("\n\t\t=Soru 9 - Metin Gir              : ");
		String msg = in.nextLine().trim().toLowerCase();
		
		newStr = ConsoleHelper.reverseString(msg);
		System.out.print("\n\t\t 1) Tersi: " + newStr);
		newStr = ConsoleHelper.silTekSayiHarfMetin(newStr);
		System.out.println("\n\t\t 2) TekSayilar sil: " + newStr);
		System.out.println("\n\t\t 3)  Bulunan e sayısı: " + ConsoleHelper.sayHarf(newStr, "e"));
		newStr = ConsoleHelper.cikarHarf(newStr, "e");
		System.out.println("\n\t\t 4) e harfleri çıktı " + newStr);
		newStr = farkliMethod(newStr);
		System.out.println("\n\t\t 5) e 12346789 ekle " + newStr);
	}
	
	private static String farkliMethod(String string) {
		StringBuilder builder = new StringBuilder(string + " ");
		
		for (int i = 1; i <= 10; i++) {
			builder.append((i % 5 == 0) ? "" : Integer.valueOf(i));
		}
		return builder.toString();
		// StringBuilder StringBuffer nelerdir farkları
		// sync
	}
	
}

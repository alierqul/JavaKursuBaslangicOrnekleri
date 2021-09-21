/**
 * 
 */
package com.aliergul.bilgeadam.boost.examples;

import java.util.Scanner;

/**
 * @author ERGUL
 *
 */
public class Lesson_003_StringFonksiyonlari {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String kelime = "java Servlet jsp Jsf Spring";
		// System.out.println(kelime);
		// System.out.println("simge sayısı: " + kelime.length());
		// System.out.println(kelime.toUpperCase());
		// System.out.println(kelime.toLowerCase());
		// String kelime2 = kelime.replace('ı', 'i');
		// // System.out.println(kelime);
		// System.out.println(kelime2);
		// System.out.println(kelime);
		// System.out.println(kelime.concat(" -sonradan ekledim").concat(" 44"));
		// System.out.println(kelime.substring(3));
		// System.out.println(kelime.substring(0, 2).concat("***"));
		// System.out.println("Simge sayısı "+kelime.length());
		// System.out.println("başındaki ve sonundaki boşlukları
		// al"+kelime.trim().length());
		// System.out.println("ile mi başlıyor "+kelime.startsWith("H"));
		// System.out.println("ile mi bitiyor "+kelime.endsWith(" "));
		// System.out.println(kelime.isEmpty()); // dolu=false
		// if (!kelime.isEmpty()) {
		// System.out.println("dolu");
		// } else {
		// System.out.println("boş");
		// }
		// String cumle = "Jsp".toLowerCase();
		// System.out.println(kelime.indexOf(cumle));
		// System.out.println(kelime.charAt(0));
		// java Servlet jsp Jsf Spring
		// System.out.println(kelime.contains("java Servlet jsp Jsf Spring"));
		// System.out.println(kelime.contains("Java Servlet jsp Jsf Spring"));
		// System.out.println(kelime.contains("Servlet"));
		
		// kullanıcının girmiş olduğu bir kelimenin;
		// eleman sayısını ?
		// bütün karakterleri küçük yapsın
		// bütün karakterleri büyük yapsın
		// başı a ile baişlıyorsa evet a ile başlıyor
		// sonu a ile bitiyorsa evet a ile bitiyor
		// 0 -10 arasındaki bize göstersin sonuna ...
		// kelimenin sonuna "Bilge Adam" eklensin
		ornekGoster();
	}
	
	private static void ornekGoster() {
		Scanner in = new Scanner(System.in);
		String metin = "";
		int uzunluk = 0;
		System.out.print("Bir Metin Giriniz: ");
		metin = in.nextLine();
		uzunluk = metin.length();
		System.out.println("Kelimenin Karekter Sayısı= " + uzunluk);
		System.out.println("Tümü Küçük Harf: " + metin.toLowerCase());
		System.out.println("Tümü Büyük Harf: " + metin.toUpperCase());
		System.out.println("Başdan ilk harf:  " + metin.substring(0, 1));
		System.out.println("Sondan ilk harf:  " + metin.substring((uzunluk - 1), uzunluk));
		System.out.println(uzunluk > 10 ? metin.substring(0, 10).concat("...") : "");
		System.out.println("Metin= " + metin.concat("-BilgeAdam"));
	}
	
}

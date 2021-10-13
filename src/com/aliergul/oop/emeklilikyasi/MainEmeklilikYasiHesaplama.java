package com.aliergul.oop.emeklilikyasi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.aliergul.bilgeadam.boost.util.ConsoleHelper;

public class MainEmeklilikYasiHesaplama {
	private static Scanner in;
	
	/**
	 * main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		in = new Scanner(System.in);
		List<Person> listPerson = new ArrayList<>();
		do {
			Person p = enterSomeOnesPerson(); // Bilgiler Alındı.
			listPerson.add(p);
			try {
				System.out.printf("%-20s : %d%n", "Emeklilik Yaşınız", p.getRetirementAge());
				System.out.printf("%-20s : %d%n", "Sizin Yaşınız", p.calculateAge());
				System.out.printf("%-20s : %d%n", "Kalan Seneniz", p.calculateRemainingTimeRetirement());
				
			} catch (IllegalArgumentException e) {
				System.out.println("Birşeyler Ters Gitti. \nTekrar Deneyelim.\n" + e.getMessage());
			}
			
			System.out.printf("%-20s :\n", "Çıkmak için [0] Giriniz \nTekrar denemek için herhangi sayı giriniz.");
			
		} while (ConsoleHelper.selectDigitSecim() != 0);
	}
	
	/**
	 * Bilgilerin girildiği yer
	 * ?
	 * 
	 * @return
	 */
	private static Person enterSomeOnesPerson() {
		do {
			
			try {
				Person person = new Person();
				
				person.setName(ConsoleHelper.readString(String.format("%-20s : ", "Adınız")));
				person.setSurnama(ConsoleHelper.readString(String.format("%-20s :", "Soyadı")));
				person.setBirthDay(ConsoleHelper.readString(String.format("%-20s :", "Doğum Tarihi (gün.ay.yıl)")));
				person.setGender(ConsoleHelper.readString(String.format("%-20s :", "Cinsiyet E/B")).trim().toUpperCase()
						.charAt(0));
				
				return person;
			} catch (Exception e) {// Hataları burda yakalıyorum. :)
				System.out.println("Birşeyler Ters Gitti. \nTekrar Deneyelim.\n" + e.getMessage());
			}
		} while (true);
		
	}
	
}

/**
 * 
 */
package com.aliergul.bilgeadam.boost.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author ERGUL
 *
 */
public class Lesson_008_Collecions {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lesson_008_Collecions lesson_008_Collecions = new Lesson_008_Collecions();
		lesson_008_Collecions.anaYemek();
	}
	
	// **********
	// Akşam yemeğine Ben bugun ne yapsam ?//metot ve diziler List,Set,Map
	// Ana yemekler ==> kuru fasülye,adana kebab,Pilav v.s
	// Sıcak yemek ==> mercimek corbası,domates çorbası
	// içecekler ==> su ,soda,
	// Yemekten sonra içilecekler ==> çay , kahve olsun
	// tatlılar ==> revani , kıbrıs tatlılar
	// v.s//adanakebab,mercimekcorbası,soda,çay,revani
	public void anaYemek() {
		// LAV
		String[] GUNLER = { "PAZARTESİ", "SALI", "ÇARŞAMBA", "PERŞEMBE", "CUMA", "CUMARTESİ", "PAZAR" };
		List<String> listAnaYemekler = new ArrayList<String>();
		listAnaYemekler.add("Kebab");
		listAnaYemekler.add("Kuru Fasulye");
		listAnaYemekler.add("Pilav");
		listAnaYemekler.add("Güveç");
		listAnaYemekler.add("İmambayıldı");
		listAnaYemekler.add("Türlü");
		listAnaYemekler.add("Ezme");
		listAnaYemekler.add("Dolma");
		List<String> listAraSicaklar = new ArrayList<String>();
		listAraSicaklar.add("Mercimek Çorbası");
		listAraSicaklar.add("Domates Çorbası");
		listAraSicaklar.add("Ezo Gelin Çorbası");
		List<String> listIcecekler = new ArrayList<String>();
		listIcecekler.add("su");
		listIcecekler.add("soda");
		listIcecekler.add("Kola");
		listIcecekler.add("Ayran");
		List<String> listKeyifIcecekler = new ArrayList<String>();
		listKeyifIcecekler.add("Çay");
		listKeyifIcecekler.add("Nescafe");
		listKeyifIcecekler.add("Türk Kahvesi");
		List<String> listTatlilar = new ArrayList<String>();
		listTatlilar.add("Revani");
		listTatlilar.add("Kıbrıs Tatlısı");
		listTatlilar.add("Sütlaç");
		listTatlilar.add("Baklama");
		listTatlilar.add("Kadayıf");
		
		Random rnd = new Random();
		for (int i = 0; i < 7; i++) {
			
			System.out.printf("%n%d - %-10s . Günün Menüsü %n%n", (i + 1), GUNLER[i]);
			System.out.printf("%-20s :%s%n", "Ana Yemek ", listAnaYemekler.get(rnd.nextInt(listAnaYemekler.size())));
			System.out.printf("%-20s :%s%n", "Ara Sıcak Yemek",
					listAraSicaklar.get(rnd.nextInt(listAraSicaklar.size())));
			System.out.printf("%-20s :%s%n", "içecek", listIcecekler.get(rnd.nextInt(listIcecekler.size())));
			System.out.printf("%-20s :%s%n", "yemek sonrası ",
					listKeyifIcecekler.get(rnd.nextInt(listKeyifIcecekler.size())));
			System.out.printf("%-20s :%s%n", "Tatlı ", listTatlilar.get(rnd.nextInt(listTatlilar.size())));
		}
	}
	
}

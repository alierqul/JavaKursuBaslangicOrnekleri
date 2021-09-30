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
		YemekListesi menu = new YemekListesi();
		for (int i = 0; i < 7; i++) {
			System.out.println(menu.createRandomMenu());
		}
	}
	
	// **********
	// Akşam yemeğine Ben bugun ne yapsam ?//metot ve diziler List,Set,Map
	// Ana yemekler ==> kuru fasülye,adana kebab,Pilav v.s
	// Sıcak yemek ==> mercimek corbası,domates çorbası
	// içecekler ==> su ,soda,
	// Yemekten sonra içilecekler ==> çay , kahve olsun
	// tatlılar ==> revani , kıbrıs tatlılar
	// v.s//adanakebab,mercimekcorbası,soda,çay,revani
	/*
	 * Sınıfsız Çözüm
	 * public void anaYemek() {
	 * // LAV
	 * String[] GUNLER = { "PAZARTESİ", "SALI", "ÇARŞAMBA", "PERŞEMBE", "CUMA",
	 * "CUMARTESİ", "PAZAR" };
	 * List<String> listAnaYemekler = new ArrayList<String>();
	 * listAnaYemekler.add("Kebab");
	 * listAnaYemekler.add("Kuru Fasulye");
	 * listAnaYemekler.add("Pilav");
	 * listAnaYemekler.add("Güveç");
	 * listAnaYemekler.add("İmambayıldı");
	 * listAnaYemekler.add("Türlü");
	 * listAnaYemekler.add("Ezme");
	 * listAnaYemekler.add("Dolma");
	 * List<String> listAraSicaklar = new ArrayList<String>();
	 * listAraSicaklar.add("Mercimek Çorbası");
	 * listAraSicaklar.add("Domates Çorbası");
	 * listAraSicaklar.add("Ezo Gelin Çorbası");
	 * List<String> listIcecekler = new ArrayList<String>();
	 * listIcecekler.add("su");
	 * listIcecekler.add("soda");
	 * listIcecekler.add("Kola");
	 * listIcecekler.add("Ayran");
	 * List<String> listKeyifIcecekler = new ArrayList<String>();
	 * listKeyifIcecekler.add("Çay");
	 * listKeyifIcecekler.add("Nescafe");
	 * listKeyifIcecekler.add("Türk Kahvesi");
	 * List<String> listTatlilar = new ArrayList<String>();
	 * listTatlilar.add("Revani");
	 * listTatlilar.add("Kıbrıs Tatlısı");
	 * listTatlilar.add("Sütlaç");
	 * listTatlilar.add("Baklama");
	 * listTatlilar.add("Kadayıf");
	 * Random rnd = new Random();
	 * for (int i = 0; i < 7; i++) {
	 * System.out.printf("%n%d - %-10s . Günün Menüsü %n%n", (i + 1), GUNLER[i]);
	 * System.out.printf("%-20s :%s%n", "Ana Yemek ",
	 * listAnaYemekler.get(rnd.nextInt(listAnaYemekler.size())));
	 * System.out.printf("%-20s :%s%n", "Ara Sıcak Yemek",
	 * listAraSicaklar.get(rnd.nextInt(listAraSicaklar.size())));
	 * System.out.printf("%-20s :%s%n", "içecek",
	 * listIcecekler.get(rnd.nextInt(listIcecekler.size())));
	 * System.out.printf("%-20s :%s%n", "yemek sonrası ",
	 * listKeyifIcecekler.get(rnd.nextInt(listKeyifIcecekler.size())));
	 * System.out.printf("%-20s :%s%n", "Tatlı ",
	 * listTatlilar.get(rnd.nextInt(listTatlilar.size())));
	 * }
	 * }
	 */
}

class YemekListesi {
	private static final String[] GUNLER = { "PAZARTESİ", "SALI", "ÇARŞAMBA", "PERŞEMBE", "CUMA", "CUMARTESİ",
			"PAZAR" };
	private static final String TAG_ANA_YEMEK = "Ana Yemek";
	private static final String TAG_ARASICAK = "Ara Sıcak yemek";
	private static final String TAG_ICECEK = "İçecek Seçimi";
	private static final String TAG_YEMEKSONRASI = "Yemek Sonrası İçecek";
	private static final String TAG_TATLI = "Tatlı";
	private static List<String> listAnaYemekler = new ArrayList<String>();
	private static List<String> listAraSicaklar = new ArrayList<String>();
	private static List<String> listIcecekler = new ArrayList<String>();
	private static List<String> listKeyifIcecekler = new ArrayList<String>();
	private static List<String> listTatlilar = new ArrayList<String>();
	
	static {
		listAnaYemekler.add("Kebab");
		listAnaYemekler.add("Kuru Fasulye");
		listAnaYemekler.add("Pilav");
		listAnaYemekler.add("Güveç");
		listAnaYemekler.add("İmambayıldı");
		listAnaYemekler.add("Türlü");
		listAnaYemekler.add("Ezme");
		listAnaYemekler.add("Dolma");
		
		listAraSicaklar.add("Mercimek Çorbası");
		listAraSicaklar.add("Domates Çorbası");
		listAraSicaklar.add("Ezo Gelin Çorbası");
		
		listIcecekler.add("su");
		listIcecekler.add("soda");
		listIcecekler.add("Kola");
		listIcecekler.add("Ayran");
		
		listKeyifIcecekler.add("Çay");
		listKeyifIcecekler.add("Nescafe");
		listKeyifIcecekler.add("Türk Kahvesi");
		
		listTatlilar.add("Revani");
		listTatlilar.add("Kıbrıs Tatlısı");
		listTatlilar.add("Sütlaç");
		listTatlilar.add("Baklama");
		listTatlilar.add("Kadayıf");
	}
	private String anaYemek;
	private String araSicak;
	private String icecek;
	private String keyifIcecek;
	private String tatli;
	
	public YemekListesi() {
		
	}
	
	public YemekListesi(String anaYemek, String araSicak, String icecek, String keyifIcecek) {
		this.anaYemek = anaYemek;
		this.araSicak = araSicak;
		this.icecek = icecek;
		this.keyifIcecek = keyifIcecek;
	}
	
	public YemekListesi createRandomMenu() {
		Random rnd = new Random();
		YemekListesi menu = new YemekListesi();
		menu.setAnaYemek(listAnaYemekler.get(rnd.nextInt(listAnaYemekler.size())));
		menu.setAraSicak(listAraSicaklar.get(rnd.nextInt(listAraSicaklar.size())));
		menu.setIcecek(listIcecekler.get(rnd.nextInt(listIcecekler.size())));
		menu.setKeyifIcecek(listKeyifIcecekler.get(rnd.nextInt(listKeyifIcecekler.size())));
		menu.setTatli(listTatlilar.get(rnd.nextInt(listTatlilar.size())));
		
		return menu;
	}
	
	public static void addListAnaYemekler(String yemekAdi) {
		listAnaYemekler.add(yemekAdi);
	}
	
	public static void addListAraSicaklar(String yemekAdi) {
		listAraSicaklar.add(yemekAdi);
	}
	
	public static void addListIcecekler(String icecekAdi) {
		listIcecekler.add(icecekAdi);
	}
	
	public static void addListKeyifIcecekler(String icecekAdi) {
		listKeyifIcecekler.add(icecekAdi);
	}
	
	public static void addListTatlilar(String tatliAdi) {
		listTatlilar.add(tatliAdi);
	}
	
	public String getAnaYemek() {
		return anaYemek;
	}
	
	public void setAnaYemek(String anaYemek) {
		this.anaYemek = anaYemek;
	}
	
	public String getAraSicak() {
		return araSicak;
	}
	
	public void setAraSicak(String araSicak) {
		this.araSicak = araSicak;
	}
	
	public String getIcecek() {
		return icecek;
	}
	
	public void setIcecek(String icecek) {
		this.icecek = icecek;
	}
	
	public String getKeyifIcecek() {
		return keyifIcecek;
	}
	
	public void setKeyifIcecek(String keyifIcecek) {
		this.keyifIcecek = keyifIcecek;
	}
	
	public String getTatli() {
		return tatli;
	}
	
	public void setTatli(String tatli) {
		this.tatli = tatli;
	}
	
	public static List<String> getListAnaYemekler() {
		return listAnaYemekler;
	}
	
	public static List<String> getListAraSicaklar() {
		return listAraSicaklar;
	}
	
	public static List<String> getListIcecekler() {
		return listIcecekler;
	}
	
	public static List<String> getListKeyifIcecekler() {
		return listKeyifIcecekler;
	}
	
	public static List<String> getListTatlilar() {
		return listTatlilar;
	}
	
	@Override
	public String toString() {
		return String.format("%-20s :%s %n%-20s :%s %n%-20s :%s %n%-20s :%s %n%-20s :%s %n", TAG_ANA_YEMEK, anaYemek,
				TAG_ARASICAK, araSicak, TAG_ICECEK, icecek, TAG_YEMEKSONRASI, keyifIcecek, TAG_TATLI, tatli);
		
	}
	
}

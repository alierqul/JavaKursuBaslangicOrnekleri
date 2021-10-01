/**
 * 
 */
package com.aliergul.bilgeadam.boost.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.aliergul.bilgeadam.boost.util.ConsoleHelper;
import com.aliergul.bilgeadam.boost.util.MyOnlineDataHelper;

/**
 * JSON lib kullanmadan String ArrayList Map Array kullanarak. String Düzenleme
 * Bol Bol Map kullanalım Map öğrenelim.
 * Listeler örnek
 * StringTokenizer a bir bakış.
 * 
 * @author ERGUL
 *
 */
public class Example_025_Chalenge {
	private static final String TAG = "-Hava Durumu Programı-";
	private static final String TAG_CITY = "city";
	private static final String TAG_COUNTY = "county";
	private static final String TAG_COUNTRY = "country";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ConsoleHelper.printTitle(TAG);
		
		Map<String, String> mapCityDetails = new HashMap<String, String>();
		// Ülke Şehi Bilgisi Al:
		mapCityDetails = readCityDetails();
		
		// Şehir bilgisi local konum bilgileri alındı.
		String dateCity = MyOnlineDataHelper.getDirectData(mapCityDetails.get(TAG_COUNTY), mapCityDetails.get(TAG_CITY),
				mapCityDetails.get(TAG_COUNTRY));
		// Enlem Boylam Değerini Bul
		double[] countLatLon = findLatandLon(toListDataTitleandValue(dateCity));
		mainDayofWeather(countLatLon);
		mainFifteenHoursWeather(mapCityDetails);
	}
	
	private static void mainFifteenHoursWeather(Map<String, String> mapCity) {
		String strFifteenHoursWeather = MyOnlineDataHelper.getForecastData(mapCity.get(TAG_COUNTY),
				mapCity.get(TAG_CITY), mapCity.get(TAG_COUNTRY));
		System.out.println(strFifteenHoursWeather);
		
	}
	
	private static void mainDayofWeather(double[] countLatLon) {
		ConsoleHelper.print("Lat= " + countLatLon[0] + "\n\t\t" + "Lon= " + countLatLon[1], 2, true);
		// Hava Durumunu Göster:
		ConsoleHelper.print("Günlük Hava Raporu :", 3, true);
		String dataWeather = MyOnlineDataHelper.getWeatherData(countLatLon[0], countLatLon[1]);
		viewWeatherofDay(toListDataTitleandValue(dataWeather));
	}
	
	public static Map<String, String> readCityDetails() {
		Scanner in = new Scanner(System.in);
		Map<String, String> countyDetails = new HashMap<String, String>();
		ConsoleHelper.print("il Bilgisi Giriniz: ", 2, false);
		// countyDetails.put("city", in.next().trim());
		ConsoleHelper.print("ilçe Bilgisi Giriniz: ", 2, false);
		// countyDetails.put("county", in.next().trim());
		ConsoleHelper.print("ülke Bilgisi Giriniz: ", 2, false);
		// countyDetails.put("country", in.next().trim.upperCase());
		countyDetails.put("county", "polatlı");
		countyDetails.put("city", "ankara");
		countyDetails.put("country", "TR");
		// Tarih Bilgisi alındı
		ConsoleHelper.print("Tarih: " + MyOnlineDataHelper.dateAsString(Long.parseLong("1632646800")), 2, true);
		ConsoleHelper.print("Saat: " + MyOnlineDataHelper.timeAsString(Long.parseLong("1632646800")), 2, true);
		System.out.println();
		return countyDetails;
	}
	
	/**
	 * Düzenlenmiş Listede Hava durumu verilerini Ekrana basan program.
	 * 
	 * @param list
	 */
	public static void viewWeatherofDay(List<String> list) {
		// "description":"açık"
		// "temp":18.14,"feels_like":16.74,"temp_min":18.14,"temp_max":18.14
		ConsoleHelper.print("Hava Durumu : " + findKeytoListArray(list, "description"), 2, true);
		ConsoleHelper.print("Sıcaklık    : " + findKeytoListArray(list, "temp"), 2, true);
		ConsoleHelper.print("Hissedilen  : " + findKeytoListArray(list, "feels_like"), 2, true);
		ConsoleHelper.print("En Az       : " + findKeytoListArray(list, "temp_min"), 2, true);
		ConsoleHelper.print("En Çok      : " + findKeytoListArray(list, "temp_max"), 2, true);
		
	}
	
	/**
	 * Düzenlenmiş listede verilen key değerine index değerini bulduktan sonra bir
	 * sonraki index de value değerini geri gönderiyor.
	 * 
	 * @param list
	 * @param key
	 * @return
	 */
	public static String findKeytoListArray(List<String> list, String key) {
		int index = list.indexOf(key);
		return list.get(index + 1);
	}
	
	/**
	 * Düzenlenmiş listede Enlem ve Boylam Değerini bir double dizisinde geri
	 * gönderiyor.
	 * 
	 * @param list
	 * @return
	 */
	public static double[] findLatandLon(List<String> list) {
		double[] d = new double[2];
		
		int latIx = list.indexOf("lat");
		int lonIx = list.indexOf("lon");
		d[0] = Double.parseDouble(list.get(latIx + 1));
		d[1] = Double.parseDouble(list.get(lonIx + 1));
		return d;
	}
	/*
	 * // JSon Lib Kullanmadan String ifade de Arama Yapma.
	 * // Çalışıyor ama verimli değil.
	 * public static String findKeytoValue(String data, String key) {
	 * int startKey = data.indexOf(key + "\"");
	 * // "lat":39.5961,"lon":27.0244
	 * // key.length()+2 lat 3 karakter ": 2 karakter toplamından sıra başlasın
	 * String findedValue = data.substring(startKey + key.length() + 2,
	 * data.length());
	 * findedValue = findedValue.substring(0, findedValue.indexOf(","));
	 * return findedValue;
	 * }
	 */
	
	/**
	 * Gelen verideki işaretleri kaldırarak ardışık bir şekilde listeye alan Method:
	 * 
	 * @param data
	 * @return
	 */
	public static List<String> toListDataTitleandValue(String data) {
		List<String> list = new ArrayList<>();
		StringTokenizer tokenizer = new StringTokenizer(data, "[]{}:,\"");
		while (tokenizer.hasMoreTokens()) {
			list.add(tokenizer.nextToken());
			
		}
		
		return list;
	}
	
}

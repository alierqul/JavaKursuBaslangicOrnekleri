/**
 * 
 */
package com.aliergul.bilgeadam.boost.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
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
 *         NO2 PM10 O3 PM25 (optional)
 */
public class Example_025_Chalenge {
	private static final String TAG = "-Hava Durumu Programı-";
	private static List<String> TERIMLER = Arrays.asList("city", "county", "country", "description", "temp",
			"feels_like", "temp_min", "temp_max", "lat", "lon", "aqi", "no2", "pm10", "o3", "pm2_5");
	private static Scanner in = new Scanner(System.in);
	private static Map<String, Object> mapDetails = new HashMap<>();
	private static Map<String, String> mapCityDetails = new HashMap<>();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		do {
			switch (showMainMenu()) {
				case "1":
					mapCityDetails = readCityDetails();
					ConsoleHelper.print("Enlem Değeri = " + mapDetails.get(TERIMLER.get(8)), 2, true);
					ConsoleHelper.print("Boylam Değeri= " + mapDetails.get(TERIMLER.get(9)), 2, true);
					break;
				case "2":
					if (mapDetails.get(TERIMLER.get(8)) == null)
						mapCityDetails = readCityDetails();
					mainDayofWeather((double) mapDetails.get(TERIMLER.get(8)),
							(double) mapDetails.get(TERIMLER.get(9)));
					
					break;
				case "3":
					if (mapDetails.get(TERIMLER.get(8)) == null)
						mapCityDetails = readCityDetails();
					mainPolutionData((double) mapDetails.get(TERIMLER.get(8)),
							(double) mapDetails.get(TERIMLER.get(9)));
					
					break;
				case "4":
					if (mapCityDetails.get(TERIMLER.get(0)) == null)
						mapCityDetails = readCityDetails();
					mainFifteenHoursWeather(mapCityDetails);
					
					break;
				case "0":
					ConsoleHelper.print("Yine Bekleriz... ", 3, false);
					System.exit(0);
					break;
				default:
					break;
			}
			ConsoleHelper.printLine(TAG);
		} while (!ConsoleHelper.selectMenu("Farklı bir yer denemek için 1 Çıkmak için 0 yazınız.").equals("0"));
		ConsoleHelper.print("Yine Bekleriz... ", 3, false);
		
	}
	
	private static void mainPolutionData(double lat, double lon) {
		ConsoleHelper.print("İl  = " + mapCityDetails.get(TERIMLER.get(0)) + "\n\t\t" + "İlçe= "
				+ mapCityDetails.get(TERIMLER.get(1)), 2, true);
		ConsoleHelper.print("Enlem  = " + lat + "\n\t\t" + "Boylam = " + lon, 2, true);
		String dataPolution = MyOnlineDataHelper.getPolutionData(lat, lon);
		viewDataPolution(toListDataTitleandValue(dataPolution));
		
	}
	
	/**
	 * main.aqi Air Quality Index. Possible values: 1, 2, 3, 4, 5.
	 * Where 1 = Good, 2 = Fair, 3 = Moderate, 4 = Poor, 5 = Very Poor.
	 * _____________NO2 _____PM10___ O3_______ PM25(optional)
	 * Good ______1_ 0-50_____ 0-25___ 0-60_____ 0-15
	 * Fair ______2_ 50-100___ 25-50 _ 60-120 __ 15-30
	 * Moderate __3_ 100-200__ 50-90__ 120-180__ 30-55
	 * Poor ______4_ 200-400__ 90-180_ 180-240__ 55-110
	 * Very Poor_ 5_ >400_____ >180___ >240_____ >110
	 * 
	 * @param listDataTitleandValue
	 */
	private static void viewDataPolution(List<String> listDataTitleandValue) {
		filterTerimler(listDataTitleandValue);
		String aqi = (String) mapDetails.get(TERIMLER.get(10));
		String str = switch (aqi) {
			case "1":
				yield "İyi";
			case "2":
				yield "Makul";
			case "3":
				yield "Ilıman";
			case "4":
				yield "Kötü";
			case "5":
				yield "Çok Kötü";
			default:
				throw new IllegalArgumentException("Unexpected value: " + aqi);
		};
		ConsoleHelper.print("Hava Kirlilik Derecesi :" + str, 2, true);
		ConsoleHelper.print("No2     :" + mapDetails.get(TERIMLER.get(11)), 2, true);
		ConsoleHelper.print("Pm10    :" + mapDetails.get(TERIMLER.get(12)), 2, true);
		ConsoleHelper.print("03      :" + mapDetails.get(TERIMLER.get(13)), 2, true);
		ConsoleHelper.print("PM25    :" + mapDetails.get(TERIMLER.get(14)), 2, true);
		
	}
	
	private static String showMainMenu() {
		ConsoleHelper.printTitle(TAG);
		String city = "İl İlçe";
		if (mapCityDetails.get(TERIMLER.get(0)) != null && mapCityDetails.get(TERIMLER.get(0)).length() > 0)
			city = mapCityDetails.get(TERIMLER.get(0)) + "/" + mapCityDetails.get(TERIMLER.get(1));
		ConsoleHelper.print("1- İL Seçiniz.", 2, true);
		ConsoleHelper.print("2- Günlük Hava Durumu Öğrenme", 2, true);
		ConsoleHelper.print("3- " + city + " için Hava Kirlilik tahmin raporu", 2, true);
		ConsoleHelper.print("4- " + city + " için 15 saatlik hava tahmin raporu", 2, true);
		Date date = new Date();
		date.setTime(System.currentTimeMillis());
		ConsoleHelper.print("Tarih: " + MyOnlineDataHelper.dateAsString(date.getTime()), 2, true);
		ConsoleHelper.print("Saat: " + MyOnlineDataHelper.timeAsString(date.getTime()), 2, true);
		ConsoleHelper.printLine(TAG);
		
		return in.next().trim().toLowerCase();
	}
	
	private static void mainFifteenHoursWeather(Map<String, String> mapCity) {
		String strFifteenHoursWeather = MyOnlineDataHelper.getForecastData(mapCity.get(TERIMLER.get(1)),
				mapCity.get(TERIMLER.get(0)), mapCity.get(TERIMLER.get(2)));
		viewFiteenHourWeather(toListDataTitleandValue(strFifteenHoursWeather));
		
	}
	
	private static void viewFiteenHourWeather(List<String> listDataTitleandValue) {
		String date = "";
		Map<String, Object> mapWather = new HashMap<>();
		Map<String, String> map = new HashMap<>();
		for (int i = 0; i < listDataTitleandValue.size(); i++) {
			if (listDataTitleandValue.get(i).equals("dt_txt")) {
				date = listDataTitleandValue.get(i + 1) + ":00";
			}
			
			if (date.length() > 1) {
				if (TERIMLER.contains(listDataTitleandValue.get(i))) {
					map.put(listDataTitleandValue.get(i), listDataTitleandValue.get(i + 1));
					mapWather.put(date, map);
				}
			}
			
		}
		
		for (Entry<String, Object> entry : mapWather.entrySet()) {
			String key = entry.getKey();
			Map<String, String> val = (Map<String, String>) entry.getValue();
			ConsoleHelper.print(key, 3, true);
			ConsoleHelper.print("Hava Durumu : " + val.get(TERIMLER.get(3)), 2, true);
			ConsoleHelper.print("Sıcaklık    : " + val.get(TERIMLER.get(4)), 2, true);
			ConsoleHelper.print("Hissedilen  : " + val.get(TERIMLER.get(5)), 2, true);
			ConsoleHelper.print("En Az       : " + val.get(TERIMLER.get(6)), 2, true);
			ConsoleHelper.print("En Çok      : " + val.get(TERIMLER.get(7)), 2, true);
			ConsoleHelper.printLine(TAG);
		}
		
	}
	
	private static void mainDayofWeather(double lat, double lon) {
		ConsoleHelper.print("İl  = " + mapCityDetails.get(TERIMLER.get(0)) + "\n\t\t" + "İlçe= "
				+ mapCityDetails.get(TERIMLER.get(1)), 2, true);
		ConsoleHelper.print("Enlem  = " + lat + "\n\t\t" + "Boylam = " + lon, 2, true);
		
		// Hava Durumunu Göster:
		ConsoleHelper.print("Günlük Hava Raporu :", 3, true);
		String dataWeather = MyOnlineDataHelper.getWeatherData(lat, lon);
		viewWeatherofDay(toListDataTitleandValue(dataWeather));
	}
	
	/**
	 * Şehir detay bilgisini kulanıcıdan iste
	 * 
	 * @return
	 */
	public static Map<String, String> readCityDetails() {
		
		Scanner in = new Scanner(System.in);
		Map<String, String> countyDetails = new HashMap<String, String>();
		ConsoleHelper.print("il Bilgisi Giriniz: ", 2, false);
		countyDetails.put(TERIMLER.get(0), in.next().trim().toUpperCase());
		ConsoleHelper.print("ilçe Bilgisi Giriniz: ", 2, false);
		countyDetails.put(TERIMLER.get(1), in.next().trim().toUpperCase());
		ConsoleHelper.print("ülke Bilgisi Giriniz: ", 2, false);
		countyDetails.put(TERIMLER.get(2), in.next().trim().toUpperCase());
		System.out.println();
		
		String dataCity = MyOnlineDataHelper.getDirectData(countyDetails.get(TERIMLER.get(1)),
				countyDetails.get(TERIMLER.get(0)), countyDetails.get(TERIMLER.get(0)));
		double[] countLatLon = findLatandLon(toListDataTitleandValue(dataCity));
		mapDetails.put(TERIMLER.get(8), countLatLon[0]);
		mapDetails.put(TERIMLER.get(9), countLatLon[1]);
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
		ConsoleHelper.print("Hava Durumu : " + findKeytoListArray(list, TERIMLER.get(3)), 2, true);
		ConsoleHelper.print("Sıcaklık    : " + findKeytoListArray(list, TERIMLER.get(4)), 2, true);
		ConsoleHelper.print("Hissedilen  : " + findKeytoListArray(list, TERIMLER.get(5)), 2, true);
		ConsoleHelper.print("En Az       : " + findKeytoListArray(list, TERIMLER.get(6)), 2, true);
		ConsoleHelper.print("En Çok      : " + findKeytoListArray(list, TERIMLER.get(7)), 2, true);
		
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
	
	public static void filterTerimler(List<String> list) {
		int i = 0;
		for (String temp : list) {
			if (TERIMLER.contains(temp)) {
				mapDetails.put(temp, list.get(i + 1));
			}
			i++;
		}
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

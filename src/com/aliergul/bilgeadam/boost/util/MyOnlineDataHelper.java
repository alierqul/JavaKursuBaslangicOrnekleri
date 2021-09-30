/**
 * 
 */
package com.aliergul.bilgeadam.boost.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/**
 * System.out.println(BAUtils.dateAsString(Long.parseLong("1632646800")));
 * System.out.println(BAUtils.timeAsString(Long.parseLong("1632646800")));
 * System.out.println("Enlem / Boylam Sorgusu : " +
 * BAUtils.getDirectData("Edremit","Balıkesir", "TR"));
 * System.out.println("Günlük Hava Raporu : " + BAUtils.getWeatherData(39.5961,
 * 22.0244));
 * System.out.println("15 Saatlik Hava Raporu : " +
 * BAUtils.getForecastData("Edremit","Balıkesir", "TR"));
 * System.out.println("Hava Kirlilik Raporu :" +
 * BAUtils.getPolutionData(39.5961, 22.0244));
 * 
 * @author ERGUL
 *
 */
public class MyOnlineDataHelper {
	
	/*
	 * public static boolean proceeding(String question, String positiveAnswer) {
	 * return readString(question).equalsIgnoreCase(positiveAnswer); }
	 */
	
	/**
	 * long şeklinde belirtilmiş bir zaman bilgisini dd.MMM.yyyy şeklinde ger döner
	 * 
	 * @param timestamp zaman bilgisi
	 * @return
	 */
	public static String dateAsString(long timestamp) {
		LocalDateTime dateTime = LocalDateTime.ofEpochSecond(timestamp, 0, ZoneOffset.UTC);
		return dateTime.format(DateTimeFormatter.ofPattern("dd.MMM.yyyy"));
	}
	
	/**
	 * long şeklinde belirtilmiş bir zaman bilgisini dd.MMM.yyyy şeklinde ger döner
	 * 
	 * @param timestamp zaman bilgisi
	 * @return
	 */
	public static String timeAsString(long timestamp) {
		LocalDateTime dateTime = LocalDateTime.ofEpochSecond(timestamp, 0, ZoneOffset.UTC);
		return dateTime.format(DateTimeFormatter.ofPattern("HH:mm"));
	}
	
	/**
	 * Enlem ve boylam verileri verilmiş bir yer için hava kirliliği bilgilerini
	 * geri döner
	 * 
	 * @param lat Enlem bilgisi
	 * @param lon Boylam bilgisi
	 * @return
	 */
	
	public static String getPolutionData(double lat, double lon) {
		String url = "http://api.openweathermap.org/data/2.5/air_pollution?lat=" + lat + "&lon=" + lon
				+ "&appid=246a2bf08c730aed2f8a547f8d85943a";
		String retVal = "";
		
		URL obj;
		try {
			obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				retVal += inputLine;
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retVal;
	}
	
	/**
	 * Enlem ve boylam verileri verilmiş bir yer için günlük hava tahmini bilgisini
	 * geri döner
	 * 
	 * @param lat Enlem bilgisi
	 * @param lon Boylam bilgisi
	 * @return
	 */
	public static String getWeatherData(double lat, double lon) {
		String url = "http://api.openweathermap.org/data/2.5/weather?lat=" + lat + "&lon=" + lon
				+ "&units=metric&lang=tr&appid=246a2bf08c730aed2f8a547f8d85943a";
		String retVal = "";
		
		URL obj;
		try {
			obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				retVal += inputLine;
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retVal;
	}
	
	/**
	 * Verilen bilgiler dahilinde 3er saatlik aralıklala yapılmış 5 adet hava
	 * tahminini geri döner
	 * 
	 * @param ilce Bir şehrin ilçesinin adı
	 * @param il   şehir adı
	 * @param ulke IOS ülke kısa kodları, Türkiye için TR
	 * @return
	 */
	
	public static String getForecastData(String ilce, String il, String ulke) {
		String url = "https://api.openweathermap.org/data/2.5/forecast?&q=" + ilce + "," + il + "," + ulke
				+ "&units=metric&cnt=5&appid=246a2bf08c730aed2f8a547f8d85943a";
		String retVal = "";
		
		URL obj;
		try {
			obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				retVal += inputLine;
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retVal;
	}
	
	/**
	 * Verilen bilgiler dahilinde bir ilçenin enlem ve boylam bilgilerine ulaşmak
	 * için kullanılır
	 * 
	 * @param ilce Bir şehrin ilçesinin adı
	 * @param il   şehir adı
	 * @param ulke IOS ülke kısa kodları, Türkiye için TR
	 * @return
	 */
	public static String getDirectData(String ilce, String il, String ulke) {
		String url = "http://api.openweathermap.org/geo/1.0/direct?q=" + ilce + "," + il + "," + ulke
				+ "&limit=1&appid=246a2bf08c730aed2f8a547f8d85943a";
		String retValue = "";
		
		URL obj;
		try {
			obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				retValue += inputLine;
			}
			in.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retValue;
	}
	
}

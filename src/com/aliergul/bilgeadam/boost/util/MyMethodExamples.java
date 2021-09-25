/**
 * 
 */
package com.aliergul.bilgeadam.boost.util;

import java.util.StringTokenizer;

/**
 * @author ERGUL
 *
 */
public class MyMethodExamples {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
	
	/**
	 * Kullanıcıdan alınan parametrelerle aşağıdaki fnksiyonu hesaplama
	 * F(x) = ax^2+bx+c
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @param x
	 * @return
	 */
	public double solveFunction(int a, int b, int c, int x) {
		double sonuc = a * Math.pow(x, 2) + b * x + c;
		return sonuc;
	}
	
	/**
	 * 
	 *
	 * 
	 * @param msg Girilen metin: PAYPALISHIRING
	 * @param row satır 3
	 *            <p>
	 *            P A H N
	 *            <p>
	 *            APLSIIG
	 *            <p>
	 *            Y I R
	 */
	public static void printZigZag(String msg, int row) {
		
		String[] rows = new String[row];
		int rowNumber = 0;
		int plus = +1;
		for (int i = 0; i < rows.length; i++) {
			rows[i] = "";
		}
		
		for (int i = 0; i < msg.length(); i++) {
			String str = String.valueOf(msg.charAt(i));
			rows[rowNumber] = rows[rowNumber].concat(str);
			rowNumber += plus;
			if (rowNumber == (row - 1) || rowNumber == 0) {
				plus *= -1;
			}
		}
		
		for (int j = 0; j < row; j++) {
			System.out.println(rows[j]);
		}
		
	}
	
	/**
	 * Girilen Metinin tersini döndüren metod.
	 * 
	 * @param msg JAVA
	 * @return AVAJ
	 */
	public static String reverseString(String msg) {
		StringBuilder revStr = new StringBuilder();
		
		for (int i = (msg.length() - 1); i >= 0; i--) {
			revStr.append(msg.charAt(i));
			
		}
		return revStr.toString();
		
	}
	
	/**
	 * @param msg adana
	 * @param key a
	 * @return 3
	 */
	public static int sayHarf(String msg, String key) {
		char[] s = msg.toLowerCase().toCharArray();
		int count = 0;
		for (int i = 0; i < msg.length(); i++) {
			if (key.equals(String.valueOf(s[i]))) {
				count++;
			}
		}
		return count;
		
	}
	
	/**
	 * Metin baş harfini büyük çeviren method
	 * 
	 * @param A = "adana spor"
	 * @return Adana Spor
	 */
	public static String toTitle(String metin) {
		StringTokenizer st = new StringTokenizer(metin, " ");
		StringBuilder newMetin = new StringBuilder();
		while (st.hasMoreTokens()) {
			String A = st.nextToken();
			A = A.substring(0, 1).toUpperCase().concat(A.substring(1, A.length()));
			newMetin.append(A);
		}
		
		return newMetin.toString();
	}
	
	/**
	 * 
	 * @param msg = adana
	 * @param key = a
	 * @return = dn
	 */
	public static String cikarHarf(String msg, String key) {
		StringBuilder newStr = new StringBuilder("");
		char[] s = msg.toLowerCase().toCharArray();
		for (int i = 0; i < msg.length(); i++) {
			if (!key.equals(String.valueOf(s[i]))) {
				newStr.append(s[i]);
			}
			
		}
		
		return newStr.toString();
		
	}
	
	public static String silTekSayiHarfMetin(String msg) {
		StringBuilder newStr = new StringBuilder();
		for (int i = 0; i < msg.length(); i += 2) {
			newStr.append(msg.charAt(i));
		}
		return newStr.toString();
		
	}
	
}

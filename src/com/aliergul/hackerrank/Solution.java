/**
 * 
 */
package com.aliergul.hackerrank;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ERGUL
 * 
 *         Açıklama 0
 * 
 *         Sicim aşağıdaki sözlükbilimsel olarak sıralanmış uzunluk alt
 *         dizelerine sahiptir :
 * 		
 *         Daha sonra ilk (sözlükbilimsel olarak en küçük) alt dizgiyi ve son
 *         (sözlükbilimsel olarak en büyük) alt dizgiyi iki satırsonu ile
 *         ayrılmış değer (yani, ava\nwel) olarak döndürürüz .
 * 		
 *         Düzenleyicideki saplama kodu daha sonra availk çıktı satırımız ve
 *         welikinci çıktı satırımız olarak yazdırılır .
 */

public class Solution {
	
	public static String getSmallestAndLargest2(String s, int k) {
		
		String key = "";
		List<String> list = new ArrayList();
		for (int i = 0; i <= (s.length() - k); i++) {
			key = s.substring(i, i + k);
			list.add(key);
		}
		list = list.stream().sorted().toList();
		
		return list.get(0) + "\n" + list.get(list.size() - 1);
	}
	
	/**
	 * List Kullanmadan Bulma.
	 * 
	 * @param s
	 * @param k
	 * @return
	 */
	public static String getSmallestAndLargest(String s, int k) {
		String smallest = s.substring(0, k);
		String largest = "";
		int len = s.length();
		String temp = "";
		if (len >= 1 && len <= 1000 && k >= 1 && k <= len) {
			for (int i = 0; i <= len - k; i++) {
				temp = s.substring(i, i + k);
				System.out.println(i + "=" + smallest);
				if (temp.compareTo(largest) > 0) {
					largest = temp;
				}
				if (temp.compareTo(smallest) <= 0) {
					smallest = temp;
				}
			}
			
			return smallest + "\n" + largest;
		} else
			return null;
		
	}
	
	public static void main(String[] args) {
		
		String s = "welcometojava";
		int k = 3;
		
		System.out.println(getSmallestAndLargest(s, k));
		System.out.println("finish");
	}
	
}

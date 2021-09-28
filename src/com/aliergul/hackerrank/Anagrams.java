/**
 * 
 */
package com.aliergul.hackerrank;

import java.util.Arrays;

/**
 * Two strings, and , are called anagrams if they contain all the same
 * characters in the same frequencies. For this challenge, the test is not
 * case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC,
 * and CtA.
 * 
 * Function Description
 * 
 * Complete the isAnagram function in the editor.
 * 
 * isAnagram has the following parameters:
 * 
 * string a: the first string
 * string b: the second string
 * Returns
 * 
 * boolean: If and are case-insensitive anagrams, return true. Otherwise, return
 * false.
 * 
 * @author ERGUL
 *
 */
public class Anagrams {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Anagrams s = new Anagrams();
		if (isAnagram("margana", "anagram")) {
			System.out.println("YES");
		} else
			System.out.println("NO");
		
	}
	
	static boolean isAnagram(String a, String b) {
		
		if (a == null || b == null || a.trim().length() != b.trim().length() || a.trim().length() < 1) {
			return false;
		} else {
			char[] as = a.trim().toLowerCase().toCharArray();
			char[] bs = b.trim().toLowerCase().toCharArray();
			Arrays.sort(as);
			Arrays.sort(bs);
			System.out.println(String.valueOf(as) + " " + String.valueOf(bs));
			return (String.valueOf(as).equals(String.valueOf(bs)));
		}
		
	}
	
}

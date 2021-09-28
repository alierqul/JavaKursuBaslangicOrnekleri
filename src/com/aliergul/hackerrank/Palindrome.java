/**
 * 
 */
package com.aliergul.hackerrank;

import java.util.Scanner;

/**
 * A palindrome is a word, phrase, number, or other sequence of characters which
 * reads the same backward or forward.
 * 
 * Given a string , print Yes if it is a palindrome, print No otherwise.
 * 
 * Constraints
 * 
 * will consist at most lower case english letters.
 * 
 * @author ERGUL
 *
 */
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String reverse = "";
		for (int i = A.length() - 1; i >= 0; i--) {
			reverse = reverse.concat(A.substring(i, i + 1));
			
		}
		if (reverse.equals(A)) {
			System.out.println("Palindrome Yes");
		} else
			System.out.println("Palindrome No");
	}
	
}

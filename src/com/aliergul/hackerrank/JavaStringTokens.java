/**
 * 
 */
package com.aliergul.hackerrank;

/**
 * Given a string, , matching the regular expression
 * [A-Za-z !,?._'@]+, split the string into tokens.
 * We define a token to be one or more consecutive
 * English alphabetic letters. Then, print the number of tokens,
 * followed by each token on a new line.
 * 
 * Note: You may find the String.split method helpful in completing this
 * challenge.
 * 
 * @author ERGUL
 * 
 *         Sample Input
 * 
 *         He is a very very good boy, isn't he?
 * 		
 *         Sample Output
 * 
 *         10
 *         He
 *         is
 *         a
 *         very
 *         very
 *         good
 *         boy
 *         isn
 *         t
 *         he
 */
public class JavaStringTokens {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "He is a very very good boy, isn't he?";
		
		if (s.length() >= 1 && s.length() <= 400000) {
			String points = "[ !,?.\\_'@]+";
			String[] tokens = s.split(points);
			System.out.println(tokens.length);
			for (String s1 : tokens) {
				System.out.println(s1);
			}
		} else {
			System.out.println(0);
		}
		
	}
	
}

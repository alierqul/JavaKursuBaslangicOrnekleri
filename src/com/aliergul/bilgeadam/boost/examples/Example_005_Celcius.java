package com.aliergul.bilgeadam.boost.examples;

import java.util.Scanner;

public class Example_005_Celcius {
	public void bulFahrenhayt() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Fahrenhayt Gir: ");
		int f = 132;
		f = in.nextInt();
		
		double c = 0f;
		c = (f - 32) * (9.0f / 5.0f);
		
		System.out.println("SantiGrad = " + c);
	}
}

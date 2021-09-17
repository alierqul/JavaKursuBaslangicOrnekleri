package com.aliergul.bilgeadam.boost.examples;

public class Example_003_DolarCeviri {
	private static final double DOLAR_KURU = 8.44;
	
	/**
	 * @param DOLAR_KURU
	 * @param tlTurari   TL yi Dolar a çevirecek.
	 */
	public void cevirTLDolar(double tlTurari) {
		double dolarTutari = tlTurari / DOLAR_KURU;
		System.out.println(tlTurari + " TL = " + dolarTutari + " Dolar Ediyor");
		System.out.printf("%.2f Tl = %.2f Dolar", tlTurari, dolarTutari);
		
	}
	
	/**
	 * @param DOLAR_KURU
	 * @param dolarTutari Dolar i TL ye Çevirecek.
	 */
	public void cevirDolarTL(double dolarTutari) {
		double tlTurari = dolarTutari * DOLAR_KURU;
		System.out.println(dolarTutari + " Dolar = " + tlTurari + " TL Ediyor");
		System.out.printf("%.2f Dolar = %.2f TL Ediyor", dolarTutari, tlTurari);
	}
}

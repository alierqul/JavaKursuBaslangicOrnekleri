/**
 * 
 */
package com.aliergul.bilgeadam.boost.examples;

/**
 * Generic Yapı Örnekleri
 * 
 * @author ERGUL
 *
 */
public class Lesson_007_Generics {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// instance =new ile veri oluşturmak.
		
		GenericsClass genericsClass = new GenericsClass();
		genericsClass.setAdi("Ali");
		genericsClass.setAdi("Ergül");
		System.out.println(genericsClass);
	}
	
	// Nesne Değişkeni
	// Getter and Setter Shift+alt+S
	
}

class GenericsClass<T> {
	private String adi;
	private String soyadi;
	// Tanımlarken verilen Type göre Şekil alan değişken
	private T genericData;
	
	public T getGenericData() {
		return genericData;
	}
	
	public void setGenericData(T genericData) {
		this.genericData = genericData;
	}
	
	public GenericsClass(String adi, String soyadi) {
		super();
		this.adi = adi;
		this.soyadi = soyadi;
	}
	
	public GenericsClass() {
		
	}
	
	public String getAdi() {
		return adi;
	}
	
	public void setAdi(String adi) {
		this.adi = adi;
	}
	
	public String getSoyadi() {
		return soyadi;
	}
	
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	
	@Override
	public String toString() {
		return "GenericsClass [adi=" + adi + ", soyadi=" + soyadi + "]";
	}
	
}

package com.aliergul.oop.emeklilikyasi;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person implements Serializable, IProcessRetirement {
	/**
	 * 
	 */
	private static final long serialVersionUID = -429433381075155526L;
	public static final int RETIREMENT_AGE_MAN = 65;
	public static final int RETIREMENT_AGE_WOMAN = 60;
	private String name;
	private String surnama;
	private Date birthDay;
	private EGender gender;
	
	public Person() {
		
	}
	
	public Person(String name, String surnama, Date birthDay, char gender) {
		this.name = name;
		this.surnama = surnama;
		this.birthDay = birthDay;
		
		this.gender = (gender == 'E') ? EGender.ERKEK
				: (gender == 'B') ? EGender.KADIN : (gender == 'K') ? EGender.KADIN : EGender.OTHER;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurnama() {
		return surnama;
	}
	
	public void setSurnama(String surnama) {
		this.surnama = surnama;
	}
	
	public Date getBirthDay() {
		return birthDay;
	}
	
	public void setBirthDay(String birthDay) {
		
		SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
		Date date = new Date();
		try {
			date = format.parse(birthDay);
		} catch (ParseException e) {
			date = null;
			throw new IllegalArgumentException("Hatalı Tarih Formatı\ndd.MM.yyyy Şeklinde Girilmeli");
			
		}
		this.birthDay = date;
	}
	
	public char getGender() {
		return gender.toString().charAt(0);
	}
	
	public void setGender(char gender) {
		this.gender = (gender == 'E') ? EGender.ERKEK
				: (gender == 'B') ? EGender.KADIN : (gender == 'K') ? EGender.KADIN : EGender.OTHER;
		
	}
	
	/**
	 * Emeklilik kalan Yaşı Hesaplıyorum.
	 */
	@Override
	public int calculateRemainingTimeRetirement() {
		return this.getRetirementAge() - this.calculateAge(); // 65-34
	}
	
	/**
	 * yaş negatif çıkarsa hata fırlatıyorum
	 */
	@Override
	public int calculateAge() {
		Date date = new Date();
		int year = this.birthDay.getYear();// 2021
		int age = date.getYear() - year; // 2021-1987
		if (age < 0)
			throw new IllegalArgumentException("Doğum Tarihi Hatalı Girilmiş.");
		return age;
	}
	
	/**
	 * burda erkek ya da kadın dışında girilmişse hata fırlatıyorum
	 */
	@Override
	public int getRetirementAge() {
		if (this.gender == EGender.KADIN)
			return this.RETIREMENT_AGE_WOMAN;
		else if (this.gender == EGender.ERKEK)
			return this.RETIREMENT_AGE_MAN;
		else
			throw new IllegalArgumentException("Cinsiyet Hatalı Girilmiş.\n(E/B şeklinde Girilmeli)");
	}
	// ooo senınkı cok uzun saylanmaz olmamıs
	// =)))
}

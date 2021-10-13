package com.aliergul.oop.emeklilikyasi;

public interface IProcessRetirement {
	// kalan emeklilik yaşı
	public int calculateRemainingTimeRetirement();
	
	// yaş hesala
	public int calculateAge();
	
	// emeklilik yaşı erkek kadın ayrımı
	public int getRetirementAge();
	
}

package com.aliergul.oop.example02;

public class PostImage extends Post {
	private String imgUrl = "";
	
	public PostImage(long timeMilis, long countLike, String title) {
		super(timeMilis, countLike, title);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getItemId() {
		// TODO Auto-generated method stub
		return super.ITEM_IMAGE;
	}
	
}

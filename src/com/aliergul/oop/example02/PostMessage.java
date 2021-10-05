package com.aliergul.oop.example02;

public class PostMessage extends Post {
	
	public PostMessage(long timeMilis, long countLike, String title) {
		super(timeMilis, countLike, title);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getItemId() {
		// TODO Auto-generated method stub
		return super.ITEM_TEXT;
	}
	
}

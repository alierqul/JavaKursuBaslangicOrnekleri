package com.aliergul.oop.example02;

public abstract class Post {
	protected static final int ITEM_VIDEO = 0;
	protected static final int ITEM_TEXT = 1;
	protected static final int ITEM_IMAGE = 2;
	
	private long timeMilis = 0L;
	private long countLike = 0L;
	private String title = "";
	
	public abstract int getItemId();
	
	public Post(long timeMilis, long countLike, String title) {
		super();
		this.timeMilis = timeMilis;
		this.countLike = countLike;
		this.title = title;
	}
	
}

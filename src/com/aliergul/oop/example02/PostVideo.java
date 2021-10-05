package com.aliergul.oop.example02;

public class PostVideo extends Post {
	private String videoURL = "";
	
	public PostVideo(long timeMilis, long countLike, String title, String videoURL) {
		super(timeMilis, countLike, title);
		this.videoURL = videoURL;
	}
	
	@Override
	public int getItemId() {
		// TODO Auto-generated method stub
		return super.ITEM_VIDEO;
	}
	
}

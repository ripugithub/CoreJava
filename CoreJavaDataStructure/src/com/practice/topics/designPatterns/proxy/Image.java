package com.hitachi.topics.designPatterns.proxy;


public class Image {
	protected String url;
	
	
	public Image(String url) {
		System.out.println("Loading image");
		this.url = url;
		
	}
	
	public void draw() {
		System.out.println("Draw images from url: "+url);
	}
}

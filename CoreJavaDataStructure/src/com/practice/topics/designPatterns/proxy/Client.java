package com.practice.topics.designPatterns.proxy;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String s[])
	{
		Image image = new Image("First Iamge");
		Image image2 = new Image("Second Image");
		
		List<Image> images = new ArrayList<Image>();
		images.add(image);
		images.add(image2);
		Application application = new Application(images);
		
		
		System.out.println("Application Setup");
		application.draw();
	}
}

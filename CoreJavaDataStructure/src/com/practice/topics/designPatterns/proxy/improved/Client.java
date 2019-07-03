package com.practice.topics.designPatterns.proxy.improved;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String s[])
	{
		ImageProxy image = new ImageProxy("First Image");
		ImageProxy image2 = new ImageProxy("Second Image");
		
		List<Image> images = new ArrayList<Image>();
		images.add(image);
		images.add(image2);
		Application application = new Application(images);
		
		
		System.out.println("Application Setup");
		application.draw();
	}
}

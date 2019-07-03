package com.practice.topics.designPatterns.proxy;

import java.util.ArrayList;
import java.util.List;

public class Application {

	private List<Image> images = new ArrayList<Image>();
	
	public Application(List<Image> images) {
		this.images=images;
	}
	
	public void draw()
	{
		//for(Image image:images)
		//	image.draw();
		images.forEach(img->img.draw());
	}
}

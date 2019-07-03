package com.practice.topics.misc;

import java.net.InetAddress;

public class FindIP {
	
	public static void main(String[] arr) throws Exception
	{
		InetAddress  hostIP = InetAddress.getLocalHost();
		
		System.out.println("My IP Address is::"+hostIP);
		
		
		
	}

}

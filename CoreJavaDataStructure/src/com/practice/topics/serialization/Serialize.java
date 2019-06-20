package com.practice.topics.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialize {

	public static void main(String s[]) throws Exception
	{
		Student student = new Student(101, "Ripudaman",32);
		
		FileOutputStream fos = new FileOutputStream("D:\\RAD\\personal\\eclipse-jee-oxygen-2-win32-x86_64\\eclipse\\fout.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(student);
		oos.close();
		System.out.println("Success!");
	}
}


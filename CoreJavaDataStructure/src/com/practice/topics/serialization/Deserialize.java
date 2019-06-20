package com.practice.topics.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialize {

	public static void main(String s[]) throws Exception
	{
	
		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("D:\\RAD\\personal\\eclipse-jee-oxygen-2-win32-x86_64\\eclipse\\fout.txt"));
		Student student =(Student) inputStream.readObject();
		inputStream.close();
		System.out.println(student.id+" "+student.name+" "+student.age);
	}
}

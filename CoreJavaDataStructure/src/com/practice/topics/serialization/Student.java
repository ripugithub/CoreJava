package com.practice.topics.serialization;

import java.io.Serializable;

public class Student implements Serializable{

	int id;
	String name;
	
	/*While serialization the value of age will not be serialized because of 
	  the transient keyword.Any data member with transient keyword will not be serialized
	 * 
	 */
	transient int age;
	
	private static final long serialVersionUID = 1L;

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
		
	}
}

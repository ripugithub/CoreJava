package com.practice.topics.misc;

public class Student implements Comparable<Student>{
	
	private String firstName;
	private String lastName;
	private int age;
	
	
	public Student(String firstName, String lastName, int age)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public int compareTo(Student o) {
		
		//int last = this.lastName.compareTo(o.lastName);
		//return  last==0? this.firstName.compareTo(o.firstName):last;
		return this.firstName.compareTo(o.firstName);
	}
	
	

}

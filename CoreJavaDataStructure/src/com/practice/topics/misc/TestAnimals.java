package com.hitachi.topics.misc;


class Animal{
	public void eat()
	{
		System.out.println(" From Animal Class");
	}
}

class Horse extends Animal
{
	public void eat() {
		System.out.println("From Horse class");
	}
	
	public void bark() {
		System.out.println("Bark from Horse class");
	}
}
public class TestAnimals {

	public static void main(String s[])
	{
		Animal animal = new Animal();
		Animal animal1 = new Horse();
		animal.eat();
		animal1.eat();
				
		int num = 5;
		switch(num) {
		case 1: System.out.println("Case one");
			break;
		case 2: System.out.println("Case two");
		case 3: System.out.println("Case three");
		default: System.out.println("Default case");
		case 4: System.out.println("Case four");}
	}
}

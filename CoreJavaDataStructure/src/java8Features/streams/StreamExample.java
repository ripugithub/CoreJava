package java8Features.streams;

import java.util.Arrays;
import java.util.List;

import java8Features.lambdaexercise.Person;

public class StreamExample {

	
		public static void main(String s[]) {
	List<Person> listOfPersons = Arrays.asList(new Person("Ripu", "Singh", 31),
			new Person("Raj", "Maity", 31),
			new Person("Amit", "Sharma", 31),
			new Person("Rohit", "Rajani", 31),
			new Person("Neeraj", "Kumar", 31),
			new Person("Akash", "Chopra", 40));
	
	listOfPersons.stream()
	.filter(p->p.getFirstName().startsWith("R"))
	.forEach(p->System.out.println(p.getFirstName()));
		}
}

package java8Features.lambdaexercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


//https://www.youtube.com/watch?v=MqsCdbMQjWc&index=14&list=PLqq-6Pq4lTTa9YGfyhyW2CqdtW9RtY-I3
public class Unit1Exercise {
	public static void main(String s[])
	{
		List<Person> listOfPersons = Arrays.asList(new Person("Ripu", "Singh", 31),
				new Person("Raj", "Maity", 31),
				new Person("Amit", "Sharma", 31),
				new Person("Rohit", "Rajani", 31),
				new Person("Neeraj", "Kumar", 31),
				new Person("Akash", "Chopra", 40));
		
		
		//Step 1:sort list by last name
		
		/*Collections.sort(listOfPersons, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
			
		});*/
		Collections.sort(listOfPersons, (Person p1, Person p2)->p1.getLastName().compareTo(p2.getLastName()));
		//Step 2:create a method that print all the element in the list
		
		printAll(listOfPersons);
		
		
		//Step 3:Create a method that print all the people that has last name beginning with C
		
		printLastNameBeginningWithC(listOfPersons);
	}

	private static void printLastNameBeginningWithC(List<Person> listOfPersons) {
		System.out.println("-----------------------------------");
		listOfPersons.forEach(person-> {
			
			if(person.getLastName().startsWith("C"))
			{
				System.out.println(person);
			}
			});
		}

	private static void printAll(List<Person> listOfPersons) {
			listOfPersons.forEach(person->System.out.println(person));
	}

}

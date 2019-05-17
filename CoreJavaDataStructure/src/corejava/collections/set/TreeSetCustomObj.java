package corejava.collections.set;

import java.util.Set;
import java.util.TreeSet;

	/*TreeSet is an implementation of the Set Interface that uses a TreeMap for storing elements
	TreeSet implements SortedSet Interface thus the elements are ordered using their natural 
	ordering, or by a Comparator provided at set creation time, depending on the constructor used for creating Set*/
	//IMP

	/*In order to add custom or user defined objects to TreeSet data structure, the custom class 
	should implement the Comparable interface or a Comparator should be passed to TreeSet 
	constructor during creation. This is required because TreeSet does not allow duplicate 
	elements and to ensure this with custom objects, TreeSet requires a comparator function 
	to perform the comparison of custom objects. If a comparator is not specified then when 
	you try to add a custom object to TreeSet, it will throw java.lang.ClassCastException. 
	This is the most important point to be noted regarding the usage of TreeSet with custom 
	objects in Java*/
public class TreeSetCustomObj {
	
	public static void main(String[] str)
	{
		//Set<Student> set1 = new TreeSet<>(new StudentComparator()); 
		Set<Student> set = new TreeSet<Student>();
		set.add(new Student(100,"Ripu", "Singh"));
		set.add(new Student(106,"Raj", "Maity"));
		set.add(new Student(104,"Amit", "Sharma"));
		set.add(new Student(103,"Rohit", "Rajani"));
		set.add(new Student(100,"Ripu", "Singh"));
		
		for(Student s:set)
		{
			System.out.println(s.getsId());
		}
		System.out.println("-------------------------------");
		set.forEach(student->System.out.println(student.getsId()));
	}
}


class Student implements Comparable<Student>
{
	private int sId;
	private String firstName;
	private String lastName;
	
	public Student() {
		super();
	}
	public Student(int sId, String firstName, String lastName) {
		super();
		this.sId = sId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public int compareTo(Student o) {
		if(this.sId==o.sId)
		{
			return 0;
		}else if(this.sId>o.sId)
		{
			return 1;
		}
		else
		{
			return -1;
		}

	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
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
	
}
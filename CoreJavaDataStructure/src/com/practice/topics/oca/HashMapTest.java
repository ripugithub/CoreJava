package com.practice.topics.oca;

import java.util.HashSet;

import com.hitachi.topics.oca.bean.Employee;

public class HashMapTest {
	public static void main(String[] args) {
        Employee employee = new Employee("Ripudaman", 24);
        Employee employee1 = new Employee("Ripudaman", 25);
        Employee employee2 = new Employee("Ripudaman", 24);

        HashSet<Employee> employees = new HashSet<Employee>();
        employees.add(employee);
        System.out.println(employees.contains(employee2));
        System.out.println("employee.hashCode():  " + employee.hashCode()
        + "  employee2.hashCode():" + employee2.hashCode());
    }
}

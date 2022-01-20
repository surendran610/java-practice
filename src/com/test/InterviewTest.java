/**
 * 
 */
package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Shrisuren
 *
 */
public class InterviewTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Joe", 19));
		list.add(new Employee("Anthony", 16));
		List<String>result=list.stream().
		filter(e->e.age>18).
		map(e->e.getName()+" "+"Major").
		collect(Collectors.toList());
		System.out.println(result.toString());

	}

}

class Employee {
	String name;
	int age;
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
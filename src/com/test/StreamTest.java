/**
 * 
 */
package com.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Shrisuren
 *
 */
public class StreamTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Emp>empList=new ArrayList<>();
		Stream<Emp>sortedList=empList.stream().sorted();
		sortedList.forEach(e->{
			System.out.println(e.getName()+"-"+e.getAge());
		});

	}

}

class Emp{
	private String name;
	private String age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	} 
}
/**
 * 
 */
package com.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Shrisuren
 *
 */
public class EmpTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//List<EmpT> empList = new ArrayList<>();
		//empList.stream().filter(e -> e.getAge() > 40).count();
		//empList.stream().max(Comparator.comparing(EmpT::getAge)).get();
		Set ss =new TreeSet<>();
		ss.add(3);
		ss.add("4");
		ss.add(1);
		System.out.println(ss);
		int i =9;
		if(i==9) {
			
		}

	}

}
abstract class AA{
	//abstract public final void getAA();
}

class EmpT {
	private String name;
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
/**
 * 
 */
package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Shrisuren
 *
 */
public class MapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String>strList= Arrays.asList("apple","ball");
		List<String>upperCaseStr=strList.stream().map(String::toUpperCase).collect(Collectors.toList());
		upperCaseStr.stream().forEach(s->System.out.println(s));
	}

}

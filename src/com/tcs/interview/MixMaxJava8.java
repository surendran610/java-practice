/**
 * 
 */
package com.tcs.interview;

import java.util.Arrays;
import java.util.List;

/**
 * @author Shrisuren
 *
 */
public class MixMaxJava8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 4, 56, 7, 89, 10);
		Integer maxNum=listOfIntegers
				.stream()
				.mapToInt(e->e)
				.max().orElseThrow();
		System.out.println(maxNum);
	}

}

/**
 * 
 */
package com.test;

/**
 * @author Shrisuren
 *
 */
public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="aabbbccc";
		long countA=s.chars().filter(e->e=='a').count();
		System.out.println(countA);
	}
    
}

/**
 * 
 */
package com.test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Shrisuren
 *
 */
public class TcsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
       int[] arr= {10, 5, 3, 4, 3, 5, 6};
       Set<Integer>duplicate=new HashSet<>();
       for(int i=0;i<arr.length;i++) {
    	   if(duplicate.contains(arr[i])) {
    		   System.out.println(arr[i]);
    		   break;
    	   }
    	   duplicate.add(arr[i]);
       }
	}

}

/**
 * 
 */
package com.test;

/**
 * @author Shrisuren
 *
 */
public class EncodeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "AAAABBBCCDAA";
		char[] charArray = s.toCharArray();

		String result = "";
		for (int i = 0; i < charArray.length; i++) {
			int count = 0;
			for (int j = i; j < charArray.length; j++) {
				if (charArray[i] == charArray[j]) {
					count++;
					result = count + "" + charArray[i];
				}
			}
			System.out.println(result);
			break;
		}

	}

}

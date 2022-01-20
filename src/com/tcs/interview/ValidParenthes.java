/**
 * 
 */
package com.tcs.interview;

import java.util.Stack;

/**
 * @author Shrisuren
 *
 */
public class ValidParenthes {

	public static void main(String[] args) {
		ValidParenthes parenthes = new ValidParenthes();
		System.out.println("{} is valid=" + parenthes.isValidParenthese("{}"));
	}

	public boolean isValidParenthese(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c)
				return false;
		}
		return stack.isEmpty();
	}
}

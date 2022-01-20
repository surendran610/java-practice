/**
 * 
 */
package com.test;

/**
 * @author Shrisuren
 *
 */
public class InterfaceTest  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
interface A{
	public void test1();
}
interface B extends A{
	public void test2();
}
class C implements B{

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}
	
}
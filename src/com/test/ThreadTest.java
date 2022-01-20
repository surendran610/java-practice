/**
 * 
 */
package com.test;

/**
 * @author Shrisuren
 *
 */
public class ThreadTest extends Thread{
	public void run(int a) {
		System.out.println("q");
	}
	public void run(String s) {
		System.out.println("a");
	}
	public void run() {
		System.out.println("a");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTest g=new ThreadTest();
		g.start();

	}

}

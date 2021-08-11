package com.bdqn.ch07;

/**
 * 演示 线程礼让
 * 
 * @author LILIBO
 *
 */
public class YieldDemo {

	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread t1 = new Thread(myRunnable, "线程A");
		Thread t2 = new Thread(myRunnable, "线程B");
		t1.start();
		t2.start();
	}
}

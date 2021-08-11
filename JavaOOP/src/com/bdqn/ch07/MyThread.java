package com.bdqn.ch07;

/**
 * 通过继承Thread类实现多线程
 * 
 * @author LILIBO
 *
 */
public class MyThread extends Thread {

	/**
	 * run方法，线程要执行的方法
	 */
	public void run() {
		System.out.println(Thread.currentThread().getName() + ": " + System.currentTimeMillis());
		for (int i = 1; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
		}
		System.out.println(Thread.currentThread().getName() + ": " + System.currentTimeMillis());
	}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + ": " + System.currentTimeMillis());
		MyThread myThread1 = new MyThread();
		myThread1.setName("子线程1");
		myThread1.start(); // 启动线程
		MyThread myThread2 = new MyThread();
		myThread2.setName("子线程2");
		myThread2.run();
		
		// main线程一定是最后一个运行完毕的，这里只是打印内容，完成打印后main线程继续等待
		System.out.println(Thread.currentThread().getName() + ": " + System.currentTimeMillis());
	}
}

package com.bdqn.ch07;

/**
 * 演示 线程的强制执行
 * 
 * @author LILIBO
 *
 */
public class JoinDemo {

	public static void main(String[] args) {
		Thread temp = new Thread(new MyRunnable(), "子线程");
		temp.start();
		for (int i = 0; i < 20; i++) {
			if (i==5) {
				try {
					temp.join(); // 线程的强制执行，main线程暂停执行，子线程强制执行
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ": " + i);
		}
	}
}

package com.bdqn.ch07;

/**
 * 实现Runnable接口（任务）
 * 
 * @author LILIBO
 *
 */
public class MyRunnable implements Runnable {

	/**
	 * 任务
	 */
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + ": " + System.currentTimeMillis());
		for (int i = 1; i < 100; i++) {
			try {
				Thread.sleep(100); // 让线程休眠，进入阻塞状态
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (i==3) {
				System.out.println(Thread.currentThread().getName() + "线程礼让：");
				Thread.yield();
			}
			System.out.println(Thread.currentThread().getName() + ": " + i);
		}
		System.out.println(Thread.currentThread().getName() + ": " + System.currentTimeMillis());
	}

	public static void main(String[] args) {
		// 创建一个任务对象
		MyRunnable myRunnable = new MyRunnable();
		// 创建一个线程来执行这个任务
		Thread thread1 = new Thread(myRunnable);
		thread1.setPriority(Thread.MIN_PRIORITY);
		// 线程启动
		thread1.start();
//		try {
//			thread1.sleep(5000, 1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		// 创建一个线程来执行这个任务
		Thread thread2 = new Thread(myRunnable);
		thread2.setPriority(Thread.MAX_PRIORITY);
		// 线程启动
		thread2.start();
	}
}

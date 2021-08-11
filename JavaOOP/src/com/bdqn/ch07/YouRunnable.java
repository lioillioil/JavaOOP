package com.bdqn.ch07;

/**
 * 实现Runnable接口（任务）
 * 
 * @author LILIBO
 *
 */
public class YouRunnable implements Runnable {

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
			System.out.println(Thread.currentThread().getName() + ": " + i);
		}
		System.out.println(Thread.currentThread().getName() + ": " + System.currentTimeMillis());
	}

}

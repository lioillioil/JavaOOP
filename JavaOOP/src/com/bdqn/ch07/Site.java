package com.bdqn.ch07;

/**
 * 模拟网站购票
 * 
 * @author LILIBO
 *
 */
public class Site implements Runnable {

	private int count = 10; // 总票数
	private int num = 0; // 买到了第几张票
	private boolean flag = true; // 标志位，如果票抢完了就不再执行
	
	@Override
	public void run() {
		while (flag) {
			synchronized (this) {
				if (count <= 0) { // 票已经卖完了
					flag = false;
					return;
				}
				num++; // 2
				count--; // 8
				try {
					// 网络延时
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "抢到了第" + num + "张票。");
			}
		}
	}

	/**
	 * 购票方法
	 */
	public synchronized void sale() {
		if (count <= 0) { // 票已经卖完了
			flag = false;
			return;
		}
		num++; // 2
		count--; // 8
		try {
			// 网络延时
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "抢到了第" + num + "张票。");
	}
	
}

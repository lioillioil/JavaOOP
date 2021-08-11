package com.bdqn.ch07.bank;

/**
 * 实现取款的操作
 * 
 * @author LILIBO
 *
 */
public class QukuanRunnable implements Runnable {

	/**
	 * 张三和他妻子共有的账户对象
	 */
	Acconess acconess = new Acconess();
	
	/**
	 * 取款的动作
	 */
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			// 第一种方式：使用同步锁取款
			synchronized (acconess) { // 张三
				System.out.println(Thread.currentThread().getName()+"准备取款");
				if (acconess.qukuan(100)) { // 取款
					System.out.println(Thread.currentThread().getName()+"完成取款，余额" + acconess.getMoney());
				} else {
					System.out.println("余额不足以支付"+Thread.currentThread().getName()+"的取款，余额为0");
				}
			}
			
			// 第二种方式：使用同步方法取款
			// qukuan(100);
			try {
				Thread.sleep(500); // 让当前线程休眠500毫秒
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 同步方法
	 * 
	 * @param money
	 */
	public synchronized void qukuan(int money) {
		if (acconess.getMoney() > 0) {
			System.out.println(Thread.currentThread().getName()+"准备取款");
			// 取款
			if (acconess.qukuan(money)) {
				System.out.println(Thread.currentThread().getName()+"完成取款，余额" + acconess.getMoney());
			}
		} else {
			System.out.println("余额不足以支付"+Thread.currentThread().getName()+"的取款，余额为0");
		}
	}

}

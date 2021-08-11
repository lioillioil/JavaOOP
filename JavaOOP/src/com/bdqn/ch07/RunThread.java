package com.bdqn.ch07;

/**
 * 模拟多人接力跑
 * 
 * @author LILIBO
 *
 */
public class RunThread implements Runnable {

	// 能否让刚刚跑完的人不马上接力？
	
	private int total = 1000; // 总里程
	private int num = 10; // 每次跑多少米
	private boolean flag = true; // 是否跑完
	
	@Override
	public void run() {
		while (flag) {
			synchronized (this) {
				if (total <= 0) {
					flag = false;
					break;
				}
				System.out.println(Thread.currentThread().getName() + "拿到了接力棒！");
				for (int i = 1; i <= 10; i++) {
					total -= num;
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "跑了" + (i * num) + "米！剩余" + total);
				}
			}
		}
	}

	public static void main(String[] args) {
		RunThread run = new RunThread();
		Thread t1 = new Thread(run, "曹嘉康");
		Thread t2 = new Thread(run, "余昌霖");
		Thread t3 = new Thread(run, "苏琳权");
		t1.start();
		t2.start();
		t3.start();
	}
}

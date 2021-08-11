package com.bdqn.ch07.wxred;

/**
 * 模拟微信抢红包
 * 
 * @author LILIBO
 *
 */
public class WXRedPackage implements Runnable {

	private RedPackage redPackage = null;
	private boolean flag = true; // 红包是否抢完
	
	public WXRedPackage() {
		redPackage = new RedPackage(5, 10);
	}
	
	public WXRedPackage(double money, int count) {
		redPackage = new RedPackage(money, count);
	}

	@Override
	public void run() {
//		while (flag) {
			synchronized (redPackage) {
//				if (redPackage.getMoney() <= 0) {
//					flag = false;
//					break;
//				}
				double money = redPackage.randomMoney();
				System.out.println(Thread.currentThread().getName() + "抢到红包，金额：￥" + String.format("%.2f", money) + "元");
				System.out.println("剩余红包金额：￥" + String.format("%.2f", redPackage.getMoney()) + "，还有" + redPackage.getCount() + "个红包没有被领取");

			}
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
	}

}

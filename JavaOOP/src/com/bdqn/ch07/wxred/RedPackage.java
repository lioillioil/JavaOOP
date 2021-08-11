package com.bdqn.ch07.wxred;

/**
 * 模拟微信抢红包
 * 
 * 发送红包到微信群，一共5.00元，10个红包。群里的人抢红包，金额随机（保证10个人都有，至少0.01元）
 * 
 * @author LILIBO
 *
 */
public class RedPackage {

	private double money; // 红包总金额
	private int count; // 红包个数

	public RedPackage() {
	}

	public RedPackage(double money, int count) {
		this.money = money;
		this.count = count;
	}

	/**
	 * 每一次抢多少钱
	 * 
	 * @return
	 */
	public double randomMoney() {
		double m = 0.01D;
		if (this.count-- == 1) {
			m = Math.round(this.money * 100) / 100;
		} else {
			int r = randomAndRound(1, (int) (Math.round((this.money - (0.01D * this.count)))));
			m = r / (Math.pow(10, 2));
		}
		this.money -= m;
		return m;
	}

	/**
	 * 产生一个随机数（最大值，最小值）
	 * 
	 * @param min 最大值
	 * @param max 最小值
	 * @return
	 */
//	public double randomAndRound(double min, double max) {
//		int r = (int) ((Math.random() * ((max * 100) - (min * 100))) + (min * 100));
//		double m = (Math.round(r) / 100.0D);
//		double m = ((Math.round(Math.random() * 100) / 100.0D) * (max - min) + min);
//		m *= Math.pow(10, 2);
//		return (Math.round(m)) / (Math.pow(10, 2));
//	}
	
	public int randomAndRound(int min, int max) {
		return (int)(Math.random() * (max - min) + min);
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}

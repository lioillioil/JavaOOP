package com.bdqn.ch07.bank;

/**
 * 张三和他妻子共同的账户
 * 
 * @author LILIBO
 *
 */
public class Acconess {

	/**
	 * 账户中的余额
	 */
	private int money = 3;

	/**
	 * 取款
	 * @param m 要取多少钱
	 * @return 是否取款成功
	 */
	public boolean qukuan(int m) {
		if (money<=0) {
			return false;
		}
		if (money < m) {
			return false;
		}
		money = money - m;
		return true;
	}
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}

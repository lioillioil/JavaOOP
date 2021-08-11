package com.bdqn.ch07;

/**
 * 测试抢票
 * 
 * @author LILIBO
 *
 */
public class TestSite {

	public static void main(String[] args) {
		Site site = new Site();
		Thread t1 = new Thread(site, "曹嘉康");
		Thread t2 = new Thread(site, "段良锦");
		t1.start();
		t2.start();
	}
}

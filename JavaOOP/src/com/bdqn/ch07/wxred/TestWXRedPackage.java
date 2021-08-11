package com.bdqn.ch07.wxred;

/**
 * 测试微信抢红包
 * 
 * @author LILIBO
 *
 */
public class TestWXRedPackage {

	public static void main(String[] args) {
		WXRedPackage redPackage = new WXRedPackage(8.00D, 10);
		new Thread(redPackage, "曹嘉康").start();
		new Thread(redPackage, "余昌霖").start();
		new Thread(redPackage, "邱志豪").start();
		new Thread(redPackage, "罗文敏").start();
		new Thread(redPackage, "曾俊玮").start();
		new Thread(redPackage, "周鹏涛").start();
		new Thread(redPackage, "段良锦").start();
		new Thread(redPackage, "蒋继泽").start();
		new Thread(redPackage, "成旭康").start();
		new Thread(redPackage, "全宏麒").start();
	}

}

package com.bdqn.ch07.bank;

/**
 * 测试张三和他妻子同时取款
 * 
 * @author LILIBO
 *
 */
public class TestQukuan {

	public static void main(String[] args) {
		// 取款的任务
		QukuanRunnable qukuanRunnable  = new QukuanRunnable();
		Thread zhangshang = new Thread(qukuanRunnable, "张三");
		Thread zhangshangqizi = new Thread(qukuanRunnable, "张三的妻子");
		zhangshang.start(); // 通知线程工作
		zhangshangqizi.start(); // 通知线程工作
	}
}

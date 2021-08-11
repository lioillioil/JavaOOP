package com.bdqn.ch07;

/**
 * 显示主线程
 * 
 * @author LILIBO
 *
 */
public class ThreadDemo {

	public static void main(String[] args) {
		Thread t = Thread.currentThread(); // 拿到当前线程（运行这行代码的线程）
		System.out.println("当前线程是：" + t.getName());
		t.setName("主线程");
		System.out.println("设置名称之后是：" + t.getName());
	}
}

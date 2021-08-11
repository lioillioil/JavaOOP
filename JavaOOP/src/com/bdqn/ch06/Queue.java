package com.bdqn.ch06;

import java.util.LinkedList;

/**
 * 队列
 * 
 * @author LILIBO
 *
 */
public class Queue {

	LinkedList<String> list = new LinkedList<String>();

	/**
	 * 入队
	 * 
	 * @param str
	 */
	public void add(String str) {
		list.addFirst(str); // 1 2 3
	}

	/**
	 * 出队
	 * 
	 * @return
	 */
	public String get() {
		return list.removeLast();
	}

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.add("曹嘉康");
		queue.add("余昌霖");
		queue.add("王南燕");

		System.out.println(queue.get() + "可以打饭了！");
		System.out.println(queue.get() + "可以打饭了！");
		System.out.println(queue.get() + "可以打饭了！");
	}
}

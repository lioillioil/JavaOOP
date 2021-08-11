package com.bdqn.ch02.book;

/**
 * JavaOOP这本书
 * 
 * @author LILIBO
 *
 */
public class JavaOOP extends Book {

	/**
	 * JavaOOP的构造方法
	 */
	public JavaOOP() {
		super.setName("《使用Java实现面向对象编程》");
		super.setPages(261);
	}

	/**
	 * JavaOOP这本书阅读方法
	 */
	@Override
	public void read() {
		System.out.println(this.getName() + " 共" + this.getPages() + "页。通过结合老师上课，一章一章的阅读");
	}

}

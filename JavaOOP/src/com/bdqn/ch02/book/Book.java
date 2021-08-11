package com.bdqn.ch02.book;

/**
 * 书（抽象类）
 * 
 * @author LILIBO
 *
 */
public abstract class Book {

	private String name; // 书名
	private int pages; // 页数

	/**
	 * 作为一本书，规定得要有阅读方法
	 */
	public abstract void read();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

}

package com.bdqn.ch02.book;

/**
 * 新华字典
 * 
 * @author LILIBO
 *
 */
public class XinhuaDictionary extends Book {

	public XinhuaDictionary() {
		super.setName("《新华字典》");
		super.setPages(689);
	}
	
	/**
	 * 新华字典阅读方法
	 */
	@Override
	public void read() {
		System.out.println(this.getName() + " 共" + this.getPages() + "页。通过拼音、部首等查字法查询对应字的页码，查看这个字的内容");
	}

}

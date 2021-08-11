package com.bdqn.ch04;

/**
 * 打印机类
 * 
 * @author LILIBO
 *
 */
public class Printer {

	InkBok inkBok; // 墨盒
	Paper paper; // 纸张

	/**
	 * 使用墨盒在纸张上打印
	 */
	public void print() {
		System.out.println("使用" + inkBok.getColor() + "墨盒在" + paper.getSize() + "纸张上打印。");
	}

	public InkBok getInkBok() {
		return inkBok;
	}

	public void setInkBok(InkBok inkBok) {
		this.inkBok = inkBok;
	}

	public Paper getPaper() {
		return paper;
	}

	public void setPaper(Paper paper) {
		this.paper = paper;
	}

}

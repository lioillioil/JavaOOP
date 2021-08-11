package com.bdqn.ch04;

/**
 * 打印机测试类
 * 
 * @author LILIBO
 *
 */
public class TestPrinter {

	public static void main(String[] args) {
		// 定义一台打印机
		InkBok inkBok; // 墨盒
		Paper paper; // 纸张
		Printer printer = new Printer();
		
		// 第一次 组装打印机
		inkBok = new GrayInkBok(); // 黑白墨盒
		paper = new A4Paper(); // A4纸张
		printer.setInkBok(inkBok); // 组装墨盒
		printer.setPaper(paper); // 放入纸张
		printer.print(); // 开始打印
		
		// 第二次 组装打印机
		inkBok = new ColorInkBok(); // 彩色墨盒
		paper = new A4Paper(); // A4纸张
		printer.setInkBok(inkBok); // 组装墨盒
		printer.setPaper(paper); // 放入纸张
		printer.print(); // 开始打印
		
		// 第三次 组装打印机
		inkBok = new ColorInkBok(); // 彩色墨盒
		paper = new B5Paper(); // B5纸张
		printer.setInkBok(inkBok); // 组装墨盒
		printer.setPaper(paper); // 放入纸张
		printer.print(); // 开始打印
	}
}

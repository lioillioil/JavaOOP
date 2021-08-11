package com.bdqn.ch08;

import java.io.File;

/**
 * 演示文件的操作
 * 
 * @author LILIBO
 *
 */
public class Test1 {

	public static void main(String[] args) {
		// 程序运行时，相对位置以项目路径为基准
		File file = new File("src/MyFile.txt");
		if(file.exists()) { // 判断文件是否存在
			System.out.println("该文件是一个：" + (file.isFile() ? "文件" : "目录"));
			System.out.println("文件的大小是：" + file.length());
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
		} else {
			System.out.println("D:\\\\MyFile.txt 文件不存在");
		}
	}
}

package com.bdqn.ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 演示文件流操作
 * 
 * 只能读英文，中文读不了
 * 
 * @author LILIBO
 *
 */
public class Test2 {

	public static void main(String[] args) {
		FileInputStream input = null;
		try {
			input = new FileInputStream("src/MyFile.txt");
			System.out.println("可读取的字节数：" + input.available());
			System.out.println("文件的内容：");
			int data = 0; // 通过字节流一个一个字节读取文件
			while ((data = input.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

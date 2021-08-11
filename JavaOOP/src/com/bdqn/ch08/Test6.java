package com.bdqn.ch08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 演示字符流的读写
 * 
 * 读取文件
 * 
 * @author LILIBO
 *
 */
public class Test6 {

	public static void main(String[] args) {
		FileReader reader = null; // 以字符流的方式读取文件
		StringBuffer sb = null;
		try {
			reader = new FileReader("src/pet.template");
			char[] ch = new char[1024];
			sb = new StringBuffer();
			while (reader.read(ch) != -1) {
				sb.append(ch);
			}
			System.out.println(sb.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

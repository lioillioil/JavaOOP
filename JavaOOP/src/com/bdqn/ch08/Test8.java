package com.bdqn.ch08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 演示字符流的读写
 * 
 * 读取文件
 * 
 * @author LILIBO
 *
 */
public class Test8 {

	public static void main(String[] args) {
		FileReader reader = null; // 以字符流的方式读取文件
		FileWriter writer = null; // 以字符流的方式写入文件
		StringBuffer sb = null;
		try {
			reader = new FileReader("src/pet.template");
			char[] ch = new char[1024];
			sb = new StringBuffer();
			while (reader.read(ch) != -1) {
				sb.append(ch);
			}
			String temp = sb.toString();
			System.out.println(temp);
			temp = temp.replace("{name}", "贝贝");
			temp = temp.replace("{type}", "雪瑞纳");
			temp = temp.replace("{master}", "曹嘉康");
			writer = new FileWriter("src/pet.template", false);
			writer.write(temp);
			writer.flush();
			System.out.println("替换完成！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

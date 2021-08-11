package com.bdqn.ch08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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
public class Test9 {

	public static void main(String[] args) {
		FileReader reader = null; // 以字符流的方式读取文件
		BufferedReader br = null;
		FileWriter writer = null; // 以字符流的方式写入文件
		BufferedWriter bw = null;
		StringBuffer sb = new StringBuffer();
		try {
			reader = new FileReader("src/pet.template");
			br = new BufferedReader(reader);
			String line = null;
			while ((line = br.readLine()) != null) {
				sb.append(line).append("\n\r"); // \n 代表回车 \r 代表换行
			}
			String temp = sb.toString();
			System.out.println(temp);
			temp = temp.replace("{name}", "贝贝");
			temp = temp.replace("{type}", "雪瑞纳");
			temp = temp.replace("{master}", "曹嘉康");
			writer = new FileWriter("src/pet.template", false);
			bw = new BufferedWriter(writer);
//			bw.newLine(); // 添加一个新行
			bw.write(temp);
			bw.flush();
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
			if (br != null) {
				try {
					br.close();
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
			
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

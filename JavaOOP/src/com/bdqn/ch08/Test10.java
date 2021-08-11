package com.bdqn.ch08;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 演示二进制文件流操作
 * 
 * 复制图片
 * 
 * @author LILIBO
 *
 */
public class Test10 {

	public static void main(String[] args) {
		DataInputStream in = null; // 二进制输入流对象
		DataOutputStream out = null; // 二进制输出流对象
		try {
			// 创建文件输入流对象
			FileInputStream file = new FileInputStream("1001.jpg");
			// 将文件输入流对象传入二进制输入流对象，进行封装
			in = new DataInputStream(file);
			// 创建二进制输出流对象（使用文件输出流对象进行封装）
			out = new DataOutputStream(new FileOutputStream("1001_copy.jpg"));
			int data;
			// 二进制文件的读取
			while ((data = in.read()) != -1) {
				// 二进制文件的写入
				out.write(data);
			}
			System.out.println("二进制文件复制成功！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

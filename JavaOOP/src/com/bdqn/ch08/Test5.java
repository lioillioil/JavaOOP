package com.bdqn.ch08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 演示文件流操作
 * 
 * 向文件中写入内容
 * 
 * @author LILIBO
 *
 */
public class Test5 {

	public static void main(String[] args) {
		File fileSource = new File("src/MyFile.txt");
		File fileTarget = new File("src/MyFile2.txt"); // 目标文件
		FileInputStream input = null;
		FileOutputStream output = null;
		try {
			input = new FileInputStream(fileSource);
			String context = "";
			byte[] b = new byte[1024]; // 通过字节流一个一个字节读取文件
			// 读取的内容放在byte[]中
			while (input.read(b) != -1) {
				// 出现乱码，编码方式与解密方式不一致导致的！（将解码方式与编码方式保持一致）
				context = new String(b, "UTF-8");
				System.out.print(context);
			}
			
			output = new FileOutputStream(fileTarget, true);
			output.write(b); // 覆盖
			System.out.println("复制成功！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				input.close();
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

package com.bdqn.ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 演示文件流操作
 * 
 * 将解码方式与编码方式保持一致，读取中文
 * 
 * @author LILIBO
 *
 */
public class Test3 {

	public static void main(String[] args) {
		InputStream input = null; // InputStream是抽象类，使用FileInputStream进行实例化操作
		try {
			input = new FileInputStream("src/MyFile.txt");
			System.out.println("可读取的字节数：" + input.available());
			System.out.println("文件的内容：");
			byte[] b = new byte[1024];
			// 读取的内容放在byte[]中
			while (input.read(b) != -1) {
				// 出现乱码，编码方式与解密方式不一致导致的！（将解码方式与编码方式保持一致）
				System.out.print(new String(b, "GBK"));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

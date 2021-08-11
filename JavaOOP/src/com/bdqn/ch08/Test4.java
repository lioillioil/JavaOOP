package com.bdqn.ch08;

import java.io.File;
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
public class Test4 {

	public static void main(String[] args) {
		String str = "我永远的神！";
		
		File file = new File("src/MyFile.txt");
		FileOutputStream output = null;
		try {
			output = new FileOutputStream(file, true);
			byte[] b = str.getBytes();
			output.write(b, 0, b.length); // 覆盖
			System.out.println("写入成功！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

package com.bdqn.ch08;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 演示字符流的读写
 * 
 * 写入文件
 * 
 * @author LILIBO
 *
 */
public class Test7 {

	public static void main(String[] args) {
		FileWriter writer = null;
		try {
			writer = new FileWriter("src/MyFile.txt", true);
			writer.write("大家好！");
			writer.write("我叫曹嘉康");
			writer.flush(); // 刷新缓存，将内存缓冲区中的内容写入磁盘
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

package com.bdqn.ch04;

/**
 * U盘
 * 
 * @author LILIBO
 *
 */
public class UDisk implements USBInterface {

	/**
	 * U盘服务
	 */
	@Override
	public void service() {
		System.out.println("连接USB接口，开始传输数据。");
	}

}

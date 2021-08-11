package com.bdqn.ch04;

/**
 * 测试USB接口
 * 
 * @author LILIBO
 *
 */
public class TestUSB {

	public static void main(String[] args) {
		USBInterface usb = new UDisk();
		usb.service();
	}
}

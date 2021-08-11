package com.bdqn.ch02.lease;

/**
 * 小轿车
 * 
 * @author LILIBO
 *
 */
public class Car extends MotoVehicle {

	// 型号
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void print() {
		System.out.println("访问到了：" + super.name);
	}
}

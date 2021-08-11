package com.bdqn.ch04;

/**
 * 测试防盗门
 * 
 * @author LILIBO
 *
 */
public class TestDoor {

	public static void main(String[] args) {
		CJKTheftproofDoor theftproofDoor = new CJKTheftproofDoor();
		// 进家门的过程
		theftproofDoor.openLock(); // 开锁
		theftproofDoor.open(); // 开门
		// 大约10分钟后
		theftproofDoor.close(); // 关门
		theftproofDoor.lockUp(); // 上锁
		theftproofDoor.takePictures();
	}
}

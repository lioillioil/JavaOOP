package com.bdqn.ch04;

/**
 * OOO牌防盗门类
 * 
 * @author LILIBO
 *
 */
public class OOOTheftproofDoor extends Door implements Lock,DoorBell {

	@Override
	public void open() {
		System.out.println("用力推，门打开了。");
	}

	@Override
	public void close() {
		System.out.println("轻轻拉门，门关上了。");
	}

	@Override
	public void lockUp() {
		System.out.println("主人来了，人脸识别，自动开门。");
	}

	@Override
	public void openLock() {
		System.out.println("检测到家里没有人，自动锁门。");
	}

	@Override
	public void takePictures() {
		System.out.println("铃。。。咔嚓。。。照片已存档。");
	}

}

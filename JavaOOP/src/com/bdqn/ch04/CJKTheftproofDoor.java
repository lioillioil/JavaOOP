package com.bdqn.ch04;

/**
 * CJK牌防盗门类
 * 
 * @author LILIBO
 *
 */
public class CJKTheftproofDoor extends Door implements Lock,DoorBell {

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
		System.out.println("插进钥匙，向左旋转两圈，锁上了，拔出钥匙。");
	}

	@Override
	public void openLock() {
		System.out.println("插进钥匙，向右旋转两圈，锁开了，拔出钥匙。");
	}

	@Override
	public void takePictures() {
		System.out.println("铃。。。咔嚓。。。照片已存档。");
	}

}

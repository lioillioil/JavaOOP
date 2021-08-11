package com.bdqn.ch04;

/**
 * 锁（接口）
 * 
 * @author LILIBO
 *
 */
public interface Lock {

	/**
	 * 上锁
	 */
	void lockUp();
	
	/**
	 * 开锁
	 */
	void openLock();
}

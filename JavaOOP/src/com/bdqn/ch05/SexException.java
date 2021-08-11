package com.bdqn.ch05;

/**
 * 自定义异常类（性别异常）
 * 
 * @author LILIBO
 *
 */
public class SexException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * 构造方法
	 * 
	 * @param msg
	 */
	public SexException() {
		super("性别必须是\"男\"或者\"女\"！");
	}
}

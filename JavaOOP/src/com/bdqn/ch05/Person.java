package com.bdqn.ch05;

public class Person {

	private String name = ""; // 姓名
	private int age = 0; // 年龄
	private String sex = "男"; // 性别

	/**
	 * 抛出异常
	 * 
	 * @param sex
	 * @throws Exception 抛出的异常
	 */
	public void setSex(String sex) throws SexException {
		if ("男".equals(sex) || "女".equals(sex)) {
			this.sex = sex;
		} else {
			throw new SexException();
		}
	}

	public static void main(String[] args) {
		Person p = new Person();
		try {
			p.setSex("男生");
		} catch (SexException e) {
			System.out.println(e.getMessage());
		}
	}
}

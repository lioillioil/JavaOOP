package com.bdqn;

/**
 * 宠物类
 * 
 * @author LILIBO
 *
 */
public abstract class Pet { // 定义为 abstract（抽象类）将不能再被实例化了！

	// private 私有的
	private String name = "无名氏"; // 昵称
	private int health = 100; // 健康值
	private int love = 0; // 亲密度

	/**
	 * 无参构造方法
	 */
	public Pet() {
		this.health = 95;
//		System.out.println("执行宠物的无参构造方法。");
	}
	
	/**
	 * 有参构造方法
	 * 
	 * @param name
	 */
	public Pet(String name) {
		this.name = name;
	}
	
	/**
	 * 所有的宠物都能吃东西
	 */
	public abstract void eat();

	/**
	 * 父类的buy()方法
	 */
	/*public Pet buy() {
		return new Pet();
	}*/
	
	/**
	 * 输出宠物信息
	 */
	public abstract void print();
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	// Alt + Shift + S + R 实现快速封装

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		this.love = love;
	}
	
}

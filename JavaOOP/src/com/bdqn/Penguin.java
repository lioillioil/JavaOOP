package com.bdqn;

/**
 * 宠物企鹅类
 * 
 * @author LILIBO
 *
 */
public class Penguin extends Pet {

	/**
	 * 静态的常量
	 */
	static final String SEX_MALE = "Q仔";
	static final String SEX_FEMALE = "Q妹";

	private String sex = Penguin.SEX_MALE; // 性别

	/**
	 * 自定义构造方法
	 */
	public Penguin() {
		System.out.println("Penguin 自定义构造方法");
	}

	/**
	 * 宠物企鹅构造方法
	 * 
	 * @param name 宠物姓名
	 * @param sex  宠物企鹅性别
	 */
	public Penguin(String name, String sex) {
		// 不写调用父类构造方法，默认调用父类无参构造方法
		// super();
		super(name);
		this.sex = sex;
	}

	/**
	 * 宠物企鹅吃东西
	 */
	@Override
	public void eat() {
		this.setHealth(this.getHealth() + 5); // 健康值+5
		System.out.println("企鹅" + this.getName() + "吃饱了，健康值加5。");
	}

	/**
	 * 企鹅会游泳
	 */
	public void swimming() {
		System.out.println("企鹅" + this.getName() + "正在游泳。");
		this.setHealth(this.getHealth() - 10);
		this.setLove(this.getLove() + 5);
	}
	
	/**
	 * 重写父类print()方法
	 */
	public void print() {
		System.out.println("宠物狗的自白：\n我的名字叫" + this.getName() + "，健康值是" + this.getHealth() + "，和主人的亲密度是" + this.getLove() + "，性别是" + this.getSex());
	}

	public String getSex() {

		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}

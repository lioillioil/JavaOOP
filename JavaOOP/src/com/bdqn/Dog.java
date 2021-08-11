package com.bdqn;

/**
 * 宠物狗
 * 
 * @author LILIBO
 *
 */
public class Dog extends Pet {

	private String strain; // 品种

	/**
	 * 当你编写了带参数的构造方法，那么这个无参的默认构造方法就首先写出来
	 */
	public Dog() {
		System.out.println("Dog 无参构造方法");
	}

	/**
	 * 有参构造方法
	 * 
	 * @param name   昵称
	 * @param strain 品种
	 */
	public Dog(String name, String strain) {
		super(name); // 调用父类的构造方法
		this.strain = strain; // 品种，自己本类的属性可用用this访问
	}

	/**
	 * 宠物狗吃东西
	 */
	@Override
	public void eat() {
		this.setHealth(this.getHealth() + 3); // 健康值+3
		System.out.println("狗狗" + this.getName() + "吃饱了，健康值加3。");
	}

	/**
	 * 重写父类的buy()方法
	 */
	/*public Dog buy() {
		return new Dog("大黄", "招财狗");
	}*/
	
	/**
	 * 狗狗会玩飞盘
	 */
	public void catchingFlyDisc() {
		System.out.println("狗狗" + this.getName() + "正在接飞盘。");
		this.setHealth(this.getHealth() - 10);
		this.setLove(this.getLove() + 5);
		
	}

	@Override
	public void print() {
		System.out.println("宠物狗的自白：\n我的名字叫" + this.getName() + "，健康值是" + this.getHealth() + "，和主人的亲密度是" + this.getLove() + "，我的品种是" + this.getStrain());
	}

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

}

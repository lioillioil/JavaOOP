package com.bdqn;

/**
 * 猫
 * @author LILIBO
 *
 */
public class Cat extends Pet {

	/**
	 * 猫吃东西
	 */
	@Override
	public void eat() {
		this.setHealth(this.getHealth() + 4);
		System.out.println("猫" + this.getName() + "吃饱了，健康值加4。");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

}

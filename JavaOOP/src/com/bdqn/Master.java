package com.bdqn;

/**
 * 主人类
 * 
 * @author LILIBO
 *
 */
public class Master {

	private String name;
	private int money = 0;

	public Master() {

	}

	public Master(String name, int money) {
		this.name = name;
		this.money = money;
	}

	/**
	 * 通过宠物类型领养宠物
	 * 
	 * @param typeId 宠物类型
	 * @return 领养的宠物
	 */
	public Pet getPet(int typeId) {
		Pet pet = null;
		if (typeId == 1) {
			pet = new Dog("小白", "拉布拉多犬"); // 领养了一只【宠物】狗
		} else if (typeId == 2) {
			pet = new Penguin("琪琪", "Q妹"); // 领养了一只【宠物】企鹅
		}
		return pet;
	}
	
	/**
	 * 主人给【宠物】喂食
	 * @param pet
	 */
	public void feed(Pet pet) {
		pet.eat(); // 宠物类中定义了宠物吃东西的抽象方法
	}
	
	/**
	 * 主人给狗狗喂食
	 * 
	 * @param dog 狗狗对象
	 */
	/*public void feed(Dog dog) {
		// 调用狗狗吃东西的方法
		dog.eat();
	}*/

	/**
	 * 主人给企鹅喂食
	 * 
	 * @param pgn 企鹅对象
	 */
	/*public void feed(Penguin pgn) {
		// 调用企鹅吃东西的方法
		pgn.eat();
	}*/

	/**
	 * 主人与宠物玩耍
	 */
	public void play(Pet pet) {
		// 对宠物进行类型判断（instanceof关键字）
		if (pet instanceof Dog) { // 假设这个宠物是狗
			Dog dog = (Dog) pet; // 强制转换（父类转子类），将宠物转换为宠物狗
			dog.catchingFlyDisc(); // 调用狗狗玩飞盘游戏
		} else if (pet instanceof Penguin) { // 假设这个宠物是企鹅
			Penguin pgn = (Penguin) pet; // 强制转换（父类转子类），将宠物转换为宠物企鹅
			pgn.swimming(); // 调用企鹅游泳
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

}

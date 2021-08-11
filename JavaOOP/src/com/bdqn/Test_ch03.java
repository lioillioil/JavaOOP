package com.bdqn;

import java.util.Scanner;

/**
 * 
 * @author LILIBO
 *
 */
public class Test_ch03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		Dog dog = new Dog("旺财", "土狗");
//		Penguin pgn = new Penguin("腾讯", "Q妹");
//		Cat cat = new Cat();
		Master master = new Master("啊黄", 100);
//		master.feed(dog); // 给宠物狗喂食
//		master.feed(pgn); // 给宠物企鹅喂食
//		master.feed(cat); // 新宠物，猫
		
		System.out.println("请输入您要领养的宠物类型：（1、狗狗 2、企鹅）");
		int typeId = input.nextInt();
		Pet pet = master.getPet(typeId);
		if (pet != null) {
			System.out.println("领养成功！");
			// 主人给宠物喂食
			master.feed(pet);
			// 主人与宠物玩游戏
			master.play(pet);
		} else {
			System.out.println("领养失败，还没有这种类型的宠物！");
		}
	}
}

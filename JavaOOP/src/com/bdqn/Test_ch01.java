package com.bdqn;

import java.util.Scanner;

/**
 * 测试 领养宠物
 * @author LILIBO
 *
 */
public class Test_ch01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎您来到宠物店！");
		
		// 1、输入宠物名称
		System.out.print("请输入要领养的宠物名称：");
		String name = input.next();
		
		// 2、选择宠物类型
		System.out.println("请选择要领养的宠物类型：（1、狗狗 2、企鹅）");
		int type = input.nextInt();
		// 3、根据宠物类型创建对应的宠物对象
		switch (type) {
			case 1:
				System.out.println("请选择狗狗的品种：（1、聪明的拉布拉多犬 2、酷酷的雪纳瑞犬）");
				String strain = null;
				if (input.nextInt()==1) {
					strain = "聪明的拉布拉多犬";
				} else {
					strain = "酷酷的雪纳瑞犬";
				}
				// 创建狗狗对象
				Dog dog = new Dog();
				// 给狗狗对象的属性赋值
				// dog.name = name;
				dog.setName(name);
				dog.setStrain(strain);
				// 调用方法，输出狗狗信息
				dog.print();
				break;
			case 2:
				System.out.println("请选择企鹅的性别：（1、Q仔 2、Q妹）");
				String sex = null;
				if (input.nextInt()==1) {
					sex = Penguin.SEX_MALE;
				} else {
					sex = Penguin.SEX_FEMALE;
				}
				// 创建企鹅对象
				Penguin pgn = new Penguin();
				// 给企鹅对象的属性赋值
				pgn.setName(name);
				pgn.setSex(sex);
				// 调用方法，输出企鹅信息
				pgn.print();
				break;
		}
	}
}

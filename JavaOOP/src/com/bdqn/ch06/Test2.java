package com.bdqn.ch06;

import java.util.LinkedList;

import com.bdqn.Dog;
import com.bdqn.Pet;

/**
 * 演示LinkedList集合
 * 
 * @author LILIBO
 *
 */
public class Test2 {

	public static void main(String[] args) {
		// 创建对象
		Dog ououDog = new Dog("欧欧", "雪纳瑞");
		Dog yayaDog = new Dog("亚亚", "拉布拉多");
		Dog meimeiDog = new Dog("美美", "雪纳瑞");
		Dog feifeiDog = new Dog("菲菲", "拉布拉多");
		
		// LinkedList集合对象
		LinkedList<Pet> dogs = new LinkedList<>();
		dogs.add(ououDog); // 向集合中添加对象
		dogs.add(yayaDog);
		dogs.addFirst(meimeiDog); // 将元素添加到第一个位置
		dogs.addLast(feifeiDog); // 将元素添加到最后一个位置
		
		// 获取集合中存储的内容数量
		int length = dogs.size();
		System.out.println("共计有" + length + "条狗狗。\n");
		
		// 移除指定位置的对象
		System.out.println("移除下标为3的对象");
		dogs.remove(3); // 从集合中删除下标为3的对象（如果没有该下标则报错）
		System.out.println("移除集合中第一个元素");
		dogs.removeFirst(); // 删除集合中第一个元素
		System.out.println("移除集合中最后一个元素");
		dogs.removeLast(); // 删除集合中最后一个元素
		
		length = dogs.size(); // 重新获取集合的大小
		System.out.println("\n移除后共计有" + length + "条狗狗。");
		
		Dog firstDog = (Dog) dogs.getFirst(); // 获取第一个狗狗
		System.out.println("第一个狗狗是：" + firstDog.getName());
		
		System.out.println("\n分别是：");
		// 遍历集合中的内容
		for (int i = 0; i < length; i++) {
			Dog dog = (Dog) dogs.get(i); // 通过下标获取集合中的内容（下标从0开始）
			System.out.println(dog.getName() + "\t" + dog.getStrain());
		}
		
		// 判断集合中是否有指定对象
		if (dogs.contains(ououDog)) {
			System.out.println("\n集合中包含" + ououDog.getName() + "的信息");
		} else {
			System.out.println("\n集合中不包含" + ououDog.getName() + "的信息");
		}
		
	}
}

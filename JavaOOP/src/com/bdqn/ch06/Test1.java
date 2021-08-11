package com.bdqn.ch06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bdqn.Dog;
import com.bdqn.Penguin;
import com.bdqn.Pet;

/**
 * 演示ArrayList集合
 * 
 * @author LILIBO
 *
 */
public class Test1 {

	public static void main(String[] args) {
		// 创建对象
		Dog ououDog = new Dog("欧欧", "雪纳瑞");
		Dog yayaDog = new Dog("亚亚", "拉布拉多");
		Dog meimeiDog = new Dog("美美", "雪纳瑞");
		Dog feifeiDog = new Dog("菲菲", "拉布拉多");
		
		// ArrayList集合对象
		List<Pet> dogs = new ArrayList<>();
		dogs.add(ououDog); // 向集合中添加对象
		dogs.add(yayaDog);
		dogs.add(meimeiDog);
		dogs.add(2, feifeiDog); // 添加到指定位置
		
		// 泛型演示
		Penguin penguin = new Penguin("QQ", "腾讯");
		dogs.add(penguin);
		
		// 获取集合中存储的内容数量
		int length = dogs.size();
		System.out.println("共计有" + length + "条狗狗。\n");
		
		// 移除指定位置的对象
		System.out.println("移除下标为3的对象");
		dogs.remove(3); // 从集合中删除下标为3的对象（如果没有该下标则报错）
		System.out.println("移除指定对象ououDog");
		dogs.remove(ououDog); // 从集合中删除指定对象
		dogs.remove(ououDog); // 从集合中删除指定对象（如果该对象不存在则忽略）
		
		length = dogs.size(); // 重新获取集合的大小
		System.out.println();
		
		System.out.println("分别是：");
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
		
		System.out.println("使用迭代器：");
		// 迭代器的使用
		Iterator<Pet> it = dogs.iterator(); // 迭代
		while (it.hasNext()) { // 遍历
			Dog dog = (Dog) it.next(); // 从Set<String> keys中获取下一个元素
			System.out.println(dog.getName() + "\t" + dog.getStrain());
		}
	}
}

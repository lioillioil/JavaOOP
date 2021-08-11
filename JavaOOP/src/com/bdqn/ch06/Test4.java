package com.bdqn.ch06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.bdqn.Dog;

/**
 * 演示迭代器Iterator
 * 
 * @author LILIBO
 *
 */
public class Test4 {

	public static void main(String[] args) {
		// 创建对象
		Dog ououDog = new Dog("欧欧", "雪纳瑞");
		Dog yayaDog = new Dog("亚亚", "拉布拉多");
		Dog meimeiDog = new Dog("美美", "雪纳瑞");
		Dog feifeiDog = new Dog("菲菲", "拉布拉多");
		
		Map<String, Dog> dogMap = new HashMap<String, Dog>();
		dogMap.put(ououDog.getName(), ououDog);
		dogMap.put(yayaDog.getName(), yayaDog);
		dogMap.put(meimeiDog.getName(), meimeiDog);
		dogMap.put(feifeiDog.getName(), feifeiDog);
		
		System.out.println("使用Iterator遍历所有狗狗名称和品种：");
		
		// 迭代器的使用
		Set<String> keys = dogMap.keySet(); // 获取key集合
		Iterator<String> it = keys.iterator(); // 迭代
		while (it.hasNext()) { // 遍历
			String key = it.next(); // 从Set<String> keys中获取下一个元素
			Dog dog = dogMap.get(key);
			System.out.println(key + "\t" + dog.getStrain());
		}
		
		System.out.println("使用for遍历所有狗狗名称和品种：");
		// 增强for循环的使用
		for (String key : dogMap.keySet()) {
			System.out.println(key + "\t" + dogMap.get(key).getStrain());
		}
	}
}

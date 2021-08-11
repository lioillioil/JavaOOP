package com.bdqn.ch06;

import java.util.HashSet;
import java.util.Set;

import com.bdqn.Dog;

/**
 * 演示Set集合
 * 
 * @author LILIBO
 *
 */
public class Test5 {

	public static void main(String[] args) {
		Dog ououDog = new Dog("欧欧", "雪纳瑞");
		Dog yayaDog = new Dog("亚亚", "拉布拉多");
		Dog meimeiDog = new Dog("美美", "雪纳瑞");
		Dog feifeiDog = new Dog("菲菲", "拉布拉多");
		
		Set<Dog> dogs = new HashSet<>();
		dogs.add(ououDog);
		dogs.add(yayaDog);
		dogs.add(meimeiDog);
		dogs.add(feifeiDog);
		
		for (Dog dog : dogs) {
			System.out.println(dog.getName() + "\t" + dog.getStrain());
		}
		
		Set<String> strs = new HashSet<>();
		strs.add("b");
		strs.add("a");
		strs.add("c");
		strs.add("d");
		for (String str : strs) {
			System.out.println(str);
		}
	}
}

package com.bdqn.ch06;

import java.util.HashMap;
import java.util.Map;

/**
 * 演示Map集合（键值对）
 * 
 * @author LILIBO
 *
 */
public class Test3 {

	public static void main(String[] args) {
		// 实例化HashMap对象，使用Map接收
		Map<String, String> map = new HashMap<>();
		map.put("CN", "中华人民共和国");
		map.put("RU", "俄罗斯联邦");
		map.put("FR", "法兰西共和国");
		map.put("US", "美利坚合众国");
		
		// 通过Key获取Value
		String country = map.get("RU");
		System.out.println("RU 对应的国家是：" + country);
		
		// 获取Map中元素的个数
		int length = map.size();
		System.out.println("Map中共有" + length + "组数据。");
		
		map.put(null, null); // HashMap中可以存在key为null的元素，但是只能存在一个
		
		length = map.size();
		System.out.println("现在Map中共有" + length + "组数据。");
		
		System.out.println(map.keySet()); // 唯一，无序
		System.out.println(map.values());
		System.out.println(map);
		
		map.remove("US"); // 移除了key为US的键值对
		if (map.containsKey("US")) {
			System.out.println("美利坚合众国还存在。");
		} else {
			System.out.println("美利坚合众国已经不存在了。");
		}
		System.out.println(map);
		
		// 清空所有数据
		map.clear();
		
		length = map.size();
		System.out.println("现在Map中共有" + length + "组数据。");
		
		// 是否是空的
		if (map.isEmpty()) {
			System.out.println("Map已经被清空。");
		}
	}
}

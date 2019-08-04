package com.veryoo.co;

import java.util.HashSet;

/**
 * HashSet演示
 * @author obj
 * 
 */
public class Test07 {

	public static void main(String[] args) {
		// 创建一个HashSet对象
		HashSet<String> set = new HashSet<String>();
		set.add("a");// 放入重复元素
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		
		
		set.remove("d");
		
		for (String s : set) {// 遍历set集合
			System.out.println(s);
		}
		
	}
}

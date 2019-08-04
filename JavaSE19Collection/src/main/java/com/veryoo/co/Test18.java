package com.veryoo.co;

import java.util.HashMap;
import java.util.Map;

/**
 * 练习七
 * 统计一段文本中每个字符出现的次数 统计结果到Map集合, 
 * key是字符, value 是字符的个数
 * @author obj
 * 
 */
public class Test18 {
	public static void main(String[] args) {
		String s = "abcc";
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
//		map.put('c', 10);  //自动封装， jdk1.5
		
		for(int i=0; i<s.length(); i++){
			char c = s.charAt(i);
			if(map.containsKey(c)){
				Integer value = map.get(c);
				value += 1;
				map.put(c, value);   //String和基本包装的不可变性
				
			}else{
				map.put(c, 1);
			}
		}
		
		
		System.out.println(map);
	}
}

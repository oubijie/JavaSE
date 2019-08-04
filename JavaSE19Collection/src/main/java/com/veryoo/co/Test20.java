package com.veryoo.co;

import java.util.HashMap;
import java.util.Map;

public class Test20 {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("a", 100);
		map.put("b", new Student(10, "С��"));
		
		Integer a = (Integer)map.get("a");
		a = a + 10;
		map.put("a", a);
		
		Student b = (Student)map.get("b");
		b.setNum(b.getNum() + 10);
//		map.put("b", b);
		
		System.out.println(map);
		//a = 100 
		//b.getNum() = 20
		
	}
}

package com.veryoo.co;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


/**
 * List接口演示
 * @author obj
 *
 */
public class Test02 {

	public static void main(String[] args) {
		List list = new ArrayList();
		
		
		list.add("Hello");
		list.add(new Student(100, "s100"));
		list.add(100);
		
//		System.out.println(list.get(2).getClass());
		
		list.add(1, "Java");
		
		list.remove(1);
		list.remove("Hello");
		list.remove(new Integer(100));
		list.remove(new Student(100, "s100"));
		
		
		System.out.println(list.size());
		System.out.println(list);
		
//		System.out.println(list.get(3));
		
		
		
	}
}

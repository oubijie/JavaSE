package com.veryoo.co;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * Collection接口
 * @author obj
 *
 */
public class Test019 {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		c.add("Hello");
		c.add(new Student(18, "obj"));
		c.add(new Integer(100));
		
		c.remove("Hello");
		c.remove(new Student(18, "obj"));   //实现equals
		c.remove(new Integer(100));
		
		System.out.println(c.size());
		System.out.println(c);
		
		System.out.println(c);
	}
}

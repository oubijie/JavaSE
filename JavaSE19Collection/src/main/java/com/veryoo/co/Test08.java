package com.veryoo.co;

import java.util.TreeSet;

/**
 * TreeSet演示
 * @author obj
 *
 */
public class Test08 {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("a");
		ts.add("a");
		ts.add("d");
		ts.add("b");
		ts.add("e");
		
		for (String s : ts) {// 遍历set集合
			System.out.println(s);
		}
	}
}

package com.veryoo.co;

import java.util.ArrayList;
import java.util.List;


/**
 * 练习二 
 * 写一个方法，接收两个List参数，返回两个List中包含的相同元素的集合
 * @author obj
 *
 */
public class Test05 {
	
	public static void main(String[] args) {
		List a = new ArrayList();
		a.add("hello");
		a.add("hello");
		a.add("java");
		a.add(new Student(1, "s1"));
		
		
		List b = new ArrayList();
		b.add("hello");
//		b.add("hello");
		b.add(100);
		b.add(new Student(1, "s1"));
		
		
		List cList = getTheSame(a, b);
		System.out.println(cList);
	}

	static List getTheSame(List a, List b){
		List same = new ArrayList();
		
		for(int i=0; i<a.size(); i++){
			Object o = a.get(i);
			if(b.contains(o) && !same.contains(o)){
				same.add(o);
			}
		}
		
		return same;
	}
	
}

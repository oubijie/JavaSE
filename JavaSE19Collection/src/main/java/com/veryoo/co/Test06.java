package com.veryoo.co;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * Collections演示
 * @author obj
 *
 */
public class Test06 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		for(int i=0; i<=9; i++){
			list.add("a"+i);
		}
		System.out.println(list);
		
		Collections.shuffle(list); //随机排序
		System.out.println(list);
		
		//传入的List必须有序
		System.out.println(Collections.binarySearch(list, "a8"));
		
		
		Collections.reverse(list); //反转
		System.out.println(list);
		
		
		Collections.sort(list);  //自然排序，CompareTo
		System.out.println(list);
		
		
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		
		//传入的List必须有序
		System.out.println(Collections.binarySearch(list, "a8"));  
		
		
//		Collections.addAll(list, "xxx", "a0", "a0", "a0", "a0", "a0", "a0");  //不定参数
//		System.out.println(list);
		
		List<String> list1 = new ArrayList<String>();
		list1.add("xxx");
		list1.add("a0");
		
		Collections.copy(list, list1);   //list增加，list1不变，重复元素不复制
		System.out.println(list);
		System.out.println(list1);
		
	}
	
	
	
}

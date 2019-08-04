package com.veryoo.co;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 练习三
 * 一个存储字符串的List，遍历其中的元素，如果所存储的字符串是以“a”开头的，则将其删除，打印遍历完成后的List
 * 引出Iterator安全删除
 * @author obj
 *
 */
public class Test055 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("abcde");
		list.add("abcde");
		list.add("abcde");
		list.add("abcde");
		list.add("abcde");
		
		
		//有bug 连续出现的a没有被删除
//		for(int i=0; i<list.size(); i++){
//			String s = (String)list.get(i);
//			if(s.equals("abcde")){
//				list.remove(i);
//			}
//		}
		
		//解决办法一 删除后指针回退1
//		for(int i=0; i<list.size(); i++){
//			String s = (String)list.get(i);
//			if(s.equals("abcde")){
//				list.remove(i);
//				i--;
//			}
//		}
		
		//解决办法二 从后往前循环
		
		
		//解决办法三 用Iterator
		Iterator it = list.iterator();
		while(it.hasNext()){
			String s = (String)it.next();
			if(s.equals("abcde")){
				it.remove();
			}
		}
		
		System.out.println(list);
	}
}

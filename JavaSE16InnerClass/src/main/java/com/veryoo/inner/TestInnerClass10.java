package com.veryoo.inner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 匿名内部类 实现Comparator比较器
 * @author obj
 *
 */
 
public class TestInnerClass10 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("c");
        list.add("b");
        System.out.println(list);
        
        Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {   //逆序
				return o2.compareTo(o1);
			}
        	
		});
        
        System.out.println(list);
    }
}
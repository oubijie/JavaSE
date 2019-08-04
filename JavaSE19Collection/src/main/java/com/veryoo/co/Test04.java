package com.veryoo.co;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

/**
 * LinkedList 特殊方法演示
 * @author obj
 *
 */
public class Test04 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		LinkedList list = new LinkedList();
		for(int i=0; i<1000000; i++){
			list.addFirst("第一个");
			list.removeFirst();
		}
		
//		ArrayList list = new ArrayList<>();
//		list.add("撒旦发牢骚淡粉色扥窘况解放路");
//		list.add("撒旦发牢骚淡粉色扥窘况解放路");
//		list.add("撒旦发牢骚淡粉色扥窘况解放路");
//		list.add("撒旦发牢骚淡粉色扥窘况解放路");
//		list.add("撒旦发牢骚淡粉色扥窘况解放路");
//		list.add("撒旦发牢骚淡粉色扥窘况解放路");
//		for(int i=0; i<1000000; i++){
//			list.add(0,"第一个");
//			list.remove(0);
//		}
		
//		System.out.println(list);
		
		long end = System.currentTimeMillis();
		System.out.println("总共运行毫秒：" + (end - start));
		
		//LinkedList 1,000,000 109毫秒
		//ArrayList 100,000 830毫秒
	}
}

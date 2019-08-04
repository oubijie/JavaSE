package com.veryoo.co;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * 数组与集合的相互转换
 * array <-> Collection
 * @author Administrator
 *
 */
public class Test15 {

	public static void main(String[] args) {
		String[] arr = {"a","b","c","c"};
		List<String> list = Arrays.asList(arr);  //只读
		
		System.out.println(list);
//		list.add("d");   //运行时报错 UnsupportedOperationException
		
		//生成全功能List
		list = new ArrayList<String>(list);
		list.add("d");
		System.out.println(list);
		
//		Set<String> set = new HashSet<String>(list);
//		System.out.println(set);
		
		
		//集合转数组1
		Object[] orr = list.toArray();
		for(int i=0; i<orr.length; i++){
			System.out.println((String)orr[i]);
		}
		
		//集合转数组2
		String[] srr = list.toArray(new String[list.size()]);
		System.out.println(Arrays.toString(srr));
		
	}
}

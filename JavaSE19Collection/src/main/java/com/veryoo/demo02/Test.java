package com.veryoo.demo02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * 用一个map存储学生的学习成绩，学生姓名作为key，成绩作为value
 * 打印出成绩前三的学生（自学map按value排序的方法）
 * @author obj
 *
 */
public class Test {

	public static void main(String[] args) {
		Map<Student, Integer> scoreMap = new HashMap<Student, Integer>();
		
		
		scoreMap.put(new Student(1, "刘备"), 90);
		scoreMap.put(new Student(5, "张飞"), 86);
		scoreMap.put(new Student(9, "关羽"), 50);
		scoreMap.put(new Student(3, "司马懿"), 66);
		scoreMap.put(new Student(1666, "夏侯惇"), 80);
		scoreMap.put(new Student(4, "小乔"), 100);
//		scoreMap.put(null, 1000);
		
		
		
		//按Value排序
		Set<Map.Entry<Student, Integer>> set = scoreMap.entrySet();
		List<Map.Entry<Student, Integer>> list = 
				new ArrayList<Map.Entry<Student, Integer>>(set);
		
		Collections.sort(list, new ScoreComparator());
		
		for(int i=0; i<(list.size()>3 ? 3:list.size() ); i++){
			System.out.println(list.get(i).getKey().getName() 
					+ "--" + list.get(i).getValue());
		}
		
		
		//按key排序. TreeMap
		
		
		
	}
}

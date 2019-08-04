package com.veryoo.demo03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


/**
 * 课后作业一
 * 写一个员工类Employee，有员工编号，姓名，年龄。
 * 用map存储公司的员工，员工作为key，薪水作为value
 * 输出所有员工的薪水 
 * 员工离职
 * 员工加薪
 * 按员工年龄从大到小输出
 * @author obj
 *
 */
public class Test {

	public static void main(String[] args) {
		Map<Employee, Double> map = new HashMap<Employee, Double>();
		map.put(new Employee(111,"aaa",30), 10000.0);
		map.put(new Employee(222,"bbb",20), 20000.0);
		map.put(new Employee(444,"ddd",34), 1300.0);
		map.put(new Employee(333,"ccc",32), 10200.0);
		
		
		for(Map.Entry<Employee, Double> entry: map.entrySet()){
			System.out.println(entry.getKey().getName() + "----" 
						+ entry.getValue());
		}
		
		
		System.out.println("离职后");
		map.remove(new Employee(444,"ddd",34));  //重写equals
		
		for(Map.Entry<Employee, Double> entry: map.entrySet()){
			System.out.println(entry.getKey().getName() + "----" 
						+ entry.getValue());
		}
		
		System.out.println("加薪后");
		Employee e = new Employee(111,"aaa",30);
		map.put(e, map.get(e) + 1);
		
		for(Map.Entry<Employee, Double> entry: map.entrySet()){
			System.out.println(entry.getKey().getName() + "----" 
						+ entry.getValue());
		}
		
		
		System.out.println("排序后");
		/*Map<Employee, Double> agemapMap = new TreeMap<Employee, Double>(map);
		for(Map.Entry<Employee, Double> entry: agemapMap.entrySet()){
			System.out.println(entry.getKey().getName() + "----" 
						+ entry.getKey().getAge() + "----" 
						+ entry.getValue());
		}*/
		
		
		//用Comparator
		//Map -> List<Entry>
		//
		
		
		List<Employee> list = new ArrayList<Employee>(map.keySet());
		Collections.sort(list);
		for(Employee e1: list){
			System.out.println(e1.getName() + "-----"
					+ e1.getAge() + "-----"
					+ map.get(e1));
		}
		
		
		Set<Employee> set = new TreeSet<Employee>(map.keySet());
		for(Employee e1: set){
			System.out.println(e1.getName() + "-----"
					+ e1.getAge() + "-----"
					+ map.get(e1));
		}
		
		
		
		
		
		
		
		
		
	}
}

package com.veryoo.co;

import java.util.ArrayList;
import java.util.List;


/**
 * 练习一
 * 把多个企鹅(属性:编号no,年龄age)的信息添加到集合中
 * 查看企鹅的数量
 * 遍历所有企鹅的信息
 * 删除集合中部分企鹅的元素（编号一样代表同一个）
 * 判断集合中是否包含指定企鹅 
 * @author obj
 *
 */
public class Test03 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Penguin(1, 1));
		list.add(new Penguin(1, 2));
		list.add(new Penguin(1, 3));
		list.add(new Penguin(1, 3));
		list.add(new Penguin(1, 4));
		list.add(new Penguin(1, 5));
		
		System.out.println("数量："+ list.size());
		
		for(int i=0; i<list.size(); i++){
			Penguin penguin = (Penguin)list.get(i);
			System.out.println(penguin.getNo());
		}
		
		
		list.remove(new Penguin(1, 3));
		
		
		List listToBeRemove = new ArrayList();
//		listToBeRemove.add(new Penguin(1, 1));
//		listToBeRemove.add(new Penguin(1, 2));
		listToBeRemove.add(new Penguin(1, 3));
		
		list.removeAll(listToBeRemove);
		
		
		if(list.contains(new Penguin(1, 4))){
			System.out.println("包含");
		}
		
		//遍历
		for(int i=0; i<list.size(); i++){
			Penguin penguin = (Penguin)list.get(i);
			System.out.println(penguin.getNo());
		}
		
		//jdk 1.5 泛型
		
	}
}

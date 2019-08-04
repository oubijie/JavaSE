package com.veryoo.co;

import java.util.ArrayList;
import java.util.List;


/**
 * 泛型演示
 * @author obj
 *
 */
public class Test051 {

	public static void main(String[] args) {
//		List list = new ArrayList();
		List<Penguin> list = new ArrayList<Penguin>();
		list.add(new Penguin(1, 1));
		list.add(new Penguin(1, 2));
		list.add(new Penguin(1, 3));
		list.add(new Penguin(1, 3));
		list.add(new Penguin(1, 4));
		list.add(new Penguin(1, 5));
//		list.add("String abc");     //报错
		
		System.out.println("数量："+ list.size());
		
		
		//全部版本jdk可以运行
//		for(int i=0; i<list.size(); i++){
//			Penguin penguin = (Penguin)list.get(i);
//			System.out.println(penguin.getNo());
//		}
		
		//jdk 1.5以上
//		for(int i=0; i<list.size(); i++){
//			Penguin penguin = list.get(i);
//			System.out.println(penguin.getNo());
//		}
		
		//jdk 1.5以上  增强的For循环
		for(Penguin p : list){
			System.out.println(p.getNo());
		}
		
//		list.remove(new Penguin(1, 3));
		
		
		List listToBeRemove = new ArrayList();
//		listToBeRemove.add(new Penguin(1, 1));
//		listToBeRemove.add(new Penguin(1, 2));
		listToBeRemove.add(new Penguin(1, 3));
		
		list.removeAll(listToBeRemove);
		
		
		if(list.contains(new Penguin(1, 4))){
			System.out.println("包含");
		}
		
		
		
	}
}

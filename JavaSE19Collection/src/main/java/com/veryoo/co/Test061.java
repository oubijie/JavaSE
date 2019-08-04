package com.veryoo.co;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Comparable��Comparator
 * @author obj
 *
 */
public class Test061 {

	public static void main(String[] args) {
		List<Penguin> list = new ArrayList<Penguin>();
		list.add(new Penguin(7, 1));
		list.add(new Penguin(4, 4));
		list.add(new Penguin(1, 3));
		list.add(new Penguin(6, 3));
		list.add(new Penguin(3, 2));
		list.add(new Penguin(5, 5));
		
		Collections.sort(list);   //Ĭ��������Comparable
		for(Penguin p : list){
			System.out.println(p.getAge() + " " + p.getNo() );
		}
		System.out.println("���ֵ��" + Collections.max(list));
		
		
		System.out.println("============");
		
		
		Collections.sort(list, new Penguin.CompareByNo());  //ָ������ʽ
		for(Penguin p : list){
			System.out.println(p.getAge() + " " + p.getNo() );
		}
		System.out.println("���ֵ��" + Collections.max(list, new Penguin.CompareByNo()));
	}
}

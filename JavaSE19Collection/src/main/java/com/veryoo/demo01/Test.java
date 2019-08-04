package com.veryoo.demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;


/**
 * ��ϰ��
 * дһ����Ʒ��Goods����������Ʒ��ţ���Ʒ���ƣ���Ʒ�۸���ϼ�ʱ�䡣
 * Ҫ��Ĭ�ϰ��������ͬʱʵ�ְ����ơ��۸񣨴Ӵ�С�����ϼ�ʱ������ķ���
 * @author obj
 *
 */
public class Test {

	public static void main(String[] args) {
		Goods g1 = new Goods(10010, "e����", 3.9, "20171107");
		Goods g2 = new Goods(10020, "a����", 3000.0, convertDate("20170109"));
		Goods g3 = new Goods(60038, "d�յ�", 2000, "20170518");
		Goods g4 = new Goods(70015, "f���", 100, "20171007");
		Goods g5 = new Goods(20036, "b����", 60, "20151107");
		Goods g6 = new Goods(80000, "c�ɻ�", 100000000, "20171108");
		
		List<Goods> list = new ArrayList<Goods>();
		list.add(g1);
		list.add(g2);
		list.add(g3);
		list.add(g4);
		list.add(g5);
		list.add(g6);
		
		
		for(Goods g : list){
			System.out.println(g);
		}
		
		
		System.out.println("��ID�����");
		Collections.sort(list);
		for(Goods g : list){
			System.out.println(g);
		}
		
		System.out.println("��Name�����");
		Collections.sort(list, new GoodsSortByName());
		for(Goods g : list){
			System.out.println(g);
		}
		
		System.out.println("���۸��������"); 
		Collections.sort(list, new GoodsSortByPriceDesc());
		for(Goods g : list){
			System.out.println(g);
		}
		
		
		System.out.println("��Date�����");
		Collections.sort(list, new Goods.SortByDate());
		for(Goods g : list){
			System.out.println(g);
		}
		
		
		
	}
	
	
	public static Date convertDate(String date){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		try {
			return sdf.parse(date);
		} catch (ParseException e) {
			return new Date();
		}
	}
}

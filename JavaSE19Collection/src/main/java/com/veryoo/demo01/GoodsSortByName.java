package com.veryoo.demo01;

import java.util.Comparator;

public class GoodsSortByName implements Comparator<Goods> {

	@Override
	public int compare(Goods o1, Goods o2) {
		//o1 o2 �Ƿ�Ϊ��
		return o1.getName().compareTo(o2.getName());
	}

}

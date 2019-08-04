package com.veryoo.demo01;

import java.util.Comparator;

public class GoodsSortByPriceDesc implements Comparator<Goods> {

	@Override
	public int compare(Goods o1, Goods o2) {
//		return 0 - (new Double(o1.getPrice()).compareTo(new Double(o2.getPrice())));
		if(o1.getPrice() == o2.getPrice()){
			return 0;
		}else if (o1.getPrice() > o2.getPrice()) {
			return -1;
		}
		return 1;
	}

}

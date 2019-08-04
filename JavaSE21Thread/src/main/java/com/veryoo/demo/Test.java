package com.veryoo.demo;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		List<Integer> list = new ArrayList<Integer>();
		MainCalc mc = new MainCalc(list);
		
		List<Calc> threads = new ArrayList<Calc>();
		threads.add(new Calc(mc, 1, 999, "p1"));
		threads.add(new Calc(mc, 1000, 9999, "p2"));
		threads.add(new Calc(mc, 10000, 99999, "p3"));
		
		for(Calc c : threads){
			c.start();
		}
		
		mc.sum(threads);
	}
}

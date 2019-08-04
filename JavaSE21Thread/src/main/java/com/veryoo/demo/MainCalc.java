package com.veryoo.demo;

import java.util.ArrayList;
import java.util.List;

public class MainCalc {
	
	private List<Integer> result;

	public synchronized void sum(List<Calc> threads) throws InterruptedException{
		while(true){
			if(result.size() != threads.size()){
				System.out.println("计算还没完成");
				wait();
			}else{
				int resultSum = 0;
				for(int num : result){
					resultSum += num;
				}
				System.out.println("计算完成，结果是：" + resultSum);
				break;
			}
		}
	}
	
	public synchronized void addResult(int sum){
		result.add(sum);
		System.out.println(result);
		notify();
	}

	public MainCalc(List<Integer> result) {
		super();
		this.result = result;
	}
	
	
}

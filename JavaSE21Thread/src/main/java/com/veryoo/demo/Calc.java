package com.veryoo.demo;

public class Calc extends Thread {
	
	private MainCalc mc;
	
	private int start;
	private int end;
	private String name;
	
	@Override
	public void run() {
		int sum = 0;
		for(int i=start; i<=end; i++){
			sum += i;
		}
		
		try {
			if(name.equals("p3")){
				Thread.sleep(5000);
			}else if(name.equals("p2")){
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		mc.addResult(sum);
	}
	
	

	public Calc(MainCalc mc, int start, int end, String name) {
		super();
		this.mc = mc;
		this.start = start;
		this.end = end;
		this.name = name;
	}

}

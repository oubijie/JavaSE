package com.veryoo.thread;

public class Test01 extends Thread {
	
	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			System.out.println("子线程:" + i);
		}
	}

	
	
	
	
	public static void main(String[] args) {
		Test01 tt = new Test01();
		tt.start(); // 注意，不要直接调用run方法
		
//		tt.run();  
		
		
		
		for (int i = 1; i <= 1000; i++) {
			System.out.println("主线程:" + i);
		}
	}

}

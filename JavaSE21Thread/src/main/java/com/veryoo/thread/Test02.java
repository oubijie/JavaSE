package com.veryoo.thread;

public class Test02 implements Runnable{

	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			System.out.println(Thread.currentThread().getName()+":" + i);
		}
	}
	
	public static void main(String[] args) {
		Test02 tt = new Test02();
		
		Thread thread = new Thread(tt, "小豆子线程");
		
		thread.start();
		
		for (int i = 1; i <= 1000; i++) {
			System.out.println("主线程:" + i);
		}
		
	}

}

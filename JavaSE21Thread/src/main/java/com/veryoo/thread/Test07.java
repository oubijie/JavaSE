package com.veryoo.thread;

public class Test07 implements Runnable {

	private static Integer amount = 30000;

	private String name;

	public Test07(String name) {
		super();
		this.name = name;
	}

	public static void main(String[] args) {
		Test07 laowang = new Test07("老王");
		Test07 wife = new Test07("你老婆");
		
		Thread t1 = new Thread(laowang);
		Thread t2 = new Thread(wife);
		
		t1.start();
		t2.start();
		
	}

	@Override
	public void run() {
		synchronized (Test07.amount) {
//		synchronized (this) {
			if (Test07.amount >= 20000) {
				System.out.println(name + "正在取钱，金额足够");
				
				try{
					Thread.sleep(10000);
				}catch (Exception e) {
				}
				
				Test07.amount -= 20000;
				System.out.println(name + "取钱成功，余额为" + Test07.amount);
			} else {
				System.out.println(name + "正在取钱，金额不足");
			}
		}
	}
	
	public synchronized void quqian(){
		if (amount >= 20000) {
			System.out.println(Thread.currentThread().getName()
					+ "正在取钱，金额足够");
			
			try{
				Thread.sleep(10000);
			}catch (Exception e) {
			}
			
			amount -= 20000;
			System.out.println(Thread.currentThread().getName()
					+ "取钱成功，余额为" + amount);
		} else {
			System.out.println(Thread.currentThread().getName()
					+ "正在取钱，金额不足");
		}
	}
	
	
	
}

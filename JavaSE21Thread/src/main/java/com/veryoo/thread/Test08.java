package com.veryoo.thread;


/**
 * 线程同步问题，synchronized
 * @author obj
 *
 */
public class Test08 implements Runnable{

	private int amount = 30000;

	public static void main(String[] args) {
		Test08 test = new Test08();
		
		Thread t1 = new Thread(test, "老王");
		Thread t2 = new Thread(test, "你老婆");
		
		t1.start();
		t2.start();
		
	}

	@Override
	public void run() {
		//方式一，用synchronized代码块
		synchronized (this){
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
		
//		quqian();
	}
	
	
	//方式二，直接用synchronized在方法上声明
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

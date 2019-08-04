package com.veryoo.thread;


/**
 * 同步问题演示
 * @author obj
 *
 */
public class TestSync implements Runnable {
	private Counter counter = new Counter();
	public static void main(String[] args) {
		TestSync testSync = new TestSync();
		Thread t1 = new Thread(testSync, "t1");
		Thread t2 = new Thread(testSync, "t2");
		t1.start();
		t2.start();
		
	}

	@Override
	public void run() {
		counter.add(Thread.currentThread().getName());
	}
}


class Counter{
	private static int count = 0;
	public void add(String name){
		
		synchronized (this) {
			count++;
			
			try{
				Thread.sleep(1000);
			}catch (Exception e) {
				// TODO: handle exception
			}
			
			System.out.println("线程"+ name + "，计数器：" + count);
		}
		
		
	}
}
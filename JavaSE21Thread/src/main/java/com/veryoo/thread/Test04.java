package com.veryoo.thread;


/**
 * 接口方式共享资源
 * @author obj
 *
 */
public class Test04 implements Runnable{

	private int count = 0;
	
	@Override
	public void run() {
		while (count < 10) {
			System.out.println(Thread.currentThread().getName() + ":"
					+ (count++));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Test04 test = new Test04();
//		Test04 test1 = new Test04();
		Thread tt1 = new Thread(test);
//		Thread tt2 = new Thread(test);
		
		tt1.start();
//		tt2.start();
		
	}

}

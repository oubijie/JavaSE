package com.veryoo.thread;


/**
 * 1. 继承Thread的方式，不能共享资源
 * 2. Java单继承限制，如果继承了别的类，则不能再继承Thread
 * @author obj
 *
 */
public class Test03 extends Thread {

	private int count = 0;

	@Override
	public void run() {
		while (count < 1000) {
			System.out.println(Thread.currentThread().getName() + ":"
					+ (count++));
		}
	}

	public static void main(String[] args) {
		Test03 t1 = new Test03();
		Test03 t2 = new Test03();
		
		t1.start();
		t2.start();
	}

}













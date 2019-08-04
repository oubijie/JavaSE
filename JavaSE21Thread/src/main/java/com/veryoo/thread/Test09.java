package com.veryoo.thread;


/**
 * 死锁演示
 * @author obj
 *
 */
public class Test09 implements Runnable{

	private Integer amount = 30000;
	private Integer amount2 = 10000;

	public static void main(String[] args) {
		Test09 test = new Test09();
		
		Thread t1 = new Thread(test, "老王");
		Thread t2 = new Thread(test, "你老婆");
		
		t1.start();
		t2.start();
		
	}

	@Override
	public void run() {
		
		if(Thread.currentThread().getName().equals("老王")){
			synchronized (this.amount){
				System.out.println(Thread.currentThread().getName()+"锁住amount");
				try{
					Thread.sleep(1000);
				}catch (Exception e) {
				}
				synchronized (this.amount2){
					System.out.println(Thread.currentThread().getName()+"锁住amount2");
				}
			}
			
			//解决办法，增大锁的范围，一次性把需要的资源全部锁住
//			synchronized (this){
//				System.out.println(Thread.currentThread().getName()+"锁住amount");
//				System.out.println(Thread.currentThread().getName()+"锁住amount2");
//			}
		}
		
		if(Thread.currentThread().getName().equals("你老婆")){
			synchronized (this.amount2){
				System.out.println(Thread.currentThread().getName()+"锁住amount2");
				try{
					Thread.sleep(1000);
				}catch (Exception e) {
				}
				synchronized (this.amount){
					System.out.println(Thread.currentThread().getName()+"锁住amount");
				}
			}
		}
		
	}
	
	
	
}

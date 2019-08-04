package com.veryoo.thread;

public class Test10 {

	public static void main(String[] args) {
		new Window("窗口1").start();
		new Window("窗口2").start();
		new Window("窗口3").start();
		new Window("窗口4").start();
		new Window("窗口5").start();
	}
}



class Window extends Thread{
	private static Integer total = 100;
	
	private int saleCount;
	
	public Window(String name) {
		super(name);
	}



	@Override
	public void run() {
		while(true){
			synchronized(Window.class){
				if(total > 0){
					System.out.println(Thread.currentThread().getName() + "正在出售第"+(101-total)+"张票");
					total--;
					saleCount++;
				}else{
					System.out.println(Thread.currentThread().getName() + "一共卖了"+saleCount+"张票");
					break;
				}
			}
		}
	}
}
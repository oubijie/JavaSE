package com.veryoo.thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test05 implements Runnable{

	@Override
	public void run() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		while(true){
			System.out.println(sdf.format(new Date()));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		Thread thread = new Thread(new Test05());
		thread.start();
		
//		for(int i=0; i<10; i++){
//			System.out.println(i);
//		}
	}

	
}

package com.veryoo.thread;

public class Cooker implements Runnable{

	private String name;
	
	
	public Cooker(String name) {
		super();
		this.name = name;
	}
	
	public Cooker() {
	}


	@Override
	public void run() {
		for(int i=1; i<=1000; i++){
			System.out.println(this.name 
					+ "大厨正在做第" + i +"道菜");

			if( i%10 == 0){
				Thread.yield();
			}
			
			
//			try{
//				Thread.sleep(5000);
//			}catch (Exception e) {
//				e.printStackTrace();
//			}
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

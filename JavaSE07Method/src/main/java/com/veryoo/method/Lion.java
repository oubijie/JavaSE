package com.veryoo.method;

/**
 * 方法演示，狮子类
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Lion {
	
	public String color = "黄色";  //成员变量，属性
	public int power = 0;
	
	public void run(){
		
		if(power == 0){
			System.out.println("没电了，跑个球");
			return;
		}
		
		String speed = "每秒一百米";   //局部变量
		System.out.println(color +"的狮子正在跑");
		
		
	}
	
	public static void hou(){
		System.out.println("的狮子正在叫");
	}
	
	
	public void runAndHou(){
		run();
		hou();
	}
	
	
	public String getColor(){
		return color;
	}
	
	public int min(){
		//sdfsdjfs
		int min = 8;
		int i = 4;
//		return min, i;
		return min;
		
	}
	
}

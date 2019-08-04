package com.veryoo.timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


/**
 * 简单Timer示例
 * @author obj
 *
 */
public class Test01 {
	public static void main(String[] args) {
		// 定义一个定时器
		Timer timer = new Timer();
		// 延迟3秒钟后运行，只执行一次
//		timer.schedule(new MyTask(), 3000);
		
		// 按指定日期执行，只执行一次
//		Date d = new Date();
//		d.setSeconds(d.getSeconds()+3);
//		timer.schedule(new MyTask(), d);
		
		// 延迟3秒钟后运行，然后每隔1秒执行一次
//		timer.schedule(new MyTask(), 3000, 1000);
		
		// 按指定日期执行，然后每隔1秒执行一次
		Date d = new Date();
		d.setSeconds(d.getSeconds()+3);
		timer.schedule(new MyTask(), d, 1000);
	}
}

class MyTask extends TimerTask {
	@Override
	public void run() {
		System.out.println("下课了！");
	}
}

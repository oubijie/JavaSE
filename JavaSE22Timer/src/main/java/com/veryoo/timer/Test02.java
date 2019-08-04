package com.veryoo.timer;

import java.util.Timer;
import java.util.TimerTask;


/**
 * 简单Timer示例（内部类实现）
 * @author obj
 *
 */
public class Test02 {
	public static void main(String[] args) {
		// 定义一个定时器
		Timer timer = new Timer();
		// 3秒钟后运行
		timer.schedule(new TimerTask() {
			public void run() {
				System.out.println("下课了！");
			}
		}, 3000);
	}
}


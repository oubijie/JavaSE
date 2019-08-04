package com.veryoo.array;

import java.util.Scanner;


/**
 * 练习二
 * 声明一个int型数组，接收8个学生的学习成绩，用一个循环让用户输入
 * 计算学生的总分、平均分、最高分、最低分
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] stu = new int[8];
		
		//用户输入成绩
		int i=0;
		while(i<stu.length){
			stu[i] = s.nextInt();
			i++;
		}
		
		
		for(int j=0; j<stu.length; j++){
			System.out.println(stu[j]);
		}
		
		int sum = 0;
		int max = stu[0];
		int min = stu[0];
		for(int j=0; j<stu.length; j++){
			sum += stu[j];
			
			if(max < stu[j]){
				max = stu[j];
			}
			
			if(min > stu[j]){
				min = stu[j];
			}
			
			
		}
		System.out.println("总分:" + sum);
		System.out.println("平均分:" + sum/stu.length);
		System.out.println("最高分：" + max);
		System.out.println("最低分：" + min);
	}
}

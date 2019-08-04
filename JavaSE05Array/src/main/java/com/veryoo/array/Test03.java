package com.veryoo.array;

/**
 * 数组的使用演示，求和及最大值
 * @author obj
 * @email oubijie@139.com
 * @vserion 2017年12月8日
 *
 */
public class Test03 {

	public static void main(String[] args) {
		int[] stu = {89, 33, 90, 45, 77, 83, 87, 99, 60, 78};
		
		int sum = 0;
		for(int i=0; i<stu.length; i++){
			sum += stu[i];
		}
		
		System.out.println(sum / stu.length);
		
		//找出最高的成绩
		int max = 0;
		for(int i=0; i<=stu.length-1; i++){
			if(max < stu[i]){
				max = stu[i];
			}
		}
	}
}

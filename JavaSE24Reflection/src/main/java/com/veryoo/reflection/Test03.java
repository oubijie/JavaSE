package com.veryoo.reflection;


/**
 * 九大内置Class实例
 * @author obj
 *
 */
public class Test03 {

	public static void main(String[] args) {
		Class c = int.class;
		Class b = byte.class;
		Class v = void.class;
		
		
		System.out.println(Integer.class == int.class);  
		System.out.println(Integer.TYPE == int.class);
		
		
		//数组的实例
		int[] arr = {1,2,3};
		arr.toString();
		
		arr.getClass();
		Class<int[]> ac = int[].class;
		
	}
}

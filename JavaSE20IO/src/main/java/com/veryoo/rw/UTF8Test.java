package com.veryoo.rw;

import java.util.Arrays;

public class UTF8Test {

	public static void main(String[] args) {
		byte[] data = "a欧必杰".getBytes();   //[97, -26, -84, -89, -27, -65, -123, -26, -99, -80]
		System.out.println(Arrays.toString(data));
	}
}

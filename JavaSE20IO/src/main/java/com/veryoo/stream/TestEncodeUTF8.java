package com.veryoo.stream;

import java.util.Arrays;

public class TestEncodeUTF8 {

	public static void main(String[] args) {
		byte[] b = "a中文".getBytes();
		System.out.println(Arrays.toString(b));
	}
}


//[97, -28, -72, -83, -26, -106, -121] utf-8
//[97, -42, -48, -50, -60] gbk
//a   (-42, -48, -50)  -60?

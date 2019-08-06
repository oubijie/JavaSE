package com.veryoo.stream;

import java.util.Arrays;

public class TestEncode {

	public static void main(String[] args) {
		byte[] b = "a中文".getBytes();
		System.out.println(Arrays.toString(b));
	}
}

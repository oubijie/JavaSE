package com.entor.rw;

import java.util.Arrays;

public class UnicodeTest {

	public static void main(String[] args) {
		byte[] data = "欧必杰".getBytes();   //[-2, -1, 0, 97, 107, 39, 95, -59, 103, 112]
		System.out.println(Arrays.toString(data));
	}
}

package com.entor.rw;

import java.util.Arrays;

public class GBKTest {

	public static void main(String[] args) {
		byte[] data = "a≈∑±ÿΩ‹".getBytes();   //[97, -59, -73, -79, -40, -67, -36]
		System.out.println(Arrays.toString(data));
	}
}

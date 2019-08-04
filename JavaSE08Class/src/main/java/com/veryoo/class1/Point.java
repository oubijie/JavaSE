package com.veryoo.class1;

public class Point {

	int x;
	int y;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public Point(int x){
//		this.x = x;
//		this.y = x;
		this(x, x);
	}
	
}

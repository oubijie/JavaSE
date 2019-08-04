package com.veryoo.class1;

public class Circle {

	Point p;   //有一个。  组合关系、聚合关系
	int r;
	
	public Circle(Point p, int r){
		this.p = p;
		this.r = r;
	}
	
	public Circle(int x, int y, int r){
		Point point = new Point(x, y);
		this.p = point;
		this.r = r;
	}
	
	public Circle(int x, int r){
		Point point = new Point(x);
		this.p = point;
		this.r = r;
	}
	
	
	public Circle(int r){  //默认圆心在原点 （0，0）
		Point point = new Point(0, 0);
		this.p = point;
		this.r = r;
	}
	
	
	public double getArea(){
		return 3.14159 * r * r;
	}
	
	
	
	
	
	
}

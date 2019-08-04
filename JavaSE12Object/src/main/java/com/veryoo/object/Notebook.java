package com.veryoo.object;

public class Notebook {

	public String color;
	public int cpu;
	
	public Notebook(String color, int cpu){
		this.color = color;
		this.cpu = cpu;
	}
	
	public static void main(String[] args) {
		Notebook n1 = new Notebook("black", 4);
		Notebook n2 = new Notebook("black", 5);
		
		System.out.println(n1 == n2);
		System.out.println(n1.equals(n2));
	}
	
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}
		
		if(obj instanceof Notebook){
			Notebook b = (Notebook)obj;
			if(this.color.equals(b.color) && this.cpu == b.cpu){
				return true;
			}
		}
		
		return false;
	}
}

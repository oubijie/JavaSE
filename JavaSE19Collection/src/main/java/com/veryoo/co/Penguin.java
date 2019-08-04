package com.veryoo.co;

import java.util.Comparator;

public class Penguin implements Comparable<Penguin>{

	private int age;
	private int no;
	
	
	
	public Penguin(int age, int no) {
		super();
		this.age = age;
		this.no = no;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	@Override
	public int hashCode() {
		System.out.println("Penguin HashCode");
		return no;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Penguin other = (Penguin) obj;
		if (no != other.no)
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Penguin o) {
		if(o == null){
			return 1;
		}
		if(this.getAge() > o.getAge()){
			return 1;
		}else if(this.getAge() == o.getAge()){
			return 0;
		}else{
			return -1;
		}
		
	}
	@Override
	public String toString() {
		return "Penguin [age=" + age + ", no=" + no + "]";
	}
	
	
	static class CompareByNo implements Comparator<Penguin>{

		@Override
		public int compare(Penguin o1, Penguin o2) {
			if(o1.getNo() < o2.getNo()){
				return -1;
			}else if (o1.getNo() > o2.getNo()){
				return 1;
			}
			return 0;
		}
		
	}
	
}

package com.veryoo.co;

public class Student {

	private int num;
	
	private String name;
	
	public Student(int num, String name){
		this.num = num;
		this.name = name;
	}

	@Override
	public String toString() {
		return "(ѧ��" + name + ", ѧ��" + num + ")";
	}

	@Override
	public int hashCode() {
		return num;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (num != other.num)
			return false;
		return true;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public static void main(String[] args) {
		Student s1 = new Student(1, "kkk");
		Student s2 = new Student(3, "kkk");
		Student s3 = new Student(1, "bbb");
		System.out.println(s1);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}
	
	
	
	
	
	
	
	
	
	
}

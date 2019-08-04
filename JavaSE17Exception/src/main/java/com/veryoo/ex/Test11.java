package com.veryoo.ex;


/**
 * 课后作业
 * Person类有属性age,在setAge(int age) 中对年龄进行判断，如果年龄介于1到100直接赋值，否则抛出异常
 * 在测试类中创建对象并调用setAge(int age)方法，使用try-catch捕获并处理异常
 * @author obj
 *
 */
public class Test11 {

	public static void main(String[] args) {
		Person person = new Person();
		try {
			person.setAge(280);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}


class Person{
	private int age;
	
	public void setAge(int age) throws Exception{
		if(age >= 1 && age <= 100){
			this.age = age;
		}else{
			throw new Exception("年龄必须在1到100之间！");
		}
	}
}
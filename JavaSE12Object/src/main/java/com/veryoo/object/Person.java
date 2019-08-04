package com.veryoo.object;

public class Person {
	
	String name = "bc";

	public static void main(String[] args) {
		Integer i = 9;
		System.out.println(i);
		System.out.println(i.toString());
		
		Person p = new Person();
		System.out.println(p.toString());
	}
	
	public String toString(){
		return "Person: "+ name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}



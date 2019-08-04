package com.veryoo.demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class Goods implements Comparable<Goods> {

	private int id;
	private String name;
	private double price;
	private Date date;  //ctrl+shift+o
	
	
	public Goods(int id, String name, double price, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.date = date;
	}
	
	
	public Goods(int id, String name, double price, String date) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		try {
			this.date = sdf.parse(date);
		} catch (ParseException e) {
			this.date = new Date();
			e.printStackTrace();
		}
	}
	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		return "Goods [id=" + id + ", name=" + name + ", price=" + price
				+ ", date=" + sdf.format(date) + "]";
	}

	@Override
	public int compareTo(Goods o) {
		if(o == null){
			return 1;
		}
		
		return this.getId() - o.getId();
	}
	
	
	static class SortByDate implements Comparator<Goods>{

		@Override
		public int compare(Goods o1, Goods o2) {
			return o1.getDate().compareTo(o2.getDate());
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}

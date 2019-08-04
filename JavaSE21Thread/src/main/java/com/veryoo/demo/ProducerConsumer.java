package com.veryoo.demo;

/**
 * ������������������
 * @author obj
 *
 */
public class ProducerConsumer {

	public static void main(String[] args) {
		Desk desk = new Desk();
		Cooker cooker = new Cooker(desk);
		Consumer consumer = new Consumer(desk);
		
		new Thread(cooker).start();
		new Thread(consumer).start();
		
	}
	
}

class Cooker implements Runnable{
	Desk desk;

	public Cooker(Desk desk) {
		super();
		this.desk = desk;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=10; i++){
			Disk d = new Disk(i);
			desk.addDisk(d);
			System.out.println("���˵�" + d.getId() +"����");
		}
		
	}
}


class Consumer implements Runnable{
	Desk desk;

	public Consumer(Desk desk) {
		super();
		this.desk = desk;
	}

	@Override
	public void run() {
		for(int i=1; i<=10; i++){
			Disk d = desk.getOneDisk();
			System.out.println("���ڳԲ�" + i);
		}
		
	}
	
}


class Desk{
	int count = 0;
	Disk[] arr = new Disk[6];
	
	
	public synchronized void addDisk(Disk d){
//		arr[count] = d;
//		count++;
		
		if(count == arr.length){
			System.out.println("��ʦwait");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("��ʦ������");
		}
		this.notify();
		arr[count] = d;
		count++;
	}
	
	
	public synchronized Disk getOneDisk(){
//		count--;
//		return arr[count];
		
		if(count == 0){
			System.out.println("������wait");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("�����߱�����");
		}
		this.notify();
		count--;
		return arr[count];
	}
}

class Disk{
	int id;

	public Disk(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}

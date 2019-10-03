package com;

public class Deadlock {
	public static void main(String[] args) {
		Deadlock lock1 = new Deadlock();
		Deadlock lock2 = new Deadlock();
		Thread t1 = new Thread(new Thread1(lock1,lock2));
		t1.start();
		Thread t2 = new Thread(new Thread2(lock1,lock2));
		t2.start();
		
	}
	
	public synchronized void test1(Deadlock d) {
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			d.test1(this);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public synchronized void test2(Deadlock d) {
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			d.test2(this);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Thread1 implements Runnable
{
	private Deadlock d1;
	private Deadlock d2;
	
	public Thread1(Deadlock d1, Deadlock d2) {
		super();
		this.d1 = d1;
		this.d2 = d2;
	}

	@Override
	public void run() {
		d1.test1(d2);
	}
	
}

class Thread2 implements Runnable
{
	private Deadlock d1;
	private Deadlock d2;
	
	public Thread2(Deadlock d1, Deadlock d2) {
		super();
		this.d1 = d1;
		this.d2 = d2;
	}

	@Override
	public void run() {
		d2.test2(d1);
	}
	
}
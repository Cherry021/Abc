package threads;

public class DeadLock {

	public synchronized void lock1(DeadLock d) {
		try {
			System.out.println("lock1 "+Thread.currentThread().getName());
			Thread.sleep(1000);
			d.lock1(this);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public synchronized void lock2(DeadLock d) {
		try {
			System.out.println("lock2 "+Thread.currentThread().getName());
			Thread.sleep(1000);
			d.lock2(this);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("lock1 "+Thread.currentThread().getName());

		DeadLock d1 = new DeadLock();
		DeadLock d2 = new DeadLock();
		Thread t1=new Thread(new MyThread1(d1,d2));
		t1.start();
		Thread t2=new Thread(new MyThread2(d1,d2));
		t2.start();
	}
}

class MyThread1 implements Runnable{
	private DeadLock d1;
	private DeadLock d2;
	
	public MyThread1(DeadLock d1, DeadLock d2) {
		super();
		this.d1 = d1;
		this.d2 = d2;
	}

	@Override
	public void run() {
		d1.lock1(d2);
	}
	
}
class MyThread2 implements Runnable{
	private DeadLock d1;
	private DeadLock d2;
	
	public MyThread2(DeadLock d1, DeadLock d2) {
		super();
		this.d1 = d1;
		this.d2 = d2;
	}

	@Override
	public void run() {
		d2.lock2(d1);
	}
	
}
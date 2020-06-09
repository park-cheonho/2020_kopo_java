package kr.ac.kopo.day16;

class Data {
	
	public synchronized void a() {
		try {
			notify();
			System.out.println("a() 메소드 호출...");
			wait();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void b() {
		try {
			
			notify();
			System.out.println("b() 메소드 호출...");
			wait();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class NotifyThread01 extends Thread {
	
	private Data data;
	
	public NotifyThread01(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		
		for(int i = 0; i < 10; i++) {
			data.a();
		}
	}
}

class NotifyThread02 extends Thread {
	
	private Data data;
	
	public NotifyThread02(Data data) {
		this.data = data;
	}
	
	@Override
	public void run() {
		
		for(int i = 0; i < 10; i++) {
			data.b();
		}
	}
}

public class NotifyMain {

	public static void main(String[] args) {
		
		Data data = new Data();
		
		NotifyThread01 nt01 = new NotifyThread01(data);
		NotifyThread02 nt02 = new NotifyThread02(data);
		
		nt01.start();
		nt02.start();
	}
}











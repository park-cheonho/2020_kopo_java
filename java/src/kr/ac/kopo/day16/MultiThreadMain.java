package kr.ac.kopo.day16;

class Calculator {
	
	private int count = 0;

	/*
	public synchronized void sum() {
		
		for(int i = 0; i < 10000; i++) {
			count++;
		}
	}
	*/
	/*
	public void sum() {
		
		synchronized(this) {
			for (int i = 0; i < 10000; i++) {
				count++;
			}
		}
	}
	*/
	public void sum() {
		
			for (int i = 0; i < 10000; i++) {
				synchronized(this) {
					count++;
				}
			}
	}
	
	public int getCount() {
		return count;
	}
}

class MultiThread extends Thread {
	
	private Calculator cal;
	
	public MultiThread(Calculator cal) {
		this.cal = cal;
	}

	@Override
	public void run() {
		cal.sum();
	}
	
	
	
}

public class MultiThreadMain {

	public static void main(String[] args) {
	
		Calculator cal = new Calculator();
		
		MultiThread mt = new MultiThread(cal);
		MultiThread mt2 = new MultiThread(cal);
		
		mt.start();
		mt2.start();
		
		try {
			mt.join();
			mt2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(cal.getCount());
	}
}










package kr.ac.kopo.day16;

class PriorityThread extends Thread {

	public PriorityThread() {
		super();
	}

	public PriorityThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println(getName() + " 우선순위 : " + getPriority());
		
		for(int i = 1; i <= 100; i++) {
			System.out.println(getName() + " : " + i + "번째 작업중...");
		}
	}
	
}

public class PriorityMain {

	public static void main(String[] args) {

		PriorityThread pt = new PriorityThread("우선순위 1인 스레드");
		PriorityThread pt2 = new PriorityThread("우선순위 10인 스레드");
		PriorityThread pt3 = new PriorityThread("우선순위 5인 스레드");
		
		pt.setPriority(Thread.MIN_PRIORITY);
		pt2.setPriority(Thread.MAX_PRIORITY);
		pt3.setPriority(Thread.NORM_PRIORITY);
		
		pt.start();
		pt2.start();
		pt3.start();
	}
}
















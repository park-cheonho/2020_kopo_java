package kr.ac.kopo.day16;

/*
 * Thread 생성하는 2가지 방식
 * 1. Thread 클래스 상속
 * 2. Runnable 인터페이스 상속
 */

class ExtendThread extends Thread {

	@Override
	public void run() {
		
		for(int i = 1; i <= 100; i++) {
			System.out.println(i + "번째 인형 눈 붙이기...");
		}
	}
}

class ImplementThread implements Runnable {

	@Override
	public void run() {

		for(int i = 1; i <= 100; i++) {
			System.out.println(i + "번째 인형 입 만들기...");
		}
	}
	
}


public class ThreadMain02 {

	public static void main(String[] args) {
//		System.out.println("현재 실행중인 스레드 개수 : " + Thread.activeCount());
		ExtendThread et = new ExtendThread();
		ImplementThread it = new ImplementThread();
		Thread t = new Thread(it);
		
		et.start();
		t.start();
		
		try {
			et.join();
			t.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("인형만들기 감독 종료...");
		
//		for(int i = 1; i <= 100; i++) {
//			System.out.println(i + "번째 감독중...");
//		}
		
		
	}
}







package kr.ac.kopo.day16;

import java.util.Date;

class SleepThread extends Thread {

	@Override
	public void run() {
		
		while (true) {
			try {
				Thread.sleep(1000);
				System.out.println("현재시간 : " + new Date().toLocaleString());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class SleepMain {

	public static void main(String[] args) {
		
		SleepThread st = new SleepThread();
		st.start();
		
		while (true) {
			try {
				Thread.sleep(100);
				System.out.println("go!!!!");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		/*
		System.out.println("메인스레드를 2초동안 잠들게 하겠습니다");
		
		try {
			Thread.sleep(2000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("메인스레드가 2초후에 깨어났습니다");
		*/
	}
}

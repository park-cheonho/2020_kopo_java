package kr.ac.kopo.day16;

class AAA extends Thread {

	@Override
	public void run() {
		while(true) {
			System.out.println("go!!!!!");
		}
	}
}

class BBB extends Thread {

	@Override
	public void run() {
		while(true) {
			System.out.println("\t\t\tstop!!!!!");
		}
	}
	
}

public class ThreadMain01 {

	public static void main(String[] args) {
		
		AAA aaa = new AAA();
		BBB bbb = new BBB();
		
		aaa.start();
		bbb.start();
		
	}
}











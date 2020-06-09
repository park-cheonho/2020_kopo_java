package kr.ac.kopo.day16;

class Sync {
	
	public void a() {
		
		synchronized(this) {
			for (int i = 0; i < 20; i++) {
				System.out.print('a');
			}
		}
	}
	
	public synchronized void b() {
		for(int i = 0; i < 20; i++) {
			System.out.print('b');
		}
	}
	
	public synchronized void c() {
		for(int i = 0; i < 20; i++) {
			System.out.print('c');
		}
	}
}

class SyncThread extends Thread {
	
	private Sync sync;
	private int type;
	
	public SyncThread(Sync sync, int type) {
		super();
		this.sync = sync;
		this.type = type;
	}

	@Override
	public void run() {
		
		switch(type) {
		case 1 : 
			sync.a();
			break;
		case 2 : 
			sync.b();
			break;
		case 3 : 
			sync.c();
			break;
		}
	}
	
	
}

public class SyncMain {

	public static void main(String[] args) {
		
		Sync sync = new Sync();
		
		SyncThread st = new SyncThread(sync, 1);
		SyncThread st2 = new SyncThread(sync, 2);
		SyncThread st3 = new SyncThread(sync, 3);
		
		st.start();
		st2.start();
		st3.start();
	}
}

















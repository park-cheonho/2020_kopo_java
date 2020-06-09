package kr.ac.kopo.day17;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class AppClientMain {

	public static void main(String[] args) {
		
		try {
			System.out.println("서버와의 접속을 시도합니다");
			Socket socket = new Socket("172.16.88.129", 10000);
			
//			System.out.println("socket port : " + socket.getLocalPort());
			
			InputStream is = socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			
			String msg = dis.readUTF();
			
			System.out.println("서버에서 전송된 메세지 : " + msg);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

package kr.ac.kopo.day17;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class AppServerMain {

	public static void main(String[] args) {
		
		try {
			ServerSocket server = new ServerSocket(10000);
			System.out.println("애플리케이션 서버 구동...");
			
			Socket client = server.accept();
			System.out.println("접속된 클라이언트 정보 : " + client);
//			System.out.println("로컬 socket port : " + client.getLocalPort());
//			System.out.println("클라이언트 socket port : " + client.getPort());
//			System.out.println("클라이언트 socket ip : " 
//								+ client.getInetAddress().getHostAddress());
			
			String msg = "접속을 환영합니다";
			
			OutputStream os = client.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			dos.writeUTF(msg);
			dos.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}






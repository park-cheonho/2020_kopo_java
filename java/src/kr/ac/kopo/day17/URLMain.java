package kr.ac.kopo.day17;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URLMain {

	public static void main(String[] args) {
		
		try {
			URL urlObj = new URL("http://shopping.tk.ac.kr");
//			URL urlObj = new URL("https://www.naver.com");
//			URL urlObj = new URL("https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=subway");
			
			System.out.println("프로토콜 : " + urlObj.getProtocol());
			System.out.println("호스트이름 : " + urlObj.getHost());
			System.out.println("포트 : " + urlObj.getPort());
			System.out.println("경로 : " + urlObj.getPath());
			System.out.println("쿼리 : " + urlObj.getQuery());
			
			System.out.println("-------------------------------------------");
			
			InputStream is = urlObj.openStream();
			InputStreamReader isr = new InputStreamReader(is, "euc-kr");
			// Naver인경우
//			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			
			while(true) {
				int c = isr.read();
				if(c == -1) break;
				System.out.print((char)c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}










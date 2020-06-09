package kr.ac.kopo.day17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

import kr.ac.kopo.util.FileClose;

class AAA implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("AAA클래스 객체의 close() 호출...");
	}
	
}

public class URLConnectionMain {

	public static void main(String[] args) {
		
//		FileOutputStream fos = null;
//		OutputStreamWriter osw = null;
//		BufferedWriter bw = null;
		
		try (
				FileOutputStream fos = new FileOutputStream("iotest/naver.html");
				OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
				BufferedWriter bw = new BufferedWriter(osw);
				AAA a = new AAA();
		) {
			
//			fos = new FileOutputStream("iotest/naver.html");
//			osw = new OutputStreamWriter(fos, "utf-8");
//			bw = new BufferedWriter(osw);
			
			URL urlObj = new URL("https://www.naver.com");
//			URL urlObj = new URL("http://172.16.88.129/Lecture/java-workspace/java/src/kr/ac/kopo/day17/InetAddressMain.java");
			URLConnection uc = urlObj.openConnection();
			
//			System.out.println(uc.getContentType());
//			System.out.println(uc.getContentLength());
			
			// URL객체의 전송정보를 iotest/naver.html 저장
			InputStream is = uc.getInputStream();	
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);
			
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				bw.write(data);
				bw.newLine();
			}
			bw.flush();
			
			System.out.println("naver.html 저장하였습니다");
			
			FileClose.close(br);
			FileClose.close(isr);
			FileClose.close(is);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
//			FileClose.close(bw);
//			FileClose.close(osw);
//			FileClose.close(fos);
		}
		
	}
}









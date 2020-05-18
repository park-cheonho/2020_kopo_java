package kr.ac.kopo.day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 	Wrapper Class(기본자료형 8가지 -> 참조자료형)    java.lang
 	
 		boolean				Boolean
 		byte				Byte
 		char				Character
 		short				Short
 		int					Integer
 		long				Long
 		float				Float
 		double				Double
 */
/*
 	class Integer {
 		private int value;
 	}
 */

public class WrapperMain {

	public static void main(String[] args) {
		
//		List<Integer> list = new ArrayList<>();
//		list.add(100);
//		list.add(200);
		
//		System.out.println(Arrays.toString(list.toArray()));
		
		int i = 10;
		Integer i2 = new Integer(100);
		Integer i3 = 123;				// auto boxing		jdk1.5이상
		int i4 = new Integer(200);		// auto unboxing
		
		System.out.println("i2 : " + i2);
		
		String str = "19455";
		System.out.println(str + " + " + 100 + " = " + (str + 100));
		
		int num = Integer.parseInt(str);
		System.out.println(num + " + " + 100 + " = " + (num + 100));
		
		int num2 = Integer.valueOf(str);
		System.out.println(num2 + " + " + 100 + " = " + (num2 + 100));
	}
}













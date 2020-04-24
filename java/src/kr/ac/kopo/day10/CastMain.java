package kr.ac.kopo.day10;

public class CastMain {

	/*
	static void print(Child03 c) {
		c.print();
	}
	
	static void print(Child01 c) {
		c.print();
	}
	
	static void print(Child02 c) {
		c.print();
	}
	*/
	
	static Parent getInstance() {
//		return new Child01();
//		return new Child02();
//		return new Child03();
		return new Parent();
	}
	
	static void print(Parent p) {
		p.print();
	}
	
	public static void main(String[] args) {

		 Parent p = getInstance();
		 print(p);
		
		
		/*
		Child03 c = new Child03();
		print(c);
		
		Child01 c01 = new Child01();
		print(c01);
		
		Child02 c02 = new Child02();
		print(c02);
		
		Parent p = new Parent();
		print(p);
		*/
		
		/*
		Parent p = new Child01();	// 묵시적형변환 발생
		p.print();
		
		
		Parent p2 = new Child02();
		p2.print();
		
		Parent p3 = new Parent();
		p3.print();
		*/
		
		/*
		Child02 c02 = new Child02();
		c02.print();
		c02.sing();
		c02.play();
		
		Child01 c01 = new Child01();
		c01.print();
		c01.sleep();
		c01.study();
		
		Parent p = new Parent();
		p.print();
		*/
	}
}

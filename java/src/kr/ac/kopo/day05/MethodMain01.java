package kr.ac.kopo.day05;

/*
 	**********
 	Hello
 	**********
 	Hi
 	**********
 	Goodbye
 	**********
 */
public class MethodMain01 {
	
	/*
	   반환형 : printStar -> main 값을 전달
	   매개변수 : main -> printStar 값을 전달
	 	반환형  메소드(매개변수) {
	 	
	 	}
	 */
	/*
	static void printStar() {
		
		for(int i = 0; i < 10; i++) {
			System.out.print('*');
		}
		System.out.println();
		
	}
	*/
	static void printStar(char c, int cnt) {
		
		for(int i = 0; i < cnt; i++) {
			System.out.print(c);
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		printStar('*', 10);
		System.out.println("Hello");
		printStar('#', 29);
		System.out.println("Hi");
		printStar('-', 5);
		System.out.println("Goodbye");
		printStar('!', 8);
	}
}












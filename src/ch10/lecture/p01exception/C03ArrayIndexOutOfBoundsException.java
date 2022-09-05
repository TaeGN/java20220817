package ch10.lecture.p01exception;

public class C03ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
		System.out.println(args.length);
		int i = 0;
		
		if (args.length > 3) {
			System.out.println(args[0]);
			System.out.println(args[1]);
			System.out.println(args[2]);
			System.out.println(args[3]); // 
		}
		for(String s : args) {
			i++;
			System.out.println(i + "번째 : " + s);
		}
		System.out.println("프로그램 종료");
		
	}
}

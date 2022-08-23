package ch04.lecture.p02method;

public class C06Parameter {
	public static void main(String[] args) {
		
		sum(1, 10); // 1~10사이의 정수 합 출력
		sum(1, 100); // 1~100사이의 정수 합 출력
		sum(50, 200); // 50~200사이의 정수 합 출력
	}
	
	public static void sum(int a, int b) {
		int c = 0;
//		for (int i = a; i <= b; i++) {
//			c += i;
//		}
		c = (a + b) * (b - a + 1)/2;
		
		System.out.println(a + "~" + b + "사이의 정수 합 : " + c);
	}
}

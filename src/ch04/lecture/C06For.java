package ch04.lecture;

public class C06For {
	public static void main(String[] args) {
		
		System.out.println(1);
		
		// 실행흐름
		// 1 -> 2 -true--> 3 -> 4 -반복-> 2
		//        -false-> for문종료
		
		for (int i = 1   ;  // 1.초기값
				
			 i <= 3	;  // 2.조건식
				
			 i++	   // 4.증감식
				) { // 3. 실행문(코드블럭)
			System.out.println(2);
			System.out.println(3);
		}
		
		System.out.println(4);
		System.out.println("-----------------");
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		System.out.println("-----------------");
		for(int i = 5; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("-----------------");
		for(int i = 5; i >= 1; i--) {
			System.out.println(i);
		}
		System.out.println("-----------------");
		for(int i = 10; i >= 5; i--) {
			System.out.println(i);
		}
		
	}
}

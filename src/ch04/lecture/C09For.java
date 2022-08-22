package ch04.lecture;

public class C09For {
	public static void main(String[] args) {
		System.out.println("======================");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("=====================");
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("=====================");
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("=====================");
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= 0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("=====================");
		for (int i = 0; i <= 4; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("=====================");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("=====================");
		int a = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(a++);
			}
			System.out.println();
		}
		
		System.out.println("=====================");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=====================");
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=====================");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=====================");
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int b = 0;
		System.out.println("=====================");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j ++) {
				System.out.print((b++) % 10);
			}
			System.out.println();
		}
		
	}
}

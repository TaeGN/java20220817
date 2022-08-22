package ch04.book;

public class P135Example06 {
	public static void main(String[] args) {
		String str = "";
		for (int i = 0; i < 10; i++) {
			str += "*";
			System.out.println(str);
		}
		
		System.out.println("--------------");
		
		for (int i = 10; i > 0; i--) {
			str = "";
			for (int j = i; j > 0; j--) {
				str += "*";
			}
			System.out.println(str);
		}
	}
}

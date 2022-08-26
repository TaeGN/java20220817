package ch06.book.s060703;

public class KoreanExample {
	public static void main(String[] args) {
		Korean k1 = new Korean("자바자바", "015105-546843");
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		System.out.println(k1.nation);
		
		Korean k2 = new Korean("잡아잡아", "934844-843673");
		System.out.println(k2.name);
		System.out.println(k2.ssn);
		System.out.println(k2.nation);
		
	}
}

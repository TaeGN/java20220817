package ch03.book;

public class P101ConditionalOperationExample {
	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다.");
		
		
		String a = "not bad"; 
		String b = "bad";
		System.out.println(a.equals("not "+a));
		System.out.println(b.equals("not "+b));
	}
}

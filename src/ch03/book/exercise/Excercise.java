package ch03.book.exercise;

public class Excercise {
	public static void main(String[] args) {
		int value = 356;
		System.out.println((value/100)*100);
		
		int score = 85;
		String result = (!(score > 90))? "가":"나";
		System.out.println(result);	
		
		int a = 5;
		int b = 10;
		int c = 7;
		double d = (a+b)*c/2.0;
		System.out.println(d);
		
		int x = 10;
		int y = 5;
		
		System.out.println((x > 7) && (y <= 5));
		System.out.println((x%3 == 2) || (y%2 != 1));
	}
}

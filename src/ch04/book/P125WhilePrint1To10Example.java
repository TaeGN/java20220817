package ch04.book;

public class P125WhilePrint1To10Example {
	public static void main(String[] args) {
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		i = 1;
		int sum = 0;
		while(i<=100) {
			sum += i;
			i++;
		}
		System.out.println("1~100 합: " + sum);
	}
}

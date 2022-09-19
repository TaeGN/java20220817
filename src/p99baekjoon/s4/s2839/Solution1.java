package p99baekjoon.s4.s2839;

import java.util.Scanner;

public class Solution1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int answer = Candy(N);
		System.out.println(answer);
		
		
	}

	private static int Candy(int N) {
		int count = 0;
		if(N == 4 || N == 7) {
			return -1;
		}
		
		switch(N % 5) {
		case 0:
			count = N / 5;
			break;
		case 1:
			count = N / 5 + 1;
			break;
		case 2:
			count = N / 5 + 2;
			break;
		case 3:
			count = N / 5 + 1;
			break;
		case 4:
			count = N / 5 + 2;
			break;		
		}
		return count;
	}
}

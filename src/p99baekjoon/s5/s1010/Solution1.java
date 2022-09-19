package p99baekjoon.s5.s1010;

import java.util.Scanner;

public class Solution1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		for(int i = 0; i < T; i++) {
			int N = scanner.nextInt();
			int M = scanner.nextInt();
			System.out.println(BR(N, M));
		}
	}

	private static int BR(int n, int m) {
		int answer = 1;
		for(int i = 0; i < n; i++) {
			answer
			= (answer * (m - i)) / (i + 1);
		}
		return answer;
	}
}

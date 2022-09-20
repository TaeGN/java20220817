package p99baekjoon;

import java.util.Scanner;

public class S2018 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		System.out.println(SumCount(N));
	}

	private static int SumCount(int n) {
		int count = 0;
		for(long i = 1; (i * (i + 1) / 2) <= n; i++) {
			if((2 * n - i * i + i) % (2 * i) == 0) {
				if((2 * n - i * i + i) / (2 * i) < 1) {
					break;
				}
				if(((2 * n - i * i + i) / (2 * i)) + i - 1 <= n) {
					System.out.println((2 * n - i * i + i) / (2 * i));
					count++;
				}
				
			}
		}
		return count;
	}
}

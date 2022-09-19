package p99baekjoon.s3;

import java.util.Scanner;

public class s1463 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int answer = MakeOne(N);
		System.out.println(answer);
	}

	private static int MakeOne(int N) {
		int count = 0;
		while(N > 1) {
			switch(N % 3) {
			case 0:
				N /= 3;
				break;
			case 1:
				N = (N - 1) / 3;
				count++;
				break;
			case 2:
				if(N % 2 == 0) {
					N /= 2;
				} else {
					N = (N - 1) / 2;
					count++;
				}
				break;
			}
			count++;
		}
		return count;
	}
}

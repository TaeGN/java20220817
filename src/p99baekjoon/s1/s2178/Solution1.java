package p99baekjoon.s1.s2178;

import java.util.Arrays;
import java.util.Scanner;

public class Solution1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		String[][] ip = new String[N][M];
		for(int i = 0; i < N; i++) {
			ip[i] = scanner.next().split("");
		}
		System.out.println(Arrays.toString(ip[0]));
		
		int answer = Mase(ip);
		System.out.println(answer);
	}

	private static int Mase(String[][] ip) {
		int i = 0;
		int j = 0;
		int count = 0;
		
		while(i != ip.length - 1 && j != ip[0].length - 1) {
			
			if(right(i, j)) {
				
			} else if() {
				
			}
			
			count++;
		}
		return count;
	}

	private static boolean right(int i, int j) {
		
		return false;
	}
}

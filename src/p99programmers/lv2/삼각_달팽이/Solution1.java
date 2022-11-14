package p99programmers.lv2.삼각_달팽이;

import java.util.Arrays;

public class Solution1 {
	public static void main(String[] args) {
		int n = 4;
		int[] answer = Sol1(n);
		System.out.println(Arrays.toString(answer));
	}

	private static int[] Sol1(int n) {
		int num = 1;
		int[][] arr = new int[n][];
		for(int i = 0; i < n; i++) {
			arr[i] = new int[i + 1];
		}
		int v = 0;
		for(int j = n; j > 0; j = j - 3) {
			for(int k = 0; k < n; k++) {
				arr[k][v] = num++;
			}
			for(int k = v + 1; k < n - v; k++) {
				arr[n - v - 1][k] = num++;
			}
			for(int k = 0; k < n - 2; k++) {
				arr[n - k - 1][n - v - 1] = num++;
			}
			
		}
		return null;
	}
}

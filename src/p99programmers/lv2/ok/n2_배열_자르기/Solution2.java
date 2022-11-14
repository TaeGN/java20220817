package p99programmers.lv2.ok.n2_배열_자르기;

import java.util.Arrays;

public class Solution2 {
	public static void main(String[] args) {
		int n = 3;
		int left = 2;
		int right = 5;
		int[] answer = Sol1(n, left, right);
		System.out.println(Arrays.toString(answer));
	}

	private static int[] Sol1(int n, int left, int right) {
		int[] arr = new int[(int) (right - left + 1)];
		int j = 0;
		for(long i = left; i <= right; i++) {
			arr[j++] = (int) Math.max(i / n, i % n) + 1;
		}
		return arr;
		
//		int[] arr = new int[n * n];
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < n; j++) {
//				arr[i * n + j] = (int) Math.max(i, j) + 1;
//			}
//		}
//		int[] answer = new int[right - left + 1];
//		for(int i = 0; i < answer.length; i++) {
//			answer[i] = arr[left + i];
//		}
	}
}

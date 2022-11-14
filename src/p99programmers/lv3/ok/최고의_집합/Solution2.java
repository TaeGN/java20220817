package p99programmers.lv3.ok.최고의_집합;

import java.util.Arrays;

public class Solution2 {
	public static void main(String[] args) {
		int n = 2;
		int s = 8;
		int[] answer = Sol1(n, s);
		System.out.println(Arrays.toString(answer));
	}

	private static int[] Sol1(int n, int s) {
		if(n > s) {
			return new int[] {-1};
		}
		
		int[] answer = new int[n];
		int a = s / n;
		int b = s % n;
		for(int i = 0; i < n - b; i++) {
			answer[i] = a;
		}
		for(int i = n - b; i < n; i++) {
			answer[i] = a + 1;
		}
		return answer;
	}
}

package p99programmers.lv2.가장_큰_수;

import java.util.Arrays;

public class Solution2 {
	public static void main(String[] args) {
		int[] numbers = {3, 30, 34, 5, 9};
		String answer = Sol1(numbers);
		System.out.println(answer);
	}

	private static String Sol1(int[] numbers) {
		int n = numbers.length;
		for(int j = 9; j >= 0; j--) {
			for(int i = 0; i < 4; i++) {
				Arrays.sort(numbers);
				for(int k = n; k >= 0; k--) {
					if()
				}
			}
		}
		return null;
	}
}

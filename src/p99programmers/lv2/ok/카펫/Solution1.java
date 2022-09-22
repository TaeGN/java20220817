package p99programmers.lv2.ok.카펫;

import java.util.Arrays;

public class Solution1 {
	public static void main(String[] args) {
		int brown = 24;
		int yellow = 24;
		int[] answer = sol(brown, yellow);
		System.out.println(Arrays.toString(answer));
	}

	private static int[] sol(int brown, int yellow) {
		int[] answer = new int[2];
		int by = brown + yellow;
		for(int i = (int) Math.sqrt(by); i > 2 ; i--) {
			if(by % i == 0) {
				int j = by / i;
				if(2 * (i + j) - 4 == brown && (i - 2) * (j - 2) == yellow) {
					answer[0] = j;
					answer[1] = i;
					break;
				}
			}
		}
		return answer;
	}
}

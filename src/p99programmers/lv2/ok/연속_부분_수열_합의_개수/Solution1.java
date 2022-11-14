package p99programmers.lv2.ok.연속_부분_수열_합의_개수;

import java.util.HashSet;
import java.util.Set;

public class Solution1 {
	public static void main(String[] args) {
		int[] elements = {7,9,1,1,4};
		int answer = Sol1(elements);
		System.out.println(answer);
	}

	private static int Sol1(int[] elements) {
		Set<Integer> set = new HashSet<>();
		// 연속 부분 수열의 길이(1 ~ length)
		for(int i = 1; i <= elements.length; i++) {
			// 시작지점 (0 ~ length - 1)
			for(int j = 0; j < elements.length; j++) {
				// 연속 부분 수열의 합
				int sum = 0;
				for(int k = 0; k < i; k++) {
					sum += elements[(j + k) % elements.length];
				}
				set.add(sum);
			}
		}
		return set.size();
	}
}

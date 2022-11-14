package p99programmers.lv3.ok.야근_지수;

import java.util.Arrays;

public class Solution2 {
	public static void main(String[] args) {
		int n = 1;
		int[] works = {2, 1, 2};
		
		long answer = Sol1(n, works);
		System.out.println(answer);
	}

	private static long Sol1(int n, int[] works) {
		int sum = 0;
		for(int work : works) {
			sum += work;
		}
		int total = sum - n;
		if(total < 0) {
			return 0;
		}
		
		Arrays.sort(works);
		int i = 0;
		int s = 0;
		int a = 0;
		while(i < works.length) {
			a = s + (works.length - i) * works[i];
			if(a >= total) {
				break;
			}
			s += works[i++];
		}
		long answer = 0;
		for(int j = 0; j < i; j++) {
			answer += (long) works[j] * (long) works[j];
		}
		int x = (a - total) / (works.length - i);
		int y = (a - total) % (works.length - i);
		answer += ((long)(works[i] - x - 1) * (long)(works[i] - x - 1) * y )
					+ ((long)(works[i] - x) * (long)(works[i] - x) * (works.length - i - y));
		return answer;
	}
}

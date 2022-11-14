package p99programmers.lv2.ok.멀리_뛰기;

import java.util.Arrays;

public class Solution4 {
	public static void main(String[] args) {
		int n = 100;
		long answer = sol(n);
		System.out.println(answer);		
	}
	private static long sol(int n) {
		long[] cnt = new long[n + 1];
		cnt[1] = 1;
		cnt[2] = 2;

		return Jump(n, cnt) % 1234567;
	}

	private static long Jump(int i, long[] cnt) {
		if(cnt[i] != 0) {
			return cnt[i];
		} else {
			cnt[i] = Jump(i, cnt);
		}
		System.out.println("i : " + i);
		return Jump(i - 1, cnt) + Jump(i - 2, cnt) ;
	}
}

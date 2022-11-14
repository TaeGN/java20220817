package p99programmers.lv2.ok.멀리_뛰기;

public class Solution3 {
	public static void main(String[] args) {
		int n = 4;
		long answer = sol(n);
		System.out.println(answer);
	}

	private static long sol(int n) {
		long count = 0;
		for(int i = 0; i <= n / 2; i++) {
			count += Combi(n - i, i);
			count %= 1234567;
		}
		
		return count;
	}

	private static long Combi(int a, int b) {
		b = Math.min(a - b, b);
		if(b == 0) {
			return 1;
		}
		long answer = 1;
		for(int i = 0; i < b; i++) {
			answer *= (a - i);
			answer /= (i + 1);
		}
		return (long) Math.round(answer) % 1234567;
	}
}

package p99programmers.lv2.ok.멀리_뛰기;

public class Solution2 {
	public static void main(String[] args) {
		int n = 1000;
		long answer = sol(n);
		System.out.println(answer);
	}

	private static long sol(int n) {
		long answer = 0L;
		for(int i = 0; i <= n / 2; i++) {
			answer += conbi(n - i, i);
		}
//		answer %= 1234567L;
		return answer;
	}

	private static long conbi(int n, int i) {
		// n-iCi
		if(i == 0 || n == i) {
			return 1;
		}
		long answer = 1L;
		for(int j = 1; j <= i; j++) {
			answer = answer * ((n - j + 1) / j ) % 1234567L;
		}
//		answer %= 1234567L;
		System.out.println(answer);
		return answer;
	}
}

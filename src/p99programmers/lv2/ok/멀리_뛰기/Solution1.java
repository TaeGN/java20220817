package p99programmers.lv2.ok.멀리_뛰기;

public class Solution1 {
	public static void main(String[] args) {
		int n = 4;
		int answer =  sol(n);
		System.out.println(answer);
	}

	private static int sol(int n) {
		if(n == 1) {
			return 1;
		}
		// nC0 = 1
		int answer = 1;
		
		// n-iCi
		for(int i = 1; i <= n / 2; i++) {
			answer += Combi(n, i);
			answer %= 1234567;
		}
		return answer;
	}

	private static int Combi(int n, int i) {
		if(i == 1) {
			return n;
		}
		if(i == n / 2) {
			if(n % 2 == 0) {
				return 1;
			} else {
				return n - (n / 2);
			}
		}
		int answer = n;
		for(int j = 1; j <= i; j++) {
			answer *= ((n - j) / (1 + j));
			answer %= 1234567;
		}
		return answer;
	}
}

package p99programmers.lv2.ok.점프와_순간_이동;

public class Solution1 {
	public static void main(String[] args) {
		int N = 5000;
		int answer = sol(N);
		System.out.println(answer);
	}

	private static int sol(int n) {
		int answer = 0;
		while(n >= 1) {
			if(n % 2 == 1) {
				answer++;
				n--;
			}
			n /= 2;
		}
		return answer;
	}
}

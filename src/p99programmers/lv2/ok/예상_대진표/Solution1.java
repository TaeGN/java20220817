package p99programmers.lv2.ok.예상_대진표;

public class Solution1 {
	public static void main(String[] args) {
		int N = 8;
		int A = 4;
		int B = 7;
		int answer = sol(N, A, B);
		System.out.println(answer);
	}

	private static int sol(int n, int a, int b) {
		int count = 0;
		for(int i = n; i > 1; i /= 2) {
			a = (a + 1) / 2;
			b = (b + 1) / 2;
			count++;
			if(a == b) {
				return count;
			}
		}
		return 0;
	}
}

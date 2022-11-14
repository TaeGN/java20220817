package p99programmers.lv2.ok.N진수_게임;

public class Solution1 {
	public static void main(String[] args) {
		int n=2;
		int t=4;
		int m=2;
		int p=1;
		String answer = Sol1(n,t,m,p);
		System.out.println(answer);
	}

	private static String Sol1(int n, int t, int m, int p) {
		String str = "";
		int num = 0;
		while(str.length() < (t - 1) * m + p) {
			str += Integer.toString(num++, n);
		}
		str.toUpperCase();
		System.out.println(str);
		String answer = "";
		int i = 0;
		while(answer.length() < t) {
			answer += str.charAt((i++) * m + p - 1);
		}
		return answer;
	}
}

package p99programmers.lv2.ok.다음_큰_숫자;

public class Solution4 {
	public static void main(String[] args) {
		int n = 78;
		int answer = sol(n);
		System.out.println(answer);
	}

	private static int sol(int n) {
		int count = Integer.toBinaryString(n)
					.replace("0", "")
					.length();
		int answer = n + 1;
		while(true) {
			if(Integer.toBinaryString(answer).replace("0", "").length() == count) {
				break;
			}
			answer++;
		}

		return answer;
	}
}

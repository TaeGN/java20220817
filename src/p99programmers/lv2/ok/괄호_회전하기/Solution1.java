package p99programmers.lv2.ok.괄호_회전하기;

public class Solution1 {
	public static void main(String[] args) {
		String s = "[](){}";
		int answer = sol(s);
		System.out.println(answer);
	}

	private static int sol(String s) {
		if(s.length() % 2 == 1) {
			return 0;
		}
		int answer = 0;
		String str = s;
		for(int i = 0; i < s.length(); i++) {
			str = str.substring(1,str.length()) + str.substring(0,1);
			if(Bracket(str)) {
				answer++;
			}
		}
		return answer;
	}

	private static boolean Bracket(String str) {
		int a = 0;
		int b = 0;
		int c = 0;
		for(int i = 0; i < str.length(); i++) {
			switch(str.charAt(i)) {
			case'(':
				a++;
				break;
			case')':
				a--;
				break;
			case'{':
				b++;
				break;
			case'}':
				b--;
				break;
			case'[':
				c++;
				break;
			case']':
				c--;
				break;
			}
			if(a < 0 || b < 0 || c < 0) {
				return false;
			}
		}
		if(a == 0 && b == 0 && c == 0) {
			return true;
		}
		return false;
	}
}

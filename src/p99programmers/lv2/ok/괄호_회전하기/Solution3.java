package p99programmers.lv2.ok.괄호_회전하기;

public class Solution3 {
	public static void main(String[] args) {
		String s = "[](){}";
		int answer = sol(s);
		System.out.println(answer);
	}

	private static int sol(String s) {
		if(s.length() % 2 == 1) {
			return 0;
		}
		
		int count = 0;
		// 괄호 문자열 회전
		for(int i = 0; i < s.length(); i++) {
			String str = s.substring(i, s.length()) + s.substring(0, i);
			if(func(str)) {
				count++;
			}
		}
			
		
		return count;
	}
	
	// 올바른 괄호 문자열인지 판별
	private static boolean func(String str) {
		int a = 0;
		int b = 1;
		while(a != b) {
			a = str.length();
			str = str.replace("()", "").replace("{}", "").replace("[]", "");
			b = str.length();
			if(str.length() == 0) {
				return true;
			}
		}
		return false;
	}
}

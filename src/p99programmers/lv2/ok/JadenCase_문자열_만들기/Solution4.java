package p99programmers.lv2.ok.JadenCase_문자열_만들기;


public class Solution4 {
	public static void main(String[] args) {
		String s = "3people unFollowed me"	;
		String answer = JadenCase(s);
		System.out.println(answer);
		System.out.println(s.toUpperCase());
	}

	private static String JadenCase(String s) {
		s = s.substring(0,1).toUpperCase() + s.substring(1,s.length()).toLowerCase();
		
		for(int i = 0; i < s.length() - 1; i++) {
			if((int)s.charAt(i) == ' ') {
				if((int)s.charAt(i + 1) != ' ') {
					s = s.substring(0, i + 1) +
							s.substring(i + 1, i + 2).toUpperCase() + 
							s.substring(i + 2, s.length());
				}
			}
		}
		
		return s;
	}
}
package p99programmers.lv2.ok.JadenCase_문자열_만들기;

import java.util.Arrays;

public class Solution3 {
	public static void main(String[] args) {
		String s = "3people unFollowed me"	;
		String answer = JadenCase(s);
		System.out.println(answer);
	}

	private static String JadenCase(String s) {
		
		
		String answer = "";
		
		s = s.toLowerCase();
		String[] strArr = s.split(" ");
		for(String str : strArr) {
			int n = str.charAt(0);
			if(n >= 'a' &&  n <= 'z') { // [a-z] 97 ~ 122
				str = str.substring(0,1).toUpperCase() + str.substring(1, str.length()); 
			}
			answer += str + " ";
		}
		
		return answer.substring(0, answer.length()-1);
	}
}

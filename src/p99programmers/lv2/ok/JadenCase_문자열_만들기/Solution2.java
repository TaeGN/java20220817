package p99programmers.lv2.ok.JadenCase_문자열_만들기;

public class Solution2 {
	public static void main(String[] args) {
		String s = "  3people    uNFollowed ME  ";
		String answer = "";
		int n = 0;
		
		for(int i = 0; i < s.length(); i++) {
			while(s.charAt(i) == ' ' && i < s.length()-1) {
				answer += " ";
				i++;
			}
			n = i;
			if(Character.toString(s.charAt(i)).matches("[0-9]")) {
				answer += s.charAt(i);
			} else {
				answer += Character.toUpperCase(s.charAt(i));			
			}
			while(s.charAt(i) != ' ' && i < s.length()-1) {
				i++;
			}
			if(n != s.length()-1) {
				answer += s.substring(n+1, i).toLowerCase();
			}
		}
		
		System.out.println(answer);
	}
}

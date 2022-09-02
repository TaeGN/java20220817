package p99programmers.lv2.ok.올바른_괄호;

public class Solution1 {
	public static void main(String[] args) {
		String s = "(())()";
		int count = 0;
		boolean answer = false;
		
		for(int i = 0; i < s.length(); i++) {
			switch(s.charAt(i)) {
			case '(':
				count++;
				break;
			case ')':
				count--;
				break;
			}
			if(count < 0) {
				break;
			}
		}
		if(count == 0) {
			answer = true;
		}
		System.out.println(answer);
	}
}

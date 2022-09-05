package p99programmers.lv2.짝지어_제거하기;

public class Solution3 {
	public static void main(String[] args) {
		String s = "baabaa";
		int i = 0;
		int result = 0;

		for (; i < s.length()-1;) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				s = s.replaceAll(s.substring(i, i+2), "");
				if(i > 0) {
					i--;
				}
			} else {
				i++;
			}
			System.out.println(s);
		}
		if (s.length() == 0) {
			result = 1;
		}
		System.out.println(result);
	}
}

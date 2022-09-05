package p99programmers.lv2.짝지어_제거하기;

public class Solution {
	public static void main(String[] args) {
		String s = "baabaa";
		int result = 0;

		for (int i = 1; i < s.length(); i++) {
			if (i == 0) {
				i++;
			}
			if (s.charAt(i) == s.charAt(i - 1)) {
				if (i == 1) {
					s = s.substring(i + 1, s.length());
				} else if (i == s.length() - 1) {
					s = s.substring(0, i - 1);
				} else {
					s = s.substring(0, i - 1) + s.substring(i + 1, s.length());
				}
				i -= 2;
			}
			if (i < 0) {
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

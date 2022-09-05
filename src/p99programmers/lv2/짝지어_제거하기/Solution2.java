package p99programmers.lv2.짝지어_제거하기;

public class Solution2 {
	public static void main(String[] args) {
		String s = "baabaa";
		int i = 1;
		int result = 0;
		String a = "";

		for (; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				a = Character.toString(s.charAt(i));
				s = s.replace(a + a, "");
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

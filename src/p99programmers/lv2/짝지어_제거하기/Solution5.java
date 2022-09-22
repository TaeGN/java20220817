package p99programmers.lv2.짝지어_제거하기;

import java.util.ArrayList;
import java.util.List;

public class Solution5 {
	public static void main(String[] args) {
		String s = "baabaa";
		int answer = sol(s);
		System.out.println(answer);
	}

	private static int sol(String s) {
		List<Character> list = new ArrayList<>();
		list.add(s.charAt(0));
		for(int i = 1; i < s.length(); i++) {
			if(list.get(list.size() - 1) == s.charAt(i)) {
				list.remove(list.size() - 1);
			} else {
				list.add(s.charAt(i));
			}
			if(list.size() == 0) {
				return 0;
			}
		}
		return 1;
	}
}

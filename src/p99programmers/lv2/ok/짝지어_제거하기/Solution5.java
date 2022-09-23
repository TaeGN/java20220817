package p99programmers.lv2.ok.짝지어_제거하기;

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
		for(int i = 0; i < s.length(); i++) {
			if(list.size() != 0 && list.get(list.size() - 1) == s.charAt(i)) {
				list.remove(list.size() - 1);
			} else {
				list.add(s.charAt(i));
			}
		}
		return list.size() == 0 ? 1 : 0;
	}
}

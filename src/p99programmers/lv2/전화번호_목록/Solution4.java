package p99programmers.lv2.전화번호_목록;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution4 {
	public static void main(String[] args) {
		String[] phone_book = {"119", "97674223", "1195524421"};
		boolean answer1 = Sol1(phone_book);
		System.out.println(answer1);
	}

	private static boolean Sol1(String[] phone_book) {
		Set<Integer> length = new HashSet<>(); 
		for(String phone : phone_book) {
			length.add(phone.length());
			if(length.size() == 20) {
				break;
			}
		}
		
		Set<String> set1 = new HashSet<String>(Arrays.asList(phone_book));
		boolean answer = true;
		length.stream().sorted().forEach(a -> {
			Set<String> set2 = new HashSet<>(set1);
			for(String s : set2) {
				if(s.length() == a) {
					set1.remove(s);
				}else if(set2.contains(s.substring(0, a))) {
					answer = false;
					break;
				}
			}
		});
		
		return true;
	}
}

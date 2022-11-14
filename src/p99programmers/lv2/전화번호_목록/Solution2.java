package p99programmers.lv2.전화번호_목록;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution2 {
	public static void main(String[] args) {
		String[] phone_book = {"119", "97674223", "1195524421"};
		boolean answer1 = Sol1(phone_book);
		System.out.println(answer1);
	}
	
	// 효율성 4 통과 x
	private static boolean Sol1(String[] phone_book) {
		Map<Integer, List<String>> map = new HashMap<>();
		for(int i = 1; i <= 20; i++) {
			map.put(i, new ArrayList<String>());
		}
		for(String s : phone_book) {
			map.get(s.length()).add(s);	
		}
		
		for(int i = 1; i <= 19; i++) {
			if(map.get(i).size() == 0) {
				continue;
			}
			for(int j = i + 1; j <= 20; j++) {
				if(map.get(j).size() == 0) {
					continue;
				}
				for(String a : map.get(i)) {
					for(String b : map.get(j)) {
						if(b.substring(0, a.length()).equals(a)) {
							return false;
						}
					}
				}
			}
		}
		
		return true;
	}
	
	
	
}

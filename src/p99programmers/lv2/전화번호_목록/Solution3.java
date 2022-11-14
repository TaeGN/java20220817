package p99programmers.lv2.전화번호_목록;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution3 {
	public static void main(String[] args) {
		String[] phone_book = {"1737377171717","119", "97674223","2351", "32623463", "1195524421", "2351"};
		boolean answer = Sol2(phone_book);
		System.out.println(answer);
	}

	private static boolean Sol2(String[] phone_book) {
		Map<Integer, List<String>> map = new HashMap<>();
		for(String phone : phone_book) {
			if(!map.containsKey(phone.length())) {
				map.put(phone.length(), new ArrayList<String>());
			}
			map.get(phone.length()).add(phone);
		}
		// map의 길이 성분 정렬
//		map.keySet().stream().sorted().toArray();
		int[] length = new int[map.size()];
		int n = 0;
		for(int len : map.keySet()) {
			length[n++] = len;
		}
		
		for(int i = 0; i < length.length - 1; i++) {
			for(int j = i + 1; j < length.length; j++) {
				for(String s : map.get(length[j])) {
					if(map.get(length[i]).contains(s.substring(0,length[i]))) {
						return false;
					}
					
				}
			}
		}
		return true;
		
//		for(Object len : map.keySet().stream().sorted().toArray()) {
//			len = (int) len;
//		}
		
	}

	private static boolean Sol1(String[] phone_book) {
//		Set<Integer> length = new HashSet<>(); 
//		for(String phone : phone_book) {
//			length.add(phone.length());
//			if(length.size() == 20) {
//				break;
//			}
//		}
		
		Map<Integer, Set<String>> map = new HashMap<>();
		for(String phone : phone_book) {
			if(!map.containsKey(phone.length())) {
				map.put(phone.length(), new HashSet<String>());
			}
			map.get(phone.length()).add(phone);
		}
		// map의 길이 성분 정렬
		System.out.println(map);
		map.keySet().stream().sorted().toArray();
		System.out.println(map);
		int[] length = new int[map.size()];
		int n = 0;
		for(int len : map.keySet()) {
			length[n++] = len;
		}
		
		for(int i = 0; i < length.length - 1; i++) {
			for(int j = i + 1; j < length.length; j++) {
				for(String s : map.get(j)) {
					if(map.get(length[i]).contains(s.substring(0,length[i]))) {
						return false;
					}
				}
			}
		}
//		for(Object len : map.keySet().stream().sorted().toArray()) {
//			len = (int) len;
//		}
		
		System.out.println(length);
		return true;
	}
}

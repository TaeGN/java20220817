package p99programmers.lv2.ok.뉴스_클러스터링;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution2 {
	public static void main(String[] args) {
		String str1 = "handshake";
		String str2 = "shake hands";
		int answer = Sol1(str1, str2);
		System.out.println(answer);
	}
 //65~90
	private static int Sol1(String str1, String str2) {
		str1 = str1.toUpperCase();
		str2 = str2.toUpperCase();
		Map<String, Integer> map1 = Func(str1);
		Map<String, Integer> map2 = Func(str2);
		
		// 집합의 총 수
		int count2 = map1.remove("count") + map2.remove("count");
		
		System.out.println(map1);
		System.out.println(map2);
		// 중복 문자 개수 구하기 (교집합 수)
		int count1 = 0;
		for(String s : map1.keySet()) {
			if(map2.containsKey(s)) {
				count1 += Math.min(map1.get(s), map2.get(s));
			}
		}
		// 합집합 수
		count2 -= count1;
		
		if(count2 == 0) {
			return 65536;
		}
		int answer = (count1 * 65536) / count2  ;
		return answer;
	}
	
	// 문자 2개씩 끊어서 집합 만들기
	private static Map<String, Integer> Func(String str) {
		Map<String, Integer> map = new HashMap<>();
		String s = "";
		int count = 0;
		for(int i = 1; i < str.length(); i++) {
			if(str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				if(str.charAt(i - 1) >= 65 && str.charAt(i - 1) <= 90) {
					s = "" + str.charAt(i - 1) + str.charAt(i);
					map.compute(s, (k,v) -> v == null ? 1 : v + 1);
					count++;
				}
			} else {
				i++;
			}
		}
		map.put("count", count);
		return map;
	}
}



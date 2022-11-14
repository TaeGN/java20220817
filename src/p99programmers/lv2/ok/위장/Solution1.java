package p99programmers.lv2.ok.위장;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Solution1 {
	public static void main(String[] args) {
		String[][] clothes = {
				{"yellow_hat", "headgear"},
				{"blue_sunglasses", "eyewear"},
				{"green_turban", "headgear"}};
		int answer =  Sol1(clothes);
		System.out.println(answer);
	}

	private static int Sol1(String[][] clothes) {
		
		Map<String, Set<String>> map = new HashMap<>();
		for(String[] arr : clothes) {
			if(!map.containsKey(arr[1])) {
				map.put(arr[1], new HashSet<String>());
			}
			map.get(arr[1]).add(arr[0]);
		}
		
		int answer = 1;
		for(String s : map.keySet()) {
			answer *= map.get(s).size() + 1;
		}
		
		return answer - 1;
	}


}

package p99programmers.lv2.ok.할인_행사;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
	public static void main(String[] args) {
		String[] want = {"banana", "apple", "rice", "pork", "pot"};
		int[] number =  {3, 2, 2, 2, 1};
		String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
		int answer = sol(want, number, discount);
		System.out.println(answer);
	}

	private static int sol(String[] want, int[] number, String[] discount) {
		// map에 (원하는 제품, 수량)으로 입력
		Map<String, Integer> map = new HashMap<>();
		for(int i = 0; i < want.length; i++) {
			map.put(want[i], number[i]);
		}
		
		int count = 0;
		// 시작 날짜
		for(int i = 0; i < discount.length - 9; i++) {
			Map<String, Integer> map1 = new HashMap<>(map);
			// 10일
			for(int j = 0; j < 10; j++) {
				if(map1.containsKey(discount[i+j])) {
					map1.computeIfPresent(discount[i+j], (k, v) -> v - 1);
					if(map1.get(discount[i+j]) < 0) {
						break;
					}
				} else {	
					break;
				}
				
				if(j == 9) {
					count++;
				}
			}
			
		}
		return count;
	}
}

package p99programmers.lv2.ok.타겟_넘버;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution2 {
	public static void main(String[] args) {
		int[] numbers = {1,1,1,1,1};
		int target = 3;
		int answer = Sol1(numbers, target);
		System.out.println(answer);
		
		int[] numbers2 = {4, 1, 2, 1};
		int target2 = 4;
		int answer2 = Sol1(numbers2, target2);
		System.out.println(answer2);
	}	

	private static int Sol1(int[] numbers, int target) {
		Map<Integer, Integer> countElement = new HashMap<>();
		for(int number : numbers) {
			countElement.compute(number, (k, v) -> v == null ? 1 : v + 1);
		}
		List<Map<Integer, Integer>> list = new ArrayList<>();
		for(Integer key : countElement.keySet()) {
			list.add(Count(key, countElement.get(key)));
		}
		int i = 0;
		int cnt = 1;
		int result = 0;
		int sum = 0;
		int answer = 0;
		Function(sum, list, i, cnt, result, target);
		System.out.println(countElement);
		System.out.println(list);
		System.out.println(answer);
		return answer;
	}
	
	private static void Function(int sum, List<Map<Integer, Integer>> list, int i, int cnt, int result, int target) {
		System.out.println("sum : " + sum + "    result : " + result);

		if(i == list.size()) {
			if(sum == target) {
				result += cnt;
			}
		}
		for(Integer key : list.get(i).keySet()) {
			int a = list.get(i).get(key);
			sum += key;
			Function(sum, list, i + 1, cnt * a, result + sum, target);
		}
	}

	// 각 value를 만드는 개수 입력
	private static Map<Integer, Integer> Count(Integer key, Integer value) {
		Map<Integer, Integer> countValue = new HashMap<>();
		for(int i = 0; i <= value / 2; i++) {
			int num = key * value - 2 * i;
			int cnt = Combi(value, i);
			countValue.compute(num, (k, v) -> v == null ? cnt : v + cnt);
			if(num != 0) {
				countValue.compute(-num, (k, v) -> v == null ? cnt : v + cnt);
			}
		}
		
		return countValue;
	}
	
	// aCb 형태의 Combination
	private static int Combi(Integer a, int b) {
		int n = 1;
		for(int i = 0; i < b; i++) {
			n *= (a - i) / (i + 1);
		}
		return n;
	}
}

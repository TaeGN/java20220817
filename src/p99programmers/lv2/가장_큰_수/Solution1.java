package p99programmers.lv2.가장_큰_수;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution1 {
	public static void main(String[] args) {
		int[] numbers = new int[] {3, 30, 34, 5, 9};
		int answer = Sol1(numbers);
		System.out.println(answer);
	}

	private static int Sol1(int[] numbers) {
		Map<String, List<String>> map = new HashMap<>();
		String[] strArr = new String[numbers.length];
		int i = 0;
		String s = "";
		for(int number : numbers) {
			s = String.valueOf(number);
			if(!map.containsKey(s)) {
				map.put(s, new ArrayList<String>());
			}
			map.get(s).add(s);
		}
		System.out.println(map);
		return 0;
	}
}

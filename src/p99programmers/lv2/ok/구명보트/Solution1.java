package p99programmers.lv2.ok.구명보트;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution1 {
	public static void main(String[] args) {
		int[] people = {70, 50, 80, 50};
		int limit = 100;
		int answer = sol(people, limit);
		System.out.println(answer);
	}

	private static int sol(int[] people, int limit) {
		List<Integer> list = Arrays.stream(people)
							.sorted()
							.boxed()
							.collect(Collectors.toList());
		
		System.out.println(list);
		int count = 0;
		while(list.size() > 1) {
			if(list.get(0) + list.get(list.size() - 1) <= limit) {
				list.remove(0);
			}
			list.remove(list.size() - 1);
			count++;
		}
		return list.size() == 0 ? count : count + 1;
	}

	private static int sol2(int[] people, int limit) {
		List<Integer> list = new ArrayList<>();
		int count = 0;
		for(int i = 0; i < people.length; i++) {
			if(list.indexOf(limit - people[i]) != -1) {
				list.remove(list.indexOf(limit - people[i]));
				count++;
			} else {
				list.add(people[i]);
			}
		}
		list.sort((x,y) -> y - x);
		
		while(list.size() > 1) {
			if(list.get(0) + list.get(list.size() - 1) <= limit) {
				list.remove(list.size() - 1);
			}
			list.remove(0);
			count++;
		}
		return list.size() == 0 ? count : count + 1;
		
		
		
		
//		Map<Integer, Integer> map = new HashMap<>();
//		for(int i = 0; i < people.length; i++) {
//			if(map.containsKey(people[i])) {
//				map.put(people[i], map.get(people[i]) + 1);
//			} else {
//				map.put(people[i] , 1);
//			}
//		}
		
		
	}
}

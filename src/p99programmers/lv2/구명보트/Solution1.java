package p99programmers.lv2.구명보트;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution1 {
	public static void main(String[] args) {
		int[] people = {70, 50, 80, 50};
		int limit = 100;
		int answer = sol(people, limit);
	}

	private static int sol(int[] people, int limit) {
		List<Integer> list = new ArrayList<>();
		int count = 0;
		for(int i = 0; i < people.length; i++) {
			if(list.contains(limit - people[i])) {
				list.remove(limit - people[i]);
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

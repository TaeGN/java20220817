package p99programmers.lv2.ok.프린터;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution4 {
	public static void main(String[] args) {
		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location = 0;
		int answer = Sol1(priorities, location);
		System.out.println(answer);
	}

	private static int Sol1(int[] priorities, int location) {
		Map<Integer, List<Integer>> map = new HashMap<>();
		for(int i = 0; i < priorities.length; i++) {
			if(!map.containsKey(priorities[i])) {
				map.put(priorities[i], new ArrayList<Integer>());
			}
			map.get(priorities[i]).add(i);
		}
		int count = 0;
		for(int i = 9; i >= 1; i--) {
			while(!map.containsKey(i)) {
				i--;
			}
			while(map.get(i).size() > 0) {
				count++;
				if(map.get(i).remove(0) == location) {
					return count;
				}
				System.out.println(count+ ":" +map);
			}
		}
		return 0;
	}
	
}

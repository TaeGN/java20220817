package p99programmers.lv3.부대복귀;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution1 {
	public static void main(String[] args) {
		int n = 5;
		int[][] roads = {{1, 2},{1, 4},{2, 4},{2, 5},{4, 5}};
		int[] sources = {1, 3, 5};
		int destination = 5;
		int[] answer = Sol1(n, roads, sources, destination);
		System.out.println(Arrays.toString(answer));
	}

	private static int[] Sol1(int n, int[][] roads, int[] sources, int destination) {
		Map<Integer, List<Integer>> map = new HashMap<>();
		for(int[] road : roads) {
			int a = road[0];
			int b = road[1];
			if(!map.containsKey(a)) {
				map.put(a, new ArrayList<Integer>());
			}
			map.get(a).add(b);
			if(!map.containsKey(b)) {
				map.put(b, new ArrayList<Integer>());
			}
			map.get(b).add(a);
		}
		int[] time = new int[n + 1];
		int count = 1;
		ComeBack(count, destination, time, map);
		System.out.println(Arrays.toString(time));
		int[] answer = new int[sources.length];
		int i = 0;
		for(int source : sources) {
			if(source == destination) {
				answer[i++] = 0;
			}
			else if(time[source] == 0) {
				answer[i++] = -1;
			} else {
				answer[i++] = time[source];
			}
		}
		System.out.println(map);
		return answer;
	}

	private static void ComeBack(int count, int destination, int[] time, Map<Integer, List<Integer>> map) {
		if(count > time.length) {
			return;
		}
		for(int i : map.get(destination)) {
			if(time[i] == 0) {
				time[i] = count;
			} else {
				time[i] = (int) Math.min(count, time[i]);
			}
			ComeBack(count + 1, i, time, map);
		}
		
	}


}

package p99programmers.lv3.부대복귀;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution2 {
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
		int count = 1;
		int[] answer = new int[sources.length];
		int i = 0;
		for(int source : sources) {
			int k = source;
			if(source == destination) {
				answer[i++] = 0;
			} else {
				answer[i++] = ComeBack(source, count, destination, k, map);
			}
		}
		
		
		return null;
	}
	
	private static int ComeBack(int source, int count, int destination, int k, Map<Integer, List<Integer>> map) {
		if(count > 500) {
			return;
		}
		if()
		for(int i : map.get(source)) {
			if(i == destination) {
				k
			}
			ComeBack(i, count + 1, destination, k, map);
		}
		
	}
	
	
	
}

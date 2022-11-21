package p99programmers.lv3.네트워크;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution1 {
	public static void main(String[] args) {
		int n = 3;
		int[][] computers = {
				{1, 1, 0},
				{1, 1, 0},
				{0, 0, 1}
		};
		int answer = Sol1(n, computers);
		System.out.println(answer);
	}
	static int cnt = 0;
	static Set<Integer> set = new HashSet<>();
	private static int Sol1(int n, int[][] computers) {
		Map<Integer, Set<Integer>> map = new HashMap<>();
		for(int i = 0; i < computers.length; i++) {
			map.put(i, new HashSet<Integer>());
		}
		for(int i = 0; i < computers.length - 1; i++) {
			for(int j = i + 1; j < computers.length; j++) {
				if(computers[i][j] == 1) {
					map.get(i).add(j);
					map.get(j).add(i);
				}
			}
		}
		boolean[] visit = new boolean[n];
		List<Set<Integer>> list = new ArrayList<>();
		int i = 0;
		for(int j = 0; j < n; j++) {
			if(!visit[j]) {
				set = new HashSet<>();
				Network(map, set, visit, j);
				list.add(set);
			}
		}
		System.out.println(map);
		return list.size();
	}

	private static void Network(Map<Integer, Set<Integer>> map, Set<Integer> set, boolean[] visit, int j) {
		if(visit[j] == true) {
			return;
		}
		for(Integer i : map.get(j)) {
			if(!visit[i]) {
				Network(map, set, visit, i);
			}
		}
		visit[j] = true;
		
	}
}

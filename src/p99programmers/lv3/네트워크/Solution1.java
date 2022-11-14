package p99programmers.lv3.네트워크;

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
		
		for()
		System.out.println(map);
		return 0;
	}
}

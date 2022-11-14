package p99programmers.lv3.등대;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution1 {
	public static void main(String[] args) {
		int n = 8;
		int[][] lighthouse = {
				{1,2},
				{1,3},
				{1,4},
				{1,5},
				{5,6},
				{5,7},
				{5,8}
		};
		int answer = Sol1(n, lighthouse);
		System.out.println(answer);
	}

	private static int Sol1(int n, int[][] lighthouse) {
		Map<Integer, List<Integer>> map = new HashMap<>();
		
		for(int i = 1; i <= n; i++) {
			map.put(i, new ArrayList<Integer>());
		}
		
		for(int[] arr : lighthouse) {
			map.get(arr[0]).add(arr[1]);
			map.get(arr[1]).add(arr[0]);
		}
//		for(int i = 1; i <= n; i++) {
//			if(map.get(i).size() == 1) {
//				
//			}
//	}
		
//		Map<Integer, Integer> len = new HashMap<>();
//		for(int i = 1; i <= n; i++) {
//			len.put(i, map.get(i).size());
//		}
		
		
		List<Integer> sorted = new ArrayList<Integer>(map.keySet());
		Collections.sort(sorted, (a, b) -> map.get(a).size() - map.get(b).size());
		System.out.println(sorted);
		List<Integer> key = new ArrayList<Integer>(map.keySet());
		for(int a : sorted) {
			
		}
		System.out.println(map);
		return 0;
	}
}

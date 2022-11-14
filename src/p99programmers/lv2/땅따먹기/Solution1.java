package p99programmers.lv2.땅따먹기;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
	public static void main(String[] args) {
		int[][] land = {
				{1,2,3,5},
				{5,6,7,8},
				{4,3,2,1}
		};
		int answer = Sol1(land);
		System.out.println(answer);
	}

	private static int Sol1(int[][] land) {
		int r = land.length;
		int c = land[0].length;
		Map<Integer, Integer> map = new HashMap<>();
		int sum = 0;
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				
			}
		}
			
		return 0;
	}
}

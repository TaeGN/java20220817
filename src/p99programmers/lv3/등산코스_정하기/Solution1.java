package p99programmers.lv3.등산코스_정하기;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution1 {
	public static void main(String[] args) {
		int n = 6;
		int[][] paths = {{1,2,3},{2,3,5},{2,4,2},{2,5,4},{3,4,4},{4,5,3},{4,6,1},{5,6,1} };
		int[] gates = {1,3};
		int[] summits = {5};
		int[] result = sol(n,paths,gates,summits);
		System.out.println(Arrays.toString(result));
	}

	private static int[] sol(int n, int[][] paths, int[] gates, int[] summits) {
		Map<Integer, Integer> mapGates = new HashMap<>();
		for(int gate : gates) {
//			mapGates.put(gate, null)
			for(int i = 0; i < paths.length; i++) {
				if(paths[i][0] == gate) {
					mapGates.put(gate, null)
				}
			}
		}
		return null;
	}
}

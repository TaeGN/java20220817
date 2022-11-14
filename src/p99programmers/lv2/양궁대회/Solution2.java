package p99programmers.lv2.양궁대회;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution2 {
	public static void main(String[] args) {
		int n = 5;
		int[] info = {2,1,1,1,0,0,0,0,0,0,0};
		int[] answer = sol(n, info);
		System.out.println(Arrays.toString(answer));
	}

	private static int[] sol(int n, int[] info) {
		Map<Integer, Double> map = new HashMap<>();
		for(int i = 0; i < info.length; i++) {
			if(info[i] == 0) {
				map.put(i, (double) (10 - i));
			} else {
				map.put(i, (10 - i) * 2 / (double) (info[i] + 1));
			}
		}
		
		return null;
	}
}

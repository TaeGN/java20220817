package p99programmers.lv2.더_맵게;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution1 {
	public static void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		int answer = Sol2(scoville, K);
		System.out.println(answer);
	}
	
	// 효율개선 필요
	private static int Sol2(int[] scoville, int K) {
		List<Integer> list = new ArrayList<>();
		int count = 0;
		for(int a : scoville) {
			list.add(a);
		}
		list.sort((a, b) -> a - b);

		while(list.size() > 1) {
			count++;
			long newScov = (long) list.remove(0) + (long) list.remove(0) * 2;
			if(newScov < K) {
				list.add((int) newScov);
				list.sort((a, b) -> a - b);
			} else {
				list.add(K);
			}
			if(list.get(0) >= K) {
				return count;
			}
		}
		return -1;
	}
//			newScov = (int) Math.min(newScov, Integer.MAX_VALUE);

	// x
	private static int Sol1(int[] scoville, int K) {
		List<Integer> list = new ArrayList<>();
		int count = 0;
		for(int a : scoville) {
			if(a < K) {
				list.add(a);
			}
		}

		while(list.size() > 0) {
			count++;
			list.sort((a, b) -> a - b);
			long newScov = (long) list.remove(0) + (long) list.remove(0) * 2;
			if(newScov < K) {
				list.add((int) newScov);
				list.sort((a, b) -> a - b);
			}
			if(list.size() == 1) {
				return -1;
			}
		}
		return count;
	}
}

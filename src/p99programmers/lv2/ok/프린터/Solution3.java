package p99programmers.lv2.ok.프린터;

import java.util.Arrays;

public class Solution3 {
	public static void main(String[] args) {
		int[] priorities = {2, 1, 3, 2};
		int location = 2;
		int answer =  sol(priorities, location);
		System.out.println(answer);
	}

	private static int sol(int[] priorities, int location) {
		int[] sorted = priorities;
		Arrays.sort(sorted);
		
		int i = 0;
		int j = sorted.length - 1;
		int count = 0;
		while(true) {
			if(sorted[sorted.length - 1] == priorities[i]) {
				count++;
				if(i == location) {
					return count;
				}
			}
			i++;
			i %= priorities.length;
		}
		return 0;
	}
}

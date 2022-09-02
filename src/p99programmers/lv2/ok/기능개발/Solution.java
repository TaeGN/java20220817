package p99programmers.lv2.ok.기능개발;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1, 1, 1, 1, 1, 1};
		int[] ans = new int[progresses.length];
		int n = 0;
		int count = 0;
		int a = 0;
		
		while(n < progresses.length) {
			for(int i = 0; i < progresses.length; i++) {
				progresses[i] += speeds[i];				
			}
			while(progresses[n] >= 100) {
				count++;
				n++;
				if(n >= progresses.length || progresses[n] < 100) {
					ans[a] = count;
					count = 0;
					a++;
					break;
				}
			}
		}
		int[] result = new int[a];
		for(int i = 0; i < a; i++) {
			result[i] = ans[i];
		}
		System.out.println(Arrays.toString(ans));
		System.out.println(Arrays.toString(result));
	}
}

//			while(progresses[n] >= 100 && n < progresses.length) {
//				count++;
//				n++;
//				if (progresses[n] < 100) {
//					ans[a] = count;
//					count = 0;
//					a++;
//				}
//			}
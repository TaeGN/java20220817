package p99programmers.lv2.ok.n2_배열_자르기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public static void main(String[] args) {
		int n = 3;
		long left = 2;
		long right = 5;
		int Len = Long.valueOf(right - left + 1).intValue();
		List<Integer> list = new ArrayList<>();
		int[] answer = new int[Len];
		int k = 0;
		int i = (int)left / n;
		
		for(int j = (int)left % n; j < n; j++) {
			answer[k] = (int) Math.max(i, j) + 1;
			k++;
		}
		
		for(i += 1; i < (int)right / n; i++) {
			answer
//			for(int j = 0; j < n; j++) {
//				answer[k] = (int) Math.max(i, j) + 1;
//				k++;
//			}
		}
		
		for(int j = 0; j <= (int)right % n; j++) {
			answer[k] = (int) Math.max(i, j) + 1;
			k++;
		}
		System.out.println(Arrays.toString(answer));

		
	}
}

package p99programmers.lv2.N개의_최소공배수;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
	public static void main(String[] args) {
		int[] arr = {2,6,8,14};
		int answer = sol(arr);
	}

	private static int sol(int[] arr) {
		// 두 수의 최소공배수 구하는 함수
		int answer = arr[0];
		List<Integer> list = new ArrayList<>();
		list.add(2);
		for(int i = 3; i <= 100; i++) {
			int n = i;
			for(int j = 0; j < list.size() && list.get(j) < i; j++) {
				if(i % list.get(j) == 0) {
					
				}
			}
		}
		for(int i = 1; i < arr.length; i++) {
			answer = func(answer, arr[i]);
		}
		return 0;
	}

	private static int func(int answer, int i) {
		
		return 0;
	}

	
	
}

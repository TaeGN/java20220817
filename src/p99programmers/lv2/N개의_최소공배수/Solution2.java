package p99programmers.lv2.N개의_최소공배수;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
	public static void main(String[] args) {
		int[] arr = {2,6,8,14};
		int answer = sol(arr);
		System.out.println(answer);
	}

	private static int sol(int[] arr) {
		// 100 이하의 소수
		List<Integer> list = new ArrayList<>();
		list.add(2);
		for(int i = 3; i <= 100; i++) {
			for(int j = 0; j < list.size(); j++) {
				if(i % list.get(j) == 0) {
					break;
				}
				if(j == list.size() - 1) {
					list.add(i);
					break;
				}
			}
		}
		int answer = 1;
		for(int i = 0; i < arr.length; i++) {
			answer *= arr[i];
		}
		System.out.println(answer);
		
		int n = 0;
		while(n < list.size()) {
			while(answer % list.get(n) == 0) {
				answer /= list.get(n);
			}
			n++;
		}
		
		
		return answer;
	}
}

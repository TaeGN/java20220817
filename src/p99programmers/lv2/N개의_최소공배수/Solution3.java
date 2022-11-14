package p99programmers.lv2.N개의_최소공배수;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution3 {
	public static void main(String[] args) {
		int[] arr = {2,6,8,14};
		int answer = sol(arr);
		System.out.println(answer);
	}

	private static int sol(int[] arr) {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		
		// 2 ~ 100까지의 소수 구해서 list에 넣기
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
		
		// 주어진 arr의 값을 소수들의 곱으로 나타내기 -> count 배열에 각 소수들의 개수
		int[] count = new int[list.size()];
		for(int element : arr) {
			for(int i = 0; i < list.size(); i++) {
				int cnt = 0;
				while(element % list.get(i) == 0) {
					element /= list.get(i);
					cnt++;
				}
				if(count[i] < cnt) {
					count[i] = cnt;
				}
			}
		}
		
		int answer = 1;
		for(int i = 0; i < list.size(); i++) {
			answer *= Math.pow(list.get(i), count[i]);
		}
		return answer;
	}
}

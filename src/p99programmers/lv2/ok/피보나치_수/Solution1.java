package p99programmers.lv2.ok.피보나치_수;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
	public static void main(String[] args) {
		int n = 100;
		int answer = Sol(n);
		System.out.println(answer);
	}

	private static int Sol(int n) {
		List<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(1);
		
		int val = 0;
		for(int i = 2; i <= n; i++) {
			val = list.get(i-2) + list.get(i-1);
			list.add(val % 1234567);
		}
		System.out.println(list);
		
		int answer = list.get(list.size() - 1);
		return answer;
	}
}

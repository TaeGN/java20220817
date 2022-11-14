package p99programmers.lv2.ok.멀리_뛰기;

import java.util.ArrayList;
import java.util.List;

public class Solution5 {
	public static void main(String[] args) {
		int n = 4;
		long answer = Sol1(n);
		System.out.println(answer);		
	}

	private static long Sol1(int n) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		if(n < 3) {
			return n;
		}
		for(int i = 2; i < n; i++) {
			int cnt = list.get(i - 1) + list.get(i - 2);
			list.add(cnt % 1234567);
		}
		
		
		return list.get(list.size() - 1);
	}
}

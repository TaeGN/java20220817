package p99programmers.lv3.ok.야근_지수;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution1 {
	public static void main(String[] args) {
		int n = 4;
		int[] works = {4,3,3};
		
		int answer = sol(n, works);
		System.out.println(answer);
				
	}

	private static int sol(int n, int[] works) {
//		List<Integer> list = new ArrayList<Integer>();
		int i = 1;
		Arrays.stream(works)
			.sorted()
			.boxed()
			.collect(Collectors.groupingBy(e -> i, Collectors.d))
			.
		int work = 0;
		while(work <= n) {
			
		}
		return 0;
	}
}

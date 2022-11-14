package p99programmers.lv2.ok.H_Index;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution3 {
	public static void main(String[] args) {
		int[] citations = {3,0,6,1,5};
		 int answer = sol(citations);
		 System.out.println(answer);
	}

	private static int sol(int[] citations) {
		List<Integer> list = Arrays.stream(citations)
								.sorted()
								.boxed()
								.collect(Collectors.toList());
		for(int i = 1; i <= list.size(); i++) {
			int pos = list.size() - i;
			if(i >= list.size() - list.get(citations[pos])) {
				if()
			}
		}
		System.out.println(Arrays.toString(citations));
		return 0;
	}
}

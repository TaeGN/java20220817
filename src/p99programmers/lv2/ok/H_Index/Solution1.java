package p99programmers.lv2.ok.H_Index;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution1 {
	public static void main(String[] args) {
		 int[] citations = {3,0,6,1,5};
		 int answer = sol(citations);
		 System.out.println(answer);
	}


	private static int sol(int[] citations) {
		Arrays.sort(citations);
		
		for(int i = 0; i < citations.length; i++) {
			if(citations[citations.length - i - 1] <= i + 1) {
				if(citations.length - i - 1 <= citations[citations.length - i - 1]) {
					return citations[citations.length - i - 1];
				}
			}
		}
		return 0;
	}
}

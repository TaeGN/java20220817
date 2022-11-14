package p99programmers.lv2.ok.H_Index;

import java.util.Arrays;

public class Solution2 {
	public static void main(String[] args) {
		int[] citations = {3,0,6,1,5};
		 int answer = sol(citations);
		 System.out.println(answer);
	}

	private static int sol(int[] citations) {
		Arrays.sort(citations);
		int len = citations.length;
		for(int i = 1; i <= len; i++) {
			int n = len - i;
			if(citations[n] <= i) {
				for(int j = citations[n + 1] - 1; j >= citations[n]; j--) {
					if(n <= citations[n]) {
						return citations[n];
					}
				}	
			}
		}
		return 0;
	}
}

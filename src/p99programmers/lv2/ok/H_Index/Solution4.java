package p99programmers.lv2.ok.H_Index;

import java.util.Arrays;

public class Solution4 {
	public static void main(String[] args) {
		int[] citations = {3,0,6,1,5};
		int answer = Sol1(citations);
		System.out.println(answer);
	}

	private static int Sol1(int[] citations) {
		Arrays.sort(citations);
		System.out.println(Arrays.toString(citations));
		// i = H-index
		for(int i = citations.length; i >= 0; i--) {
			int j = 0;
			while(citations[j] < i) {
				j++;
				if(j > citations.length - i) {
					break;
				}
			}
			if(citations.length - j >= i && j <= i) {
				return i;
			}
		}
		return 0;
	}
}

package p99leetcode;

import java.util.Arrays;

public class S771 {
	public static void main(String[] args) {
		String jewels = "aA";
		String stones = "aAAbbbb";
		
		int answer = numJewelsInStones(jewels, stones);
		System.out.println(answer);
		
	}

	private static int numJewelsInStones(String jewels, String stones) {
		int count = 0;
		
		for(int i = 0; i < jewels.length(); i++) {
			for(int j = 0; j < stones.length(); j++) {
				if(jewels.charAt(i) == stones.charAt(j)) {
					count++;
				}
			}
		}
		
		return count;
	}
}

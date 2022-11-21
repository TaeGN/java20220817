package p99programmers.lv2.땅따먹기;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
	public static void main(String[] args) {
		int[][] land = {
				{1,2,3,5},
				{5,6,7,8},
				{4,3,2,1}
		};
		int answer = Sol1(land);
		System.out.println(answer);
	}

	private static int Sol1(int[][] land) {
		int rowLen = land.length;
		int sum = 0;
		int row = 0;
		int prev = -1;
		EatGround(row, rowLen, land, sum, prev);
		
		
			
		return result;
	}
	
	static int result = 0;
	private static void EatGround(int row, int rowLen, int[][] land, int sum, int prev) {
		if(rowLen <= row) {
			if(result < sum) {
				System.out.println(sum);
				result = sum;
				return;
			}
		}
		
		for(int pos = 0; pos < land[0].length; pos++) {
			if(pos != prev) {
				EatGround(row + 1, rowLen, land, sum + land[row][pos], pos);	
			}
		}
	}
}

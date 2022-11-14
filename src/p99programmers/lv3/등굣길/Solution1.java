package p99programmers.lv3.등굣길;

import java.util.Arrays;
import java.util.List;

public class Solution1 {
	public static void main(String[] args) {
		int m = 4;
		int n = 3;
		int[][] puddles = {{2,2}};
		int answer = Sol1(m, n, puddles);
		System.out.println(answer);
	}
	static int count = 0;
	private static int Sol1(int m, int n, int[][] puddles) {
		boolean[][] tf = new boolean[n][m];
		Arrays.fill(tf, true);
		for(int[] arr : puddles) {
			tf[arr[0] - 1][arr[1] - 1] = false;
		}
		count = Path(n, m, tf);
		return 0;
	}

	private static int Path(int n, int m, boolean[][] tf) {
		count++;
		if(m > 1) {
			if(tf[m - 2][])) {
				
			}
			
		}
		// TODO Auto-generated method stub
		
	}
}

package p99programmers.lv2.ok.행렬의_곱셈;

import java.util.Arrays;

public class Solution1 {
	public static void main(String[] args) {
		int[][] arr1 = {{1,4},{3,2},{4,1}};
		int[][] arr2 = {{3,3},{3,3}};
		int[][] answer = sol(arr1,arr2);
		System.out.println(Arrays.toString(answer[0]));
	}

	private static int[][] sol(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr2[0].length];
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr2[0].length; j++) {
				int sum = 0;
				for(int k = 0; k < arr1[0].length; k++) {
					sum += arr1[i][k] * arr2[k][j];
				}
				answer[i][j] = sum;
			}
		}
		return answer;
	}
}

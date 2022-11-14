package p99programmers.lv3.정수_삼각형;

public class Solution {
	public static void main(String[] args) {
		int[][] triangle = {{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}};
		int answer = Sol1(triangle);
		System.out.println(answer);
		
		
	}
	static int max = 0;
	private static int Sol1(int[][] triangle) {
		int i = 0;
		int j = 0;
		int[] arr = new int[triangle.length];
		max = Triangle(triangle, i , j, arr);
		return 0;
	}

	private static int Triangle(int[][] triangle, int i, int j, int[] arr) {
		
		
		return max;
	}
}

package p99programmers.lv3.정수_삼각형;

public class Solution2 {
	public static void main(String[] args) {
		int[][] triangle = {{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}};
		int answer = Sol1(triangle);
		System.out.println(answer);		
	}
	
	static int result = 0;
	private static int Sol1(int[][] triangle) {
		
		int i = 0;
		int sum = 0;
		int end = triangle.length;
		int pos = 0;
		Triangle(i, end, triangle, pos, sum);
		
		return result;
	}
	private static void Triangle(int i, int end, int[][] triangle, int pos, int sum) {
		if(i == end) {
			if(sum > result)
			result = sum;
			return;
		}
		
		Triangle(i + 1, end, triangle, pos, sum + triangle[i][pos]);
		Triangle(i + 1, end, triangle, pos + 1, sum + triangle[i][pos]);
	}
}

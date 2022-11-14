package p99programmers.lv2.ok.야간_전술보행;

public class Solution1 {
	public static void main(String[] args) {
		int distance = 12;
		int[][] scope = {
				{3, 4},
				{5, 8}
		};
		int[][] times = {
				{2, 5},
				{4, 3}
		};
		int[][] scope2 = {
				{7,8},
				{4,6},
				{11,10}
		};
		int[][] times2 = {
				{2, 2},
				{2,4},
				{3,3}
		};
		int answer = Sol1(distance, scope2, times2);
		System.out.println(answer);
	}

	private static int Sol1(int distance, int[][] scope, int[][] times) {
		int min = distance;
		int n = 0;
		for(int i = 0; i < scope.length; i++) {
			int start = (int) Math.min(scope[i][0], scope[i][1]);
			int last = (int) Math.max(scope[i][0], scope[i][1]);
			for(int j = start; j <= last; j++) {
				n = times[i][0] + times[i][1]; 
				if(j % n <= times[i][0] && j % n > 0) {
					System.out.println(j);
					min = (int)Math.min(min, j);
					break;
				}
			}
		}
		return min;
	}
}

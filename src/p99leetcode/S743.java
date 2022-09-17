package p99leetcode;

public class S743 {
	public static void main(String[] args) {
		int[][] times = {{2,1,1},{2,3,1},{3,4,1}};
		int n = 4;
		int k = 2;
		
		int answer = networkDelayTime(times, n, k);
		System.out.println(answer);
	}

	private static int networkDelayTime(int[][] times, int n, int k) {
		int answer = 0;
		int count = 0;
		
		for(int i = 0; i < times.length; i++) {
			int a = (times[i][0] + times[i][1]) / 2;
			if(a >= k && a < n) {
				answer += times[i][2];
				count++;
			}
		}
		if(count != n - k) {
			return -1;
		}
		return answer;
	}
}



package p99programmers.lv2.피로도;

import java.util.Arrays;

public class Solution2 {
	public static void main(String[] args) {
		int k = 80;
		int[][] dungeons = {
				{80,20},
				{30,20},
				{50,40},
				{30,10}};
		int answer = Sol1(k, dungeons);
		System.out.println(answer);
		
	}
	static int result = 0;
	private static int Sol1(int k, int[][] dungeons) {
		Arrays.sort(dungeons, (a, b) -> {
			if(a[1] == b[1]) {
				return Integer.compare(b[0], a[0]);
			} else {
				return Integer.compare(a[1], b[1]);
			}
		});
		
		
		System.out.println(Arrays.toString(dungeons[0]));
		System.out.println(Arrays.toString(dungeons[1]));
		System.out.println(Arrays.toString(dungeons[2]));
		System.out.println(Arrays.toString(dungeons[3]));
		int cnt = 0;
		boolean[] path = new boolean[dungeons.length];
		Dungeons(k, dungeons, path, cnt);
		
		return result;
	}
	private static void Dungeons(int k, int[][] dungeons, boolean[] path, int cnt) {
		// TODO Auto-generated method stub
		if(k < dungeons[dungeons.length - 1][0]) {
			if(result < cnt) {
				System.out.println(cnt);
				result = cnt;
			}
			return;
		}
		
		for(int i = 0; i < dungeons.length; i++) {
			if(path[i] == false && k >= dungeons[i][0]) {
				path[i] = true;
				Dungeons(k - dungeons[i][1], dungeons, path, cnt + 1);
				path[i] = false;
			}
		}
	}
}


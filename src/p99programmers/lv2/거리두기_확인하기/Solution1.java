package p99programmers.lv2.거리두기_확인하기;

import java.util.Arrays;

public class Solution1 {
	public static void main(String[] args) {
		String[][] places = {
				{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
				{"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
				{"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
				{"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
				{"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
		int[] answer = sol(places);
		System.out.println(Arrays.toString(answer));
	}

	private static int[] sol(String[][] places) {
		System.out.println(Arrays.toString(places[0]));
		// 대기실 5개
		for(int i = 0; i < 5; i++) {
			// 행 5개
			for(int j = 0; j < 5; j++) {
				// 열 5개
				for(int k = 0; k < 5; k++) {
					if(places[i][j].charAt(k) == 'P') {
//						if()
					}
				}
			}
		}
		return null;
	}
}

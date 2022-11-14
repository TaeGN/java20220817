package p99programmers.lv2.ok.혼자_놀기의_달인;

import java.util.Arrays;

public class Solution1 {
	public static void main(String[] args) {
		int cards[] = {8,6,3,7,2,5,1,4};
		int cards_len = cards.length;
		int answer = sol(cards, cards_len);
		System.out.println(answer);
	}

	private static int sol(int[] cards, int cards_len) {
		int max = Integer.MIN_VALUE;
		
		// 1번 상자 시작 위치
		for(int i = 0; i < cards_len; i++) {
			boolean[] tf = new boolean[cards_len];
			tf[i] = true;
			int count1 = 1;
			int card1 = i + 1;
			
			// 1번 상자 그룹
			while(count1 < cards_len) {
				if(!tf[cards[card1 - 1] - 1]) {
					tf[cards[card1 - 1] - 1] = true;
					card1 = cards[card1 - 1];
					count1++;
				} else {
					break;
				}
			}
			System.out.println(Arrays.toString(tf));
			// 1번 상자 개수 == 전체 개수
			if(count1 == cards_len) {
				continue;
			}
				
			// 2번 상자 시작 위치
			for(int j = 0; j < cards_len; j++) {
				boolean[] tf2 = tf;
				while(j < cards_len) {
					if(tf2[j]) {
						j++;
					} else {
						break;
					}
				}
				System.out.println(j);
				if(j == cards_len) {
					break;
				}
				
				int count2 = 1;
				int card2 = j + 1;
				while(count1 + count2 < cards_len) {
					if(!tf2[cards[card2 - 1] - 1]) {
						tf2[cards[card2 - 1] - 1] = true;
						card2 = cards[card2 - 1];
						count2++;
					} else {
						max = Math.max(max, count1 * count2);
						System.out.println(i + ":" + j + ":" + max);
						break;
					}
				}
				
				//2번 상자 그룹
			}
		}
		return max;
	}

}

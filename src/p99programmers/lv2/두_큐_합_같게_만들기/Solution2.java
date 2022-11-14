package p99programmers.lv2.두_큐_합_같게_만들기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution2 {
	public static void main(String[] args) {
		int[] queue1 = {3, 2, 7, 2};
		int[] queue2 = {4, 6, 5, 1};
		int answer = Sol2(queue1, queue2);
		System.out.println(answer);
		
	}

	private static int Sol2(int[] queue1, int[] queue2) {
		int sum1 = 0;
		int sum2 = 0;
		int[] q1 = new int[queue1.length * 2];
		int[] q2 = new int[queue1.length * 2];
		for(int i = 0; i < queue1.length; i++) {
			sum1 += queue1[i];
			sum2 += queue2[i];
			q1[i] = q2[i + queue1.length] = queue1[i];
			q2[i] = q1[i + queue1.length] = queue2[i];
		}
		int sum = sum1 + sum2;
		if(sum % 2 == 1) {
			return -1;
		}
		
		int diff = sum / 2 - sum1;
		
		int i = 0;
		int a = 0;
		int b = 0;
		int cnt1 = 0;
		int cnt2 = 0;
		while(i++ < queue1.length * 2) {
			if(diff > 0) {
				if(b >= queue1.length * 2) {
					return -1;
				}
				diff -= q2[b++];
				cnt2++;
			} else if(diff < 0) {
				if(a >= queue1.length * 2) {
					return -1;
				}
				diff += q1[a++];
				cnt1++;
			} else {
				break;
			}
			if((int)Math.abs(cnt1 - cnt2) > queue1.length) {
				return - 1;
			}
		}
		if(diff == 0) {
			return cnt1 + cnt2;
		}
		return -1;
	}

	private static int Sol1(int[] queue1, int[] queue2) {
		int sum1 = 0;
		int sum2 = 0;
		List<Integer> q1 = new ArrayList<>();
		List<Integer> q2 = new ArrayList<>();
		for(int i = 0; i < queue1.length; i++) {
			sum1 += queue1[i];
			sum2 += queue2[i];
			q1.add(queue1[i]);
			q2.add(queue2[i]);
		}
		int sum = sum1 + sum2;
		if(sum % 2 == 1) {
			return -1;
		}
		
		int diff = sum / 2 - 1;
		
		int i = 0;
		while(i++ < queue1.length * 3) {
			if(diff > 0) {
				
			}
		}
		return 0;
	}
}

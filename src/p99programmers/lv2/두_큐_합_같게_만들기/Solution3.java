package p99programmers.lv2.두_큐_합_같게_만들기;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution3 {
	public static void main(String[] args) {
		int[] queue1 = {1, 2, 1, 2};
		int[] queue2 = {1, 10, 1, 2};
		int answer =  Sol1(queue1, queue2);
		System.out.println(answer);
	}
	
	private static int Sol1(int[] queue1, int[] queue2) {
		long sum1 = 0;
		long sum2 = 0;
		Queue<Integer> q1 = new LinkedList<>();
		Queue<Integer> q2 = new LinkedList<>();
		
		for(int i = 0; i < queue1.length; i++) {
			q1.add(queue1[i]);
			sum1 += queue1[i];
			q2.add(queue2[i]);
			sum2 += queue2[i];
		}
		
		
		long avg = (sum1 + sum2) / 2;
		long diff = avg - sum1;
		int cnt = 0;
		Insert(diff, queue1, queue2, cnt);
		return result;
	}
	static int result = -1;
	private static void Insert(long diff, int[] q1, int[] q2, int cnt) {
		if(diff == 0) {
			if(result > cnt) {
				result = cnt;
				return;
			}
		}
		if(cnt > q1.length * 2) {
			return;
		}
		
		
		
	}
}

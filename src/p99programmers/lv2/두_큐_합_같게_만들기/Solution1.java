package p99programmers.lv2.두_큐_합_같게_만들기;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
	public static void main(String[] args) {
		int[] queue1 = {1, 2, 1, 2};
		int[] queue2 = {1, 10, 1, 2};
		int answer =  sol(queue1, queue2);
		System.out.println(answer);
	}

	private static int sol(int[] queue1, int[] queue2) {
		int sum1 = 0;
		int sum2 = 0;
		int avg = 0;
		int diff = 0;
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		for(int queue : queue1) {
			list1.add(queue);
			sum1 += queue;
		}
		
		for(int queue : queue2) {
			list2.add(queue);
			sum2 += queue;
		}
		
		// 두 큐의 원소들의 합 2의 배수 아니면 리턴 -1
		if((sum1 + sum2) % 2 == 1) {
			return -1;
		}
		avg = (sum1 + sum2) / 2;
		diff = sum1 - avg;
		
		int count = 0;
		while(diff != 0) {
			if(diff > 0) {
				if(list1.size() == 0) {
					return -1;
				}
				list2.add(list1.get(0));
				diff -= list1.get(0);
				list1.remove(0);
			} else {
				if(list2.size() == 0) {
					return -1;
				}
				list1.add(list2.get(0));
				diff += list2.get(0);
				list2.remove(0);
			}
			count++;
			if(count >= queue1.length * 2) {
				return -1;
			}
		}
		return count;
	}
}

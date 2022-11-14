package p99programmers.lv2.ok.타겟_넘버;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution1 {
	public static void main(String[] args) {
		int[] number = {1, 1, 1, 1, 1};
		int target = 3;
		int answer = Sol2(number, target);
		System.out.println(answer);
	}

	private static int Sol2(int[] number, int target) {
		int sum = 0;
		
		// map에 각 숫자별 개수 입력
		for(int num : number) {
			sum += num;
		}
		int diff = sum - target;
		
		if(diff < 0 || diff % 2 != 0) {
			return 0;
		}
		
		diff /= 2;
		System.out.println(diff);
		
		Arrays.sort(number);
		int count = 0;
		int i = number.length - 1;
		while(i >= 0) {
			
			// 값이 diff보다 큰 수 배제
			while(number[i] > diff) {
				i--;
			}
			
			
			int n = 0;
			int j = i;
			while(n < diff && j >= 0) {
				if()
				n += number[j--];		
			}
			if(n == diff) {
				count++;
			}
			
			i--;
		}
		
		return 0;
	}

	
	
	
	
	private static int Sol1(int[] number, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		int sum = 0;
		
		// map에 각 숫자별 개수 입력
		for(int num : number) {
			sum += num;
			map.compute(num, (k, v) -> v == null ? 1 : v + 1);
		}
		int diff = sum - target;
		
		if(diff < 0 || diff % 2 != 0) {
			return 0;
		}
		
		diff /= 2;
		System.out.println(diff);
		for(int i = 1; i <= 20; i++) {
			for(int j = 0; j < i; j++) {
				
			}
		}
		
		return 0;
	}
}

package p99leetcode.assignment01;

import java.util.HashMap;
import java.util.Map;

public class S1748 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,2};
		int answer = sumOfUnique(nums);
		System.out.println(answer);
	}

	private static int sumOfUnique(int[] nums) {
		int[] counts = new int[101];
		int answer = 0;
		
		for(int num : nums) {
			counts[num]++;
		}
		for(int i = 0; i < counts.length; i++) {
			if(counts[i] == 1) {
				System.out.println(i);
				answer += i;
			}
		}
		return answer;
		
//		Map<Integer, Integer> map = new HashMap<>();
//		for(int i = 0; i < nums.length; i++) {
//			if(map.containsKey(nums[i])) {
//				map.put(nums[i], map.get(nums[i]) + 1);
//			} else {
//				map.put(nums[i], 1);
//			}
//		}
//		
	}
}

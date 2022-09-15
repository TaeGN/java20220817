package p99leetcode;

import java.util.HashSet;
import java.util.Set;

public class S287 {
	public static void main(String[] args) {
		int[] nums = {1,3,4,2,2};
		int answer = solution(nums);
		int setAns = setsol(nums);
		System.out.println(answer);
		System.out.println(setAns);
		
	}

	private static int setsol(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < nums.length; i++) {
			if(!set.add(nums[i])) {
				return nums[i];
			}
		}
		return 0;
	}

	private static int solution(int[] nums) {
//		for(int i = 0; i < nums.length; i++) {
//			for(int j = 0; j < nums.length; j++) {
//				if(nums[i] == nums[j] && j != i) {
//					return nums[i];
//				}
//			}
//		}
//		
//		return 0;
	}
}

package p99leetcode.assignment01;

import java.util.HashMap;
import java.util.Map;

public class S1512 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,1,1,3};
		int answer = numIdenticalPairs(nums);
		System.out.println(answer);
	}

	private static int numIdenticalPairs(int[] nums) {
		int[] counts = new int[101];
		int answer = 0;
		for(int i = 0; i < nums.length; i++) {
			counts[nums[i]]++;
		}
		for(int count : counts) {
			answer += Combination(count);
		}
		return answer;
	}

	private static int Combination(int count) {
		int answer = (count * (count - 1)) / 2;
		return answer;
	}
}

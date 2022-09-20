package p99leetcode.assignment01;

import java.util.Arrays;
import java.util.stream.Collectors;

public class S2206 {
	public static void main(String[] args) {
		int[] nums = {3,2,3,2,2,2};
		boolean answer = divideArray(nums);
		System.out.println(answer);
	}
	
	
	private static boolean divideArray2(int[] nums) {
		Arrays.stream(nums)
			.boxed()
			.collect(Collectors.groupingBy(e -> e, Collectors.counting()))
			.entrySet()
			.stream()
			.
		
		return false;
	}

	private static boolean divideArray(int[] nums) {
		int[] counts = new int[501];
		for(int num : nums) {
			counts[num]++;
		}
		for(int count : counts) {
			if(count % 2 != 0) {
				return false;
			}
		}
		return true;
	}
}

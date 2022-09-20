package p99leetcode.assignment01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class S1512 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,1,1,3};
		int[] nums2 = {1,1,1,1};
		long answer = numIdenticalPairs2(nums);
		long answer2 = numIdenticalPairs2(nums2);
		System.out.println(answer);
		System.out.println(answer2);
	}
	
	// stream
//	public int numIdenticalPairs(int[] nums) {
//		return Arrays.stream(nums)
//				.boxed()
//				.collect(Collectors.groupingBy(e -> e, Collectors.counting()))
//				.values()
//				.stream()
//				.mapToInt(n -> n.intValue())
//				.map(n -> n * (n - 1) / 2)
//				.sum();
//	}
	
	private static long numIdenticalPairs2(int[] nums) {
		long answer = Arrays.stream(nums)
			.boxed()
			.collect(Collectors.groupingBy(e -> e, Collectors.counting()))
			.entrySet()
			.stream()
			.filter(e -> e.getValue() > 1)
			.map(e -> e.getValue() * (e.getValue() - 1) / 2)
			.reduce((x,y) -> x + y)
			.get();

		
		return answer;
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

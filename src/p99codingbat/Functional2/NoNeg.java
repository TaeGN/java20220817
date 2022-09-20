package p99codingbat.Functional2;

import java.util.Arrays;
import java.util.List;

public class NoNeg {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(-3,-3,3,3);
		System.out.println(noNeg(nums));
	}
	
	public static List<Integer> noNeg(List<Integer> nums) {
		return nums.stream()
			    .filter(e -> e >= 0)
			    .collect(Collectors.toList());
	}

}

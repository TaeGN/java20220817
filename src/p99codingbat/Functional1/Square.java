package p99codingbat.Functional1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Square {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3);
		System.out.println(square(list));
		
	}

	private static List<Integer> square(List<Integer> nums) {
		return nums.stream()
			.map(e -> e * e)
			.collect(Collectors.toList());
			
		
		
			
	}
}

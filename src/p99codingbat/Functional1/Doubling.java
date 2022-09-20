package p99codingbat.Functional1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Doubling {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3);
		
		System.out.println(doubling(list));
	}
	
	public static List<Integer> doubling(List<Integer> nums) {
		  return nums.stream()
		    .map(e -> e * 2)
		    .collect(Collectors.toList());
		  
		}
}

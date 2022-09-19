package ch16.book.s1604;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("ab", "ca", "bb", "ab", "ea");
		
		names.stream()
		.distinct()
		.forEach(e -> System.out.println(e));
		System.out.println();
		
		names.stream()
		.filter(n -> n.startsWith("a"))
		.forEach(e -> System.out.println(e));
		System.out.println();
		
		names.stream()
		.distinct()
		.filter(n -> n.startsWith("a"))
		.forEach(e -> System.out.println(e));
	}
}

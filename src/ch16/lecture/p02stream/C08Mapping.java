package ch16.lecture.p02stream;

import java.util.stream.IntStream;

public class C08Mapping {
	public static void main(String[] args) {
		// IntStream (primitive type stream) -> Stream<Integer>
				IntStream.of(3, 5, 9, 1, 0)
						.boxed()
						.sorted((a, b) -> b - a)
						.forEach((e) -> System.out.println(e));
				
				// 
				// 코드 작성
		String res = IntStream.of(3,5,9,1,0)
				.boxed()
				.sorted((a, b) -> b - a)
				.map(s -> Integer.toString(s))
				// .map(s -> s + "")
				.reduce((a, b) -> a + ", " + b)
				.get();
		System.out.println(res);
		
	}
}

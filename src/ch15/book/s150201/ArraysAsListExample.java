package ch15.book.s150201;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArraysAsListExample {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("홍길동", "신용권", "감자바");
		
		for(String name : list1) {
			System.out.println(name);
		}
		
		System.out.println();
		
		// 향상된 for문
		for(int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println();
		
		// for each
		list1.forEach((e) -> System.out.println(e));
			
		System.out.println();
		
		// Iterator
		Iterator<String> iterator = list1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println();
		
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		for(int value : list2) {
			System.out.println(value);
		}
	}
}

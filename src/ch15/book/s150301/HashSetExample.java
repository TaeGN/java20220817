package ch15.book.s150301;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("java");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println(size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println(set.size());
		
		iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}

		for(String element : set) {
			System.out.println(element);
		}
		
		set.forEach((e) -> System.out.println(e));
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어있음");
		}
		
		
	}
}

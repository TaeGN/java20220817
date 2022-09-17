package ch15.book.s150502;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(new Integer(78));
		scores.add(new Integer(64));
		scores.add(new Integer(62));
		scores.add(new Integer(97));
		scores.add(new Integer(57));
		
		Integer score = null;
		
		score = scores.first();
		System.out.println(score);
		
		score = scores.last();
		System.out.println(score);
		
		score = scores.lower(new Integer(80));
		System.out.println(score);
		
		score = scores.higher(new Integer(80));
		System.out.println(score);
		
		score = scores.pollFirst();
		System.out.println(score);
		
		
	}
}

package p99leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class S1684 {
	public static void main(String[] args) {
		String allowed = "ab";
		String[] words = new String[] {"ad","bd","aaab","baa","badab"};
		
		int answer1 = countConsistentStrings1(allowed, words);
		int answer2 = countConsistentStrings2(allowed, words);
		
		System.out.println(answer1);
		System.out.println(answer2);
		
	}

	private static int countConsistentStrings2(String allowed, String[] words) {
		
		return 0;
	}

	private static int countConsistentStrings1(String allowed, String[] words) {
		Set<Character> set = new HashSet<>();
		int count = words.length;
		for(int i = 0; i < allowed.length(); i++) {
			set.add(allowed.charAt(i));
		}
		for(int i = 0; i < words.length; i++) {
			Set<Character> set1 = new HashSet<>(set);
			System.out.println(set1);
			for(int j = 0; j < words[i].length(); j++) {
				if(set1.add(words[i].charAt(j))) {
					count--;
					break;
				}
			}
			
		}
		
		return count;
	}
}



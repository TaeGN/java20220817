package p99programmers.lv2.ok.영어_끝말잇기;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution1 {
	public static void main(String[] args) {
		int n = 3;
		String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		int[] answer = sol(n, words);
		System.out.println(Arrays.toString(answer));
	}

	private static int[] sol(int n, String[] words) {
		int[] answer = new int[2];
		Set<String> set = new HashSet<>();
		set.add(words[0]);
		for(int i = 1; i < words.length; i++) {
			if(words[i].charAt(0) != words[i-1].charAt(words[i-1].length() - 1)) {
				answer[0] = (i % n) + 1;
				answer[1] = (i / n) + 1;
				return answer;
			}
			if(!set.add(words[i])) {
				answer[0] = (i % n) + 1;
				answer[1] = (i / n) + 1;
				return answer;
			}	
		}
		return answer;
	}
}

package p99programmers.lv2.ok.스킬트리;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1 {
	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		int answer = Sol1(skill, skill_trees);
		System.out.println(answer);
	}

	private static int Sol1(String skill, String[] skill_trees) {
		List<Character> list = new ArrayList<>();
		for(char c : skill.toCharArray()) {
			list.add(c);
		}
		
		int count = 0;
		for(String str : skill_trees) {
			List<Character> list2 = new ArrayList<Character>(list);
			boolean tf = true;
			for(char c : str.toCharArray()) {
				if(list2.contains(c)) {
					if(list2.get(0) == c) {
						list2.remove(0);
					} else {
						tf = false;
						break;
					}
				}
			}
			if(tf) {
				count++;
			}
			
		}
		return count;
	}
}

package p99programmers.lv3.이중우선순위큐;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution1 {
	public static void main(String[] args) {
		String[] operations = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
		int[] answer = Sol1(operations);
		System.out.println(Arrays.toString(answer));
	}

	private static int[] Sol1(String[] operations) {
		List<Integer> list = new ArrayList<>();
		for(String s : operations) {
			String sub = s.substring(2, s.length());
			if(s.charAt(0) == 'I') {
				if(sub.equals("1")) {
					list.remove(Collections.max(list));
				} else {
					list.add(Integer.parseInt(sub));
				}
			} else if(sub.equals("1")) {
				
			}
		}
		
		return null;
	}
}

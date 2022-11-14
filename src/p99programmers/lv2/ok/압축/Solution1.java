package p99programmers.lv2.ok.압축;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution1 {
	public static void main(String[] args) {
		String msg = "TOBEORNOTTOBEORTOBEORNOT";
//		int[] answer1 = Sol1(msg);
//		System.out.println(Arrays.toString(answer1));
		int[] answer2 = Sol2(msg);
		System.out.println(Arrays.toString(answer2));
	}

	private static int[] Sol1(String msg) {
		Map<String, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		
		// 길이가 1인 알파벳 map에 담기
		for(int i = 1; i <= 26; i++) {
			String s = "" + (char) (i + 64);
			map.put(s, i);
		}
		
		int count = 27;
		for(int i = 0; i < msg.length(); i++) {
			String s = "" + msg.charAt(i);
			while(map.containsKey(s)) {
				if(i >= msg.length() - 1) {
					break;
				}
				s += msg.charAt(++i);
			}
			list.add(map.get(s.substring(0,s.length() - 1)));
			map.put(s, count++);
		}
		System.out.println(map);
		int[] answer = list.stream().mapToInt(a -> a).toArray();
		return answer;
	}
	
	private static int[] Sol2(String msg) {
		Map<String, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		
		// 길이가 1인 알파벳 map에 담기
		int count = 1;
		while(count <= 26) {
			String s = "" + (char) (count + 64);
			map.put(s, count++);
		}
		
		String s = "";
		for(int i = 0; i < msg.length(); i++) {
			s += msg.charAt(i);
			if(map.containsKey(s)) {
				continue;
			} else {
				list.add(map.get(s.substring(0, s.length() - 1)));
				map.put(s, count++);
				s = "";
				i--;
			}
		}
		list.add(map.get(s));
		return list.stream().mapToInt(a -> a).toArray();
	}
}

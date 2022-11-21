package p99programmers.lv3.숫자_타자_대회;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution1 {
	public static void main(String[] args) {
		String numbers = "5123";
		int answer = Sol1(numbers);
		System.out.println(answer);
	}

	private static int Sol1(String numbers) {
		String[][] keyPad = new String[4][3];
		for(int i = 1; i <= 9; i++) {
			keyPad[(i - 1) / 3][(i - 1) % 3] = Integer.toString(i);
		}
		keyPad[3][0] = "*";
		keyPad[3][1] = "0";
		keyPad[3][2] = "#";
		
		Map<String, Integer> map = new HashMap<>();
		map = Time(keyPad);

		int answer = MinimumTime(numbers, map);
		
		
		
		return answer;
	}
	
	// 이동 가중치 계산
	private static Map<String, Integer> Time(String[][] keyPad) {		
		Map<String, Integer> map = new HashMap<>();
		for(int i = 0; i < keyPad.length; i++) {
			for(int j = 0; j < keyPad[0].length; j++) {
				for(int k = 0; k < keyPad.length; k++) {
					for(int m = 0; m < keyPad[0].length; m++) {
						int time = 0;
						if(i != k || j != m) {
							int a = (int)Math.abs(k - i);
							int b = (int)Math.abs(m - j);
							while(a > 0 && b > 0) {
								a--;
								b--;
								time += 3;
							}
							while(a > 0 || b > 0) {
								a--;
								b--;
								time += 2;
							}
						} else {
							time = 1;
						}
						String s = keyPad[i][j] + keyPad[k][m];
						map.put(s, time);
					}
				}
			}
		}
		return map;
	}
	
	private static int MinimumTime(String numbers, Map<String, Integer> map) {
		String left = "4";
		String right = "6";
		int time = 0;
		for(int i = 0; i < numbers.length(); i++) {
			String s = numbers.substring(i, i + 1);
			String s1 = left + s;
			String s2 = right + s;
			if(map.get(s1) < map.get(s2)) {
				left = s;
				time += map.get(s1);
			} else {
				right = s;
				time += map.get(s2);
			}
		}
		
		return time;
	}
	
	
	static int result = Integer.MAX_VALUE;
	
	private static void MinimumTime1(String numbers, Map<String, Integer> map, int time, int pos, String left, String right) {
		if(pos == numbers.length()) {
			if(result > time) {
				result = time;
			}
			return;
		}
		
		String s = numbers.substring(pos, pos + 1);
		String s1 = left + s;
		String s2 = right + s;
		if(map.get(s1) < map.get(s2)) {
			left = s;
			time += map.get(s1);
		} else {
			right = s;
			time += map.get(s2);
		}
		
		MinimumTime1(numbers, map, time, pos + 1, left, right);
		
	}

	
}

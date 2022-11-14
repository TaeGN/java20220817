package p99programmers.lv2.ok.튜플;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution1 {
	public static void main(String[] args) {
		String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
		int[] answer = sol(s);
		int[] answer2 = sol2(s);
		System.out.println(Arrays.toString(answer));
	}

	private static int[] sol2(String s) {
		// LinkedHashSet 이용
		String[] arr = str.split("\\},\\{");
		Map<Integer, String> map = new HashMap<>();
		for(String st : arr) {
			map.put(st.length(), st);
		}
		System.out.println(map);
		Set<Integer> set = new HashSet<>();		// TODO Auto-generated method stub
		return null;
	}

	private static int[] sol(String s) {
		String str = s.substring(2, s.length()-2);
//		String[] arr = String.join(",", str.split("\\},\\{")).split(",");
//		System.out.println(Arrays.toString(arr));
//		for(int)
		
		
		
//		for(int i = 1; i <= arr.length; i++) {
//			System.out.println(map.get(i));
//		}
//		int[] answer = Arrays.stream(st.split(","))
//						.mapToInt(Integer::parseInt)
//						.toArray();
		return null;
	}
}

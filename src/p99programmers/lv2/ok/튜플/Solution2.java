package p99programmers.lv2.ok.튜플;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Solution2 {
	public static void main(String[] args) {
		String s = "{{4,2,3},{3},{2,3,4,1},{2,3}}";
		int[] answer = sol(s);
		System.out.println(Arrays.toString(answer));
	}

	private static int[] sol(String s) {
		// 집합 별로 분리
		String[] arr = s.split("\\},\\{");
		arr[0] = arr[0].substring(2, arr[0].length());
		arr[arr.length - 1] = arr[arr.length - 1].substring(0, arr[arr.length - 1].length() - 2);
		
//		 집합의 길이로 정렬 
		Arrays.sort(arr, (a, b) -> a.length() - b.length());
		
		// 튜플 담기
		int[] tuple = new int[arr.length];
		LinkedHashSet<String> set = new LinkedHashSet<>();
		for(int i = 0; i < arr.length; i++) {
			for(String str : arr[i].split(",")) {
				if(set.add(str)) {
					tuple[i] = Integer.parseInt(str);
					break;
				}
			}
		}
		return tuple;
	}
}

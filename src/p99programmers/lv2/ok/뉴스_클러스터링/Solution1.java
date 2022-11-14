package p99programmers.lv2.ok.뉴스_클러스터링;

import java.util.Map;

public class Solution1 {
	public static void main(String[] args) {
		String str1 = "FRANCE";
		String str2 = "french";
		int answer = sol(str1, str2);
		System.out.println(answer);
	}

	private static int sol(String str1, String str2) {
		Map<String, Integer> map1 = strSet(str1);
		Map<String, Integer> map2 = strSet(str2);
		int a = 0;
		int b = 0;
		
		for(int i = 0; i < map1.size(); i++) {
			if(map2.containsKey(map1)) {
				a += Math.max(map1.get(i)., b)
			}
		}
		return 0;
	}

	private static Map<String, Integer> strSet(String str) {
		// TODO Auto-generated method stub
		return null;
	}
}

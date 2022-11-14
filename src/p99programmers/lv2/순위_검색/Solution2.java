package p99programmers.lv2.순위_검색;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sun.tools.classfile.CharacterRangeTable_attribute.Entry;

public class Solution2 {
	public static void main(String[] args) {
		String[] info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
		String[] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
		int[] answer = sol(info, query);
		System.out.println(Arrays.toString(answer));
	}

	private static int[] sol(String[] info, String[] query) {
		Map<String, List<Integer>> map = new HashMap<>();
		int[] answer = new int[query.length];
		int q = 0;
		
		// info 정보 map에 입력
		for(String s : info) {
			String[] arr = s.split(" ");
			String name = "";
			for(int i = 0; i < 4; i++) {
				name += arr[i].charAt(0);
			}
			int score = Integer.parseInt(arr[4]);
			
			// map에 name값 없으면 추가
			if(!map.containsKey(name)) {
				map.put(name, new ArrayList<Integer>());
			}
			map.get(name).add(score);
		}
		
		// value값 오름차순 정렬
		for(String key : map.keySet()) {
			map.get(key).sort((a,b) -> a - b);
		}
		System.out.println(map);
		
		for(String s : query) {
			String[] arr = s.replace("and ", "").split(" ");
			String name = "";
			for(int i = 0; i < 4; i++) {
				name += arr[i].charAt(0);
			}
			int minScore = Integer.parseInt(arr[4]);
			
			// 조건에 맞는 합 구하기
			if(map.containsKey(name)) {
				answer[q++] = Count(map, name, minScore);
			} else {
				boolean[] tf = new boolean[4]; 
				for(int i = 0; i < 4; i++) {
					tf[i] = (name.charAt(i) == 0);
				}
				answer
			}

		}
		
		return null;
	}

	private static int Count(Map<String, List<Integer>> map, String name, int minScore) {
		int pos = map.get(name).get(minScore);
		int count = map.get(name).size() - pos;
		return count;
	}
}

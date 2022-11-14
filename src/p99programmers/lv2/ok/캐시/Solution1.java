package p99programmers.lv2.ok.캐시;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
	public static void main(String[] args) {
		int cacheSize = 3;
		String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
		int answer = sol(cacheSize, cities);
		System.out.println(answer);
	}

	private static int sol(int cacheSize, String[] cities) {
		if(cacheSize == 0) {
			return cities.length * 5;
		}
		int answer = 0;
		List<String> list = new ArrayList<>();
		for(String city : cities) {
			city = city.toUpperCase();
			if(list.remove(city)) {
				answer += 1;
			} else {
				answer += 5;
				if(list.size() == cacheSize) {
					list.remove(0);
				}
			}				
			list.add(city);
		}
		return answer;
	}
	
}


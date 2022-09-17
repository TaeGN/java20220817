package ch15.book.exercise.p09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		map.put("black", 98);
		map.put("hong", 90);
		map.put("hong", 100);
		
		String maxname = null;
		String minname = null;
		int maxScore = Integer.MIN_VALUE;
		int minScore = Integer.MAX_VALUE;
		int totalScore = 0;
		double avg = 0;
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			if(maxScore < entry.getValue()) {
				maxScore = entry.getValue();
				maxname = entry.getKey();
			}
			if(minScore > entry.getValue()) {
				minScore = entry.getValue();
				minname = entry.getKey();
			}
			totalScore += entry.getValue();
		}
		avg = (double)totalScore / map.size();
		
		System.out.println("max : " + maxname + "-" + maxScore);
		System.out.println("min : " + minname + "-" + minScore);
		System.out.println("total : " + totalScore);
		System.out.println("avg : " + avg);
	}
}

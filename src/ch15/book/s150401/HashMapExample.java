package ch15.book.s150401;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("신용권1", 85);
		map.put("신용권2", 84);
		map.put("신용권3", 83);
		map.put("신용권4", 82);
		map.put("신용권5", 81);
		System.out.println("entry 수 : " + map.size());
		
		System.out.println(map.get("신용권3"));
		System.out.println();
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + ":" + value);
		}
		System.out.println();
		
		map.forEach((k, v) -> System.out.println(k + ":" + v));
		
		map.remove("신용권2");
		System.out.println("entry 수 : " + map.size());
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + ":" + value);
			
		}
		System.out.println();
	}
}

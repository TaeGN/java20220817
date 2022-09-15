package p99leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class S1046 {
	public static void main(String[] args) {
		int[] stones = {2,7,4,1,8,1};
		List<Integer> list = new ArrayList<Integer>();
		
		for(int stone : stones) {
			list.add(stone);
		}
		
//		Arrays.sort(stones);
		list.sort(Comparator.naturalOrder());
		while(list.size() > 1) {
			list.sort(Comparator.naturalOrder());
			if(list.get(list.size()-1) != list.get(list.size()-2)) {
				list.add(list.get(list.size()-1) - list.get(list.size()-2));
			}
			list.remove(list.size()-1);
			list.remove(list.size()-2);		
		}
		System.out.println(list);
	}
}

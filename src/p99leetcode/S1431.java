package p99leetcode;

import java.util.ArrayList;
import java.util.List;

public class S1431 {
	public static void main(String[] args) {
		int[] candies = {2,3,5,1,3};
		int extraCandies = 3;
		List<Boolean> list = new ArrayList<Boolean>();
		int max = candies[0];
		for(int i = 0; i < candies.length; i++) {
			max = Math.max(max, candies[i]);
		}
		
		
		for(int i = 0; i < candies.length; i++) {
			list.add(candies[i] + extraCandies >= max);
		}
		System.out.println(list);
	}
}

package p99programmers.lv2.ok.롤케이크_자르기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution1 {
	public static void main(String[] args) {
		 int[] topping = {1, 2, 1, 3, 1, 4, 1, 2};
		 int answer = Sol1(topping);
		 System.out.println(answer);
	}

	private static int Sol2(int[] topping) {
		
		
		return 0;
	}

	private static int Sol1(int[] topping) {
		int count = 0;
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		int[] type1 = new int[topping.length - 1];
		int[] type2 = new int[topping.length - 1];
		
		
		for(int i = 0; i < topping.length - 1; i++) {
			set1.add(topping[i]);
			set2.add(topping[topping.length - i - 1]);
			type1[i] = set1.size();
			type2[topping.length - i - 2] = set2.size();
		}
		
		for(int i = 0; i < type1.length; i++) {
			if(type1[i] == type2[i]) {
				count++;
			}
		}
		System.out.println(Arrays.toString(type1));
		System.out.println(Arrays.toString(type2));
		return count;
	}
}

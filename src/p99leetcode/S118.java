package p99leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S118 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		List<List<Integer>> answer = new ArrayList<>();
		int rowIndex = 8;
		int a = 0;
		int b = 0;
		list.add(1);

		answer.add(new ArrayList<>(list));
		System.out.println(answer);
		if(rowIndex > 0) {
			list.add(1);
		}
		answer.add(new ArrayList<>(list));
		System.out.println(answer);
		for(int i = 2; i <= rowIndex; i++) {		
			for(int j = 1; j < i; j++) {
				a = list.get(j);
				b = list.get(j - 1);
				list.add(a + b);
			}
			for(int j = 1; j < i; j++) {
				list.remove(1);
			}
			list.add(1);
			answer.add(new ArrayList<>(list));
			System.out.println(answer);
		}
	}
}
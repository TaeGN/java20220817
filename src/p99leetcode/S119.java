package p99leetcode;

import java.util.ArrayList;
import java.util.List;

public class S119 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		int rowIndex = 8;
		int a = 0;
		int b = 0;
		
		list.add(1);
		System.out.println(list);
		if(rowIndex > 0) {
			list.add(1);
		}
		System.out.println(list);
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
			System.out.println(list);
		}
	}
}

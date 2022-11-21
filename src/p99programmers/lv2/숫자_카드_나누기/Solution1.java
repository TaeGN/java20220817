package p99programmers.lv2.숫자_카드_나누기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1 {
	public static void main(String[] args) {
		int[] arrayA = {14, 35, 119};
		int[] arrayB = {18, 30, 102};
		int answer = Sol1(arrayA, arrayB);
		System.out.println(answer);
	}

	private static int Sol1(int[] arrayA, int[] arrayB) {
		Arrays.sort(arrayA);
		Arrays.sort(arrayB);
		List<Integer> listA = CommonFactor(arrayA);
		List<Integer> listB = CommonFactor(arrayB);
		
		listA.sort((x, y) -> x - y);
		listB.sort((x, y) -> x - y);
		System.out.println(listA);
		System.out.println(listB);
		int a = listA.size() - 1;
		int b = listB.size() - 1;
		while(a != 0 || b != 0) {
			int cnt = 0;
			if(listA.get(a) > listB.get(b)) {
				for(int card : arrayB) {
					if(card % listA.get(a) == 0) {
						break;
					}
					cnt++;
				}
				if(cnt == arrayB.length) {
					return listA.get(a);
				}
				if(a > 0) {
					a--;
				}
			} else {
				for(int card : arrayA) {
					if(card % listB.get(b) == 0) {
						break;
					}
					cnt++;
				}
				if(cnt == arrayA.length) {
					return listB.get(b);
				}
				if(b > 0) {
					b--;
				}
			}
		}
		
		return 0;
	}

	private static List<Integer> CommonFactor(int[] array) {
		int a = array[0];
		int b = 0;
		for(int i = 1; i < array.length; i++) {
			b = array[i];
			while(a != 0) {
				int r = b % a;
				b = a;
				a = r;
			}
			a = b;
		}
		List<Integer> list = new ArrayList<>();	
		
//		if(b < 4) {
//			for(int i = 1; i <= b; i++) {
//				list.add(i);
//			}
//			return list;
//		}
		
		
		for(int i = 1; i <= (int) Math.sqrt(b); i++) {
			if(b % i == 0) {
				list.add(i);
				if(b / i != i) {
					list.add(b / i);
				}
			}
		}
		return list;
	}


}

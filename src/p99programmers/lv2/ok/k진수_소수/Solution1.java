package p99programmers.lv2.ok.k진수_소수;

import java.util.Arrays;

public class Solution1 {
	public static void main(String[] args) {
		int n = 437674;
		int k = 3;
		int answer = sol(n, k);
		System.out.println();
		System.out.println(answer);
	}

	private static int sol(int n, int k) {
		String str = Integer.toString(n, k);
		String[] strArr = str.split("0");
		System.out.println(Arrays.toString(strArr));
		
		int count = 0;
		for(String s : strArr) {
			if(s.length() == 0) {
				continue;
			}
			int m = Integer.parseInt(s);
			System.out.print(m + " ");
			if(PrimeNum(m)) {
				count++;
			}
		}
		return count;
	}
	
	private static boolean PrimeNum(int m) {
		if(m == 1) {
			return false;
		}
		if(m == 2 && m == 3) {
			return true;
		}
		for (int i = 2; i<=(int)Math.sqrt(m); i++) {
		     if (m % i == 0) {
		         return false;
		     }
		}
		return true;
	}
}

package p99programmers.lv2.ok.k진수_소수;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution2 {
	public static void main(String[] args) {
		int n = 20301;
		int k = 10;
		int answer = sol(n, k);
		System.out.println(answer);
	}

	private static int sol(int n, int k) {
		String str = Integer.toString(n, k);
		System.out.println(str);
		String[] arr = str.split("0");
		System.out.println(Arrays.toString(arr));
		
		int count = 0;
		Set<String> primeT = new HashSet<>();
		Set<String> primeF = new HashSet<>();
		primeF.add("1");
		primeT.add("2");
		primeT.add("3");
		for(String s : arr) {
			if(primeF.contains(s) || s.equals("")) {

			} else if(primeT.contains(s)) {
				count++;
			} else if(PrimeNum(s, primeT, primeF)) {
				count++;
			} 
		}
		System.out.println("T :" + primeT);
		System.out.println("F :" + primeF);
		return count;
		
	}

	private static boolean PrimeNum(String s, Set<String> primeT, Set<String> primeF) {
		int num = Integer.parseInt(s);
		for(int i = 2; i <= (int) Math.sqrt(num); i++) {
			if(num % i == 0) {
				primeF.add(Integer.toString(num));
				return false;
			}
		}
		primeT.add(Integer.toString(num));
		return true;
	}
}

package p99programmers.lv2.ok.k진수_소수;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution3 {
	public static void main(String[] args) {
		int n = 2020202;
		int k = 10;
		int answer = Sol1(n, k);
		System.out.println(answer);		
	}

	private static int Sol1(int n, int k) {
		// 변환된 수와 개수 구하기
		Map<String, Integer> map = new HashMap<>();
		for(String s : Integer.toString(n, k).split("0")) {
			if(!s.equals("")) {
				map.compute(s, (a, b) -> b == null ? 1 : b + 1);
			}
		}
		
		System.out.println(map);
		
		// 소수의 개수 구하기
		int count = 0;
		for(String s : map.keySet()) {
			if(PrimeNum(s)) {
				count += map.get(s);
			}
			
		}
		
		return count;
	}
	
	// 소수 판별 함수
	private static boolean PrimeNum(String s) {
		long num = Long.parseLong(s);
		if(num == 1) {
			return false;
		}
		if(num == 2 || num == 3) {
			return true;
		}
		for(int i = 2; i <= (long) Math.sqrt(num); i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}

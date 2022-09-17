package p99baekjoon.s5.s1316;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		scanner.nextLine();
		
		int answer = 0;
		for(int i = 0; i < N; i++) {
			if(group(scanner.nextLine())) {
				answer++;
			}
		}
		
		System.out.println(answer);
	}

	private static boolean group(String string) {
		if(string.length() < 3) {
			return true;
		}

		Set<Character> set = new HashSet<Character>();
		set.add(string.charAt(0));
		for(int i = 1; i < string.length(); i++) {
			if(!set.add(string.charAt(i))) {
				if(string.charAt(i) != string.charAt(i - 1)) {
					return false;
				}
			}
		}
        
		return true;
	}
	
	
}
package p99baekjoon.s1316;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution2 {
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
//		String[] strSplit = string.split("");
//		  
//        List<String> strList = new ArrayList<String>(Arrays.asList(strSplit));
		Set<Character> set = new HashSet<Character>();
		set.add(string.charAt(0));
		for(int i = 1; i < string.length(); i++) {
			if(!set.add(string.charAt(i))) {
				if(string.charAt(i) != string.charAt(i - 1)) {
					return false;
				}
			}
		}
        
//		String str = string;
//		int count = 0;
//		int a = 0;
//		while(str.length() > 0) {
//			while(str.charAt(0) == str.charAt(count)) {
//				count++;
//				if(count > str.length() - 1	) {
//					break;
//				}
//			}
//			a = str.length();
//			str.replace(str.substring(0,1), "");
//			System.out.println(str);
//			if((a - str.length()) != count) {
//				return false;
//			}
//			count = 0;
//		}	
		return true;
	}
	
	
}

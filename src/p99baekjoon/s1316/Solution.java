package p99baekjoon.s1316;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		scanner.nextLine();
		List<String> arr = new ArrayList<>();
		
		
		for(int i = 0; i < N; i++) {
			arr.add(scanner.nextLine());
		}
		System.out.println(arr);
		
		for(int i = 0; i < arr.size(); i++) {
			String str = arr.get(i);
			for(int j = 0; j < str.length() - 1; j++) {
				while(str.charAt(j) == str.charAt(j + 1)) {
					j++;
				}
				while(str)
			}
		}

//		int i = 0;
//		while(i < arr.size()) {
//			while(arr.get(i).length() > 0) {
////				arr.get(i).split(arr.get(i).substring(0,1));
//				System.out.println(arr);
//				if(arr.get(i).length() == 0) {
//					
//				}
////				if(arr.get(i).matches("(arr.get(i).charAt(0))+[^(arr.get(i).charAt(0))]*")){
////					arr.get(i).replace(Character.toString(arr.get(i).charAt(0)), "");
////					i++;
////					System.out.println(arr);
////				} else {
////					arr.remove(i);
////					System.out.println(arr);
////					break;
////				}
//			}
//		}
//		System.out.println(N);
//		System.out.println(arr);
	}
}

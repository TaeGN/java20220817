package p99programmers.lv2.전화번호_목록;

import java.util.Arrays;

public class Solution1 {
	public static void main(String[] args) {
		String[] phone_book = {"119", "97674223", "1195524421"};
		boolean answer1 = Sol1(phone_book);
		boolean answer2 = Sol1(phone_book);
		System.out.println(answer1);
		System.out.println(answer2);
	}

	private static boolean Sol1(String[] phone_book) {
		Arrays.sort(phone_book, (a, b) -> a.length() - b.length());
		for(int i = 0; i < phone_book.length - 1; i++) {
			for(int j = i + 1; j < phone_book.length; j++) {
				if(phone_book[j].substring(0, phone_book[i].length()).equals(phone_book[i])) {
					return false;
				}
			}
		}
		return true;
	}
	
	private static boolean Sol2(String[] phone_book) {
		Arrays.sort(phone_book, (a, b) -> a.length() - b.length());
		for(int i = 0; i < phone_book.length - 1; i++) {
			
			for(int j = i + 1; j < phone_book.length; j++) {
				if(phone_book[i].length() == phone_book[j].length()) {
					continue;
				}
				for(int k = 0; k < phone_book[i].length(); k++) {
					if(phone_book[i].charAt(k) != phone_book[j].charAt(k)) {
						break;
					}
					if(k == phone_book[i].length() - 1) {
						return false;
					}
				}
			}
		}
		return true;
	}
	
	
	
}

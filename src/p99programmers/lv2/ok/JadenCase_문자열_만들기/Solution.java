package p99programmers.lv2.ok.JadenCase_문자열_만들기;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		String s = "  3people    uNFollowed ME  ";
		String answer = "";
		System.out.println(s.toUpperCase());
		String[] arr = s.split(" ");
		System.out.println(Arrays.toString(arr));
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].matches("[a-zA-Z]\\w*")) {
				answer += Character.toString(arr[i].charAt(0)).toUpperCase() + arr[i].substring(1,arr[i].length()).toLowerCase();
			} else {
				answer += arr[i].toLowerCase();
			}
			if (i != arr.length - 1) {
				answer += " ";
			}
		}
		System.out.println(answer);
	}
}

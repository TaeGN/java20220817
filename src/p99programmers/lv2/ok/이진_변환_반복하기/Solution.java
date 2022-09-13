package p99programmers.lv2.ok.이진_변환_반복하기;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		String s = "110010101001";
		int[] answer = {0,0};
		while(s.length() > 1) {
			answer[1] += s.length() - s.replace("0", "").length();			
			s = Integer.toBinaryString(s.replace("0", "").length());
			answer[0]++;
		}
		
		System.out.println(Arrays.toString(answer));
	}
}

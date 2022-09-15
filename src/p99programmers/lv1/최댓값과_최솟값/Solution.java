package p99programmers.lv1.최댓값과_최솟값;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		String s = "1 2 3 4";
		String[] arr = s.split(" ");
		System.out.println(Arrays.toString(arr));
		int max = 0;
		int min = Integer.parseInt(arr[0]);
		
		for(int i = 0; i < arr.length; i++) {
			if(max < Integer.parseInt(arr[i])) {
				max = Integer.parseInt(arr[i]);
			}
			if(min > Integer.parseInt(arr[i])) {
				min = Integer.parseInt(arr[i]);
			}
		}
		String answer = Integer.toString(min) + " " + Integer.toString(max);
		System.out.println(answer);
	}
}

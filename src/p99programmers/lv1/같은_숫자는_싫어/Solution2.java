package p99programmers.lv1.같은_숫자는_싫어;

import java.util.Arrays; //ok

public class Solution2 {
	public static void main(String[] args) {
		int[] arr = {1, 1, 3, 3, 0, 1, 1};
		int[] arr2 = new int[arr.length];
		int a = 0;
		for(int i = 0; i < arr.length; i++) {
			arr2[a] = arr[i];
			a++;
			while(i < arr.length-1 && arr[i] == arr[i+1]) {
				i++;
			}
		}
		int[] answer = new int[a];
		for(int i = 0; i < a; i++) {
			answer[i] = arr2[i];
		}
		System.out.println(Arrays.toString(answer));
		
	}
}

package p99leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S1200 {
	public static void main(String[] args) {
		int[] arr = {4,2,1,3};
		List<List<Integer>> answer = new ArrayList<>();
		
		Arrays.sort(arr);
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < arr.length - 1; i++) {
			int diff = arr[i + 1] - arr[i];
			if(diff < min) {
				min = diff;
				answer.clear();
				answer.add(Arrays.asList(arr[i], arr[i + 1]));
			} else if(diff == min) {				
				answer.add(Arrays.asList(arr[i], arr[i + 1]));
			}
		}
		
		
//		
//		int min = arr[1] - arr[0];
//		for(int i = 0; i < arr.length - 1; i++) {
//			if(arr[i + 1] - arr[i] < min) {
//				min = arr[i + 1] - arr[i];
//			}
//		}
//		for(int i = 0; i < arr.length - 1; i++) {
//			if(arr[i + 1] - arr[i] == min) {
//				answer.add(Arrays.asList(arr[i],arr[i + 1]));
//			}		
//		}

		System.out.println(answer);
	}
}

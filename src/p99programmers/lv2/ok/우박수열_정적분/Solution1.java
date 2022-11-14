package p99programmers.lv2.ok.우박수열_정적분;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1 {
	public static void main(String[] args) {
		int k = 5;
		int[][] ranges = {
				{0,0},
				{0,-1},
				{2,-3},
				{3,-3}
		};
		
		double[] answer = Sol1(k, ranges);
		System.out.println(Arrays.toString(answer));
	}

	private static double[] Sol1(int k, int[][] ranges) {
		List<Integer> list = new ArrayList<>();
		list.add(k);
		while(k > 1) {
			if(k % 2 == 0) {
				k /= 2;
			} else {
				k = k * 3 + 1;
			}
			list.add(k);
		}
		
		List<Double> list2 = new ArrayList<>();
		for(int i = 0; i < list.size() - 1; i++) {
			double val = ((double) list.get(i) + list.get(i + 1)) / 2;
			list2.add(val);
		}
		
		double[] answer = new double[ranges.length];
		int n = 0;
		double sum = 0;
		for(int[] arr : ranges) {
			if(arr[0] > list2.size() + arr[1]) {
				answer[n++] = -1.0;
				continue;
			}
			for(int j = arr[0]; j < list2.size() + arr[1]; j++) {
				sum += list2.get(j);
			}
			answer[n++] = sum;
			sum = 0;
		}
		return answer;
	}
}

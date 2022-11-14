package p99programmers.lv2.양궁대회;

import java.util.Arrays;

public class Solution1 {
	public static void main(String[] args) {
		int n = 5;
		int[] info = {2,1,1,1,0,0,0,0,0,0,0};
		int[] answer = sol(n, info);
		System.out.println(Arrays.toString(answer));
	}

	private static int[] sol(int n, int[] info) {
		double[] arr = new double[info.length];
		for(int i = 0; i < info.length; i++) {
			arr[i] = (10 - i) / (double) (info[i] + 1);
			if(info[i] != 0) {
				arr[i] *= 2;
			}
		}
		System.out.println(Arrays.toString(arr));
		return null;
	}
}

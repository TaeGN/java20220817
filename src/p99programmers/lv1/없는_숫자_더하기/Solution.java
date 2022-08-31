package p99programmers.lv1.없는_숫자_더하기;

public class Solution {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6,7,8,0};
		int sum = 45;
		
		for(int i = 0; i < arr.length; i++) {
			sum -= arr[i];
		}
		
		System.out.println(sum);
	}
}

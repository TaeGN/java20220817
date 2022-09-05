package p99programmers.lv2.no.타겟_넘버;

public class Solution {
	public static void main(String[] args) {
		int[] numbers = {1, 1, 1, 1, 1};
		int target = 3;
		int len = numbers.length;
		int sum = 0;
		int a = 0;
		int b = 0;
		int answer = 0;
		int[] arr = new int[]
		
		for(int i = 0; i < len; i++) {
			sum += numbers[i];
		}
//		if (sum % 2 == 1) {
//			return 0;
//		}
		a = (sum + target) / 2;
		b = (sum - target) / 2;
		
		for(int i = 1; i <= len; i++) {
			sum = 0;
			for(int j = i; j > 0; j--) {
				for(int k = len - j + 1; k > 0; k--) {
					sum[k] +=  
				}
			}
		}
		
		System.out.println(sum);	
	}
}

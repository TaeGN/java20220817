package p99programmers.lv2.타겟_넘버;

public class Solution {
	public static void main(String[] args) {
		int[] numbers = {1, 1, 1, 1, 1};
		int target = 3;
		int sum = 0;
		int answer = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println(sum);
		
		
		
	}
}

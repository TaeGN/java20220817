package p99programmers.lv1.소수_만들기; // ok

public class Solution {
	public static void main(String[] args) {
		int[] nums = {1,2,7,6,4};
		int sum = 0;
		int result = 0;
		
		for(int i = 0; i < nums.length-2; i++) {
			for(int j = i+1; j < nums.length-1; j++) {
				for(int k = j+1; k < nums.length; k++) {
					sum = nums[i] + nums[j] + nums[k];
					for(int n = 2; n <= (int) Math.sqrt(sum); n++) {
						if(sum % n == 0) {
							break;
						}
						if(n == (int) Math.sqrt(sum)) {
							result++;
						}
					}
					
				}
			}
		}
		
		System.out.println(result);
	}
	
	
}

package p99leetcode.assignment01;

public class S2206 {
	public static void main(String[] args) {
		int[] nums = {3,2,3,2,2,2};
		boolean answer = divideArray(nums);
		System.out.println(answer);
	}

	private static boolean divideArray(int[] nums) {
		int[] counts = new int[501];
		for(int num : nums) {
			counts[num]++;
		}
		for(int count : counts) {
			if(count % 2 != 0) {
				return false;
			}
		}
		return true;
	}
}

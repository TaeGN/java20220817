package p99leetcode.assignment01;

public class S2006 {
	public static void main(String[] args) {
		int[] nums = {1,2,2,1};
		int k = 1;
		int answer = countKDifference(nums, k);
		System.out.println(answer);
	}

	private static int countKDifference(int[] nums, int k) {
		int answer = 0;
		for(int i = 0; i < nums.length - 1; i++) {
			for(int j = i + 1; j <nums.length; j++) {
				if(Math.abs(nums[i] - nums[j]) == k)  {
					answer++;
				}
			}
		}
		return answer;
	}
}

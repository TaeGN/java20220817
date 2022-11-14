package p99programmers.lv2.ok.타겟_넘버;

public class Solution3 {
	public static void main(String[] args) {
		int[] numbers = {4, 1, 2, 1};
		int target = 4;
		int answer = Sol1(numbers, target);
		System.out.println(answer);
	}
	private static int Sol1(int[] numbers, int target) {
		int sum = 0;
		int depth = 0;
		Function(sum, target, numbers, depth);
		return cnt;
	}
	static int cnt = 0;
	private static void Function(int sum, int target, int[] numbers, int i) {
		if(i == numbers.length) {
			if(sum == target) {
				cnt++;
			}
			return;
		}
		
		Function(sum + numbers[i], target, numbers, i + 1);
		Function(sum - numbers[i], target, numbers, i + 1);
	}

}
















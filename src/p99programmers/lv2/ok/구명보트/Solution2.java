package p99programmers.lv2.ok.구명보트;

import java.util.Arrays;

public class Solution2 {
	public static void main(String[] args) {
		int[] people = {70, 50, 80, 50};
		int limit = 100;
		int answer = sol(people, limit);
		System.out.println(answer);
	}

	private static int sol(int[] people, int limit) {
		// Arrays.sort(people);
		int[] sortedArr = Arrays.stream(people)
							.sorted()
							.toArray();
		int count = 0;
		int front = 0;
		int back = sortedArr.length - 1;
		while(front < back) {
			if(limit - sortedArr[back] >= sortedArr[front]) {
				front++;
			}
			back--;
			count++;
		}
		if(front == back) {
			count++;
		}
		return count;
	}
}

package p99programmers.lv2.ok.프린터;

public class Solution5 {
	public static void main(String[] args) {
		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location = 0;
		int answer = Sol1(priorities, location);
		System.out.println(answer);
	}

	private static int Sol1(int[] priorities, int location) {		
		int count = 0;
		int j = 0;
		int n = 0;
		for(int i = 9; i > 0; i--) {
			for(int k = 0; k < priorities.length; k++) {
				if(priorities[j % priorities.length] == i) {
					count++;
					if(j % priorities.length == location) {
						return count;
					}
					// 다음 시작 위치
					n = (j + 1) % priorities.length;
				}
				j = (j + 1) % priorities.length;
			}
			j = n;
			
		}
		return 0;
	}
}

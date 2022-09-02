package p99programmers.lv2.ok.멀쩡한_사각형;

public class Solution {
	public static void main(String[] args) {
		int w = 8;
		int h = 8;
		int max = Math.max(w, h);
		int min = Math.min(w, h);
		long answer = w * h;
		long a = 0;
		long b = 0;
		System.out.println(max);
		System.out.println(min);
		
		for(int i = 0; i < min; i++) {
			if((max * (i + 1)) % min == 0) {
				a = (long)(max * (i + 1)) / min;
			} else {
				a = (long)(max * (i + 1) / (double) min) + 1;
			}
			b = (long) (max * i / min);
			answer -= (a - b);
			System.out.println(a);
			System.out.println(b);
			System.out.println();
		}
		System.out.println(answer);		
	}
}

package p99programmers.lv2.멀쩡한_사각형;

public class Solution {
	public static void main(String[] args) {
		int W = 8;
		int H = 12;
		int result = 0;
		int max = Math.max(W, H);
		int min = Math.min(W, H);
		double a = max / min;
		int count = 0;
		
		for(int i = 0; i < min; i++) {
			count += (Math.ceil(max * min * (i + 1) / 2) + 1)-(int)(a * i);
//			if(((int) (a * (i + 1))) == a * (i + 1)) {
//				count--;
//			}
		}
		
		System.out.println(count);
	}
}

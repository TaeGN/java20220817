package p99programmers.lv2.ok.멀쩡한_사각형;

public class Solution2 { // x
	public static void main(String[] args) {
		int w = 100000000;
		int h = 100000000;
		long answer = (long) w * h;
		long a = 0;
		long b = 0;
		System.out.println(answer);
		
//		for(int i = 0; i < h; i++) {
//			if((w * (i + 1)) % h == 0) {
//				a = (long)(w * (i + 1)) / h;
//			} else {
//				a = (long)(w * (i + 1) / h) + 1;
//			}
//			b = (long) (w * i / h);
//			answer -= (a - b);
//			System.out.println(a);
//			System.out.println(b);
//			System.out.println();
//		}
//		System.out.println(answer);		
	}
}

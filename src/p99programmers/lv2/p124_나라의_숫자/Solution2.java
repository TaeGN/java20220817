package p99programmers.lv2.p124_나라의_숫자;

public class Solution2 {
	public static void main(String[] args) {
		String answer = "";
		int n = 13;
		int a = 0;
		int i = 0;
		int count = 0;
		while(n > a) {
			i++;
			a =  (3 * (int)(Math.pow(3,i) -1) / (3 - 1));		
		}
		System.out.println("i : " + i);
		for(;i > 0; i--) {
			count = 0;
			for(int j = 1; j <= 3; j++) {
				if(n <= (3 * (int)(Math.pow(3,i-1) -1) / (3 - 1))) {
					break;
				}
				count = j;
				n -= (int)(Math.pow(3,i-1));
			}
//			if (i == 1) {
//				count++;
//				if(count == 4) {
//					count = 1;
//				}
//			}
			if (count == 3) {
				count = 4;
			}
			answer += Integer.toString(count);
//			System.out.println(answer);
		}
		System.out.println(answer);
	}
}


// 3,9,27,81
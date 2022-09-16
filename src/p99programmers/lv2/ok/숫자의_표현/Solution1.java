package p99programmers.lv2.ok.숫자의_표현;

public class Solution1 {
	public static void main(String[] args) {
		int n = 10000;
		int answer = solution(n);
		System.out.println(answer);
		
		
	}
	
	private static int solution(int n) {
        int count = 0;
        for(int i = 1; i <= n; i++) {
        	int a = 2 * n - i * (i - 1);
        	if(a % (2 * i) == 0 && a / (2 * i) >= 1) {
        		count++;
        		System.out.println(i);
        	}
        	if(a / (2 * i) < 1) {
        		break;
        	}
        }
        
        
        return count;
    }
}

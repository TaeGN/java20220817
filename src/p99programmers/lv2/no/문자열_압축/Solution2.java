package p99programmers.lv2.no.문자열_압축;

public class Solution2 {
	public static void main(String[] args) {
		String s = "ababcdcdababcdcd";
		int slen = s.length();
		String[] answer = new String[slen/2];
		int[] result = new int[slen/2];
		int count = 1;
		int n = 1;
		
		for(int unit = 1; unit <= slen/2; unit++) {
			while(true) {
				if(s.substring((n-1) * unit, n * unit) == s.substring(n * unit, (n+1) * unit)) {
					
				}
				if(n == slen / unit) {
					n = 1;
					break;
				}
			}
		}
		
		
	}
}

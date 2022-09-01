package p99programmers.lv2.문자열_압축;

public class Solution1 {
	public static void main(String[] args) {
		String s = "ababcdcdababcdcd";
		String[] answer = new String[s.length()/2];
		int[] result = new int[s.length()/2];
		int count = 1;
		int slen = s.length();
		
		for(int i = 1; i <= (slen / 2); i++) {
			answer[i-1] = "";
			for(int j = 1 ; j < (slen / i); j++) {
				if (s.substring((j-1) * i, j * i) == s.substring(j * i, (j + 1) * i)) {
					count++;
				} else {					
					if (count != 1) {						
						answer[i-1] += Integer.toString(count) + s.substring((j-1) * i, j * i);
						count = 1;
					} else {
						answer[i-1] += s.substring((j-1) * i, j * i);
					}
				}
				
			}
			answer[i-1] += s.substring(slen - (slen % i), slen);
			result[i-1] = answer[i-1].length();			
			System.out.println(i + "개로 분할 : " + answer[i-1]);
			System.out.println(result[i-1]);
		}
		
	}
}


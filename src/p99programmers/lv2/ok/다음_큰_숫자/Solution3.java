package p99programmers.lv2.ok.다음_큰_숫자;

public class Solution3 {
	public static void main(String[] args) {
		int n = 78;
		int answer = sol(n);
		System.out.println(answer);
	}

	// 시간초과
	private static int sol(int n) {
		String biNum = Integer.toBinaryString(n);
		int zeroCount = 0;
		int oneCount = 0;
		int i = 1;
		while(biNum.charAt(biNum.length() - i) == '0') {
			zeroCount++;
			i++;
		}
		
		while(biNum.charAt(biNum.length() - i) == '1') {
			oneCount++;
			if(i < biNum.length()) {
				i++;
			} else {
				break;
			}
		}
		
		String answerBiNum = ""; 
		if(i != biNum.length()) {
			answerBiNum = biNum.substring(0, biNum.length() - zeroCount - oneCount - 1);
		}
		answerBiNum += "10";
		for(int j = 0; j < zeroCount; j++) {
			answerBiNum += "0";
		}
		for(int j = 0; j < oneCount - 1; j++) {
			answerBiNum += "1";
		}
		int answer = Integer.parseInt(answerBiNum, 2);
		return answer;
	}
}

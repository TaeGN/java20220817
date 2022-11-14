package p99programmers.lv2.ok.다음_큰_숫자;

public class Solution2 {
	public static void main(String[] args) {
		int n = 78;
		int answer = sol(n);
		System.out.println(answer);
	}
		

	private static int sol(int n) {	
		String biNum = Integer.toBinaryString(n);
		System.out.println(biNum);
		int i = biNum.length() - 1;
		while(biNum.charAt(i) == '0') {
			i--;
		}
		if(i == 0) {
			biNum = "1" + "0" + biNum.substring(1,biNum.length());
			System.out.println("1 : " + biNum);
			return Integer.parseInt(biNum, 2);
		}
		
		int startNum = i + 1;
		int lastNum = i + 1;
		int len = 0;
		while(biNum.charAt(i) == '1') {
			startNum = i;
			i--;
			if(i == 0) {
				len = lastNum - startNum;
				biNum.substring(0,lastNum).replace('1', '0');
				biNum.substring(biNum.length() - len, biNum.length()).replace('0', '1');
				biNum = "1" + biNum;
				System.out.println("2 : " + biNum);
				return Integer.parseInt(biNum, 2);
			}
		}
		len = lastNum - startNum;
		System.out.println(lastNum);
		System.out.println(startNum);
		biNum.substring(startNum,lastNum).replace('1', '0');
		System.out.println(biNum);
		biNum.substring(biNum.length() - len + 1,biNum.length()).replace('0', '1');
		biNum = biNum.substring(0, startNum - 1) + "1" + biNum.substring(startNum, biNum.length());
		System.out.println("3 : " + biNum);
		return Integer.parseInt(biNum, 2);
	}	
}
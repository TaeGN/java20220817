package p99programmers.lv2.다음_큰_숫자;

// 시간 초과..
public class Solution1 {
	public static void main(String[] args) {
		int n = 15;
		int answer = sol(n);
		System.out.println(answer);
	}

	private static int sol(int n) {
		String str = Integer.toBinaryString(n);
		String[] bi = str.split("");
//		if(str.replace("1", "").equals("")) {
//			str = "1" + "0" + str.substring(1,str.length());
//			return Integer.parseInt(str, 2);
//		}
//		
		int count = 0;
		int i = bi.length - 1;
		// 연속된 0의 개수
		while(bi[i].equals("0") && i > 0) {
			i--;
		}
		
		// 연속된 1의 개수
		while(bi[i].equals("1") && i > 0) {
			bi[i] = "0";
			i--;
			count++;
			if(i == 0) {
				bi[i] = "0";
				for(int j = 1; j <= count; j++) {
					bi[bi.length - j] = "1";
				}
				str = "1" + String.join("", bi);
				return Integer.parseInt(str, 2);
			}
		}
		bi[i] = "1";
		for(int j = 1; j < count; j++) {
			bi[bi.length - j] = "1";
		}
		str = String.join("", bi);
		int answer = Integer.parseInt(str, 2);
				
		return answer;
	}
}

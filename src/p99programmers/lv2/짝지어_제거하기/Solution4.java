package p99programmers.lv2.짝지어_제거하기;

public class Solution4 {
	public static void main(String[] args) {
		String s = "abacdccbaabaaxzxxzxdcba";
		String[] alp = {"aa", "bb", "cc", "dd", "ee" , "ff", "gg", "hh", "ii", "jj", "kk", "ll", "mm", "nn", "oo", "pp", "qq", "rr", "ss", "tt", "uu", "vv", "ww", "xx", "yy", "zz"};
		String a = "";
		int answer = 0;
		while(true) {
			a = s;
			for (int i = 0; i < 26; i++) {
				s = s.replaceAll(alp[i], "");				
				System.out.println(s);
			}
			if (s == "") {
				answer = 1;
				break;
			}
			if (a == s) {
				break;
			}
		}
		System.out.println(answer);
		
	}
}

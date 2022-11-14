package p99programmers.lv2.큰_수_만들기;

public class Solution1 {
	public static void main(String[] args) {
		String number = "9191919";
		int k = 2;
		String answer = Sol2(number, k);
		System.out.println(answer);
	}

	private static String Sol2(String number, int k) {
		int cnt = 0;
		int i = 0;
		while(i < number.length() - 1) {
			int j = 1;
			while(j <= k - cnt) {
				if(number.charAt(i) < number.charAt(i + j)) {
					number = number.substring(0, i) + number.substring(i + j, number.length());
					cnt += j;
					if(cnt == k) {
						return number;
					}
					j = 1;
					System.out.println(i+ ":" + cnt + ":" + number);
				} else if(i + j < number.length() - 1) {
					j++;
				} else {
					i += j;
					break;
				}
			}
			System.out.println(number);
		}
		
		number = number.substring(0, number.length() - (k - cnt));
		
		return number;
	}

	private static String Sol1(String number, int k) {
		int cnt = 0;
		int i = 0;
		while(i < number.length() - 1) {
			int j = 1;
			while(j <= k - cnt && i + j < number.length()) {
				if(number.charAt(i) < number.charAt(i + j)) {
					number = number.substring(0, i) + number.substring(i + j, number.length());
					cnt += j;
					if(cnt == k) {
						return number;
					}
                    j = 1;
				} else {
					j++;
				}
			}
			i++;
		}
		
		number = number.substring(0, number.length() - (k - cnt));
		
		return number;
	}
}

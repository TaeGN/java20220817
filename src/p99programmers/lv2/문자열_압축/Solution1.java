package p99programmers.lv2.문자열_압축;

public class Solution1 {
	public static void main(String[] args) {
		String s = "abcabcabcabcdededededede";
		int answer = Sol1(s);
		System.out.println(answer);
	}

	private static int Sol1(String s) {
		int min = Integer.MAX_VALUE;
		for(int i = 1; i <= s.length() / 2; i++) {
			String[] arr = new String[] {"", ""};
			String str = "";
			for(int j = 0; j < s.length() - i; j = j + i) {
				if(!s.substring(j, j + i).equals(arr[0])) {
					str += Integer.toString(arr[1].length()) + arr[0];
					arr[0] = s.substring(j, j + i);
					arr[1] = " ";
				} else {
					arr[1] += " ";
				}
				
			}
			str += Integer.toString(arr[1].length()) + arr[0];
			min = (int) Math.min(min, str.replace("1", "").length());
			System.out.println(i + ":" + str.replace("1", ""));
		}
		return min;
	}
}

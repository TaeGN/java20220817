package p99programmers.lv1.숫자_문자열과_영단어;

public class aa {
	public int solution(String s) {
		int answer = 0;
		String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		for (int i = 0; i < str.length; i++) {
			s.replaceAll(str[i], String.valueOf(i));
		}
		answer = Integer.parseInt(s);
		return answer;
	}
}

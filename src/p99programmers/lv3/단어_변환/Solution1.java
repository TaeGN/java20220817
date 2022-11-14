package p99programmers.lv3.단어_변환;

public class Solution1 {
	public static void main(String[] args) {
		String begin = "hit";
		String target = "cog";
		String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
		int answer = Sol1(begin, target, words);
		System.out.println(answer);
	}
	static int result = 0;
	private static int Sol1(String begin, String target, String[] words) {
		
		int cnt = 0;
		boolean[] path = new boolean[words.length];
		Conversion(begin, target, words, path, cnt);
		return result;
	}

	private static void Conversion(String now, String target, String[] words, boolean[] path, int cnt) {
		if(now.equals(target)) {
			result = cnt;
			return;
		}
		
		for(int i = 0; i < words.length; i++) {
			if(path[i] == false) {
				int same = 0;
				for(int j = 0; j < now.length(); j++) {
					if(now.charAt(j) == words[i].charAt(j)) {
						same++;
					}
				}
				
				if(same == now.length() - 1) {
					path[i] = true;
					Conversion(words[i], target, words, path, cnt + 1);
					path[i] = false;
				}
			}
		}
		
	}
}

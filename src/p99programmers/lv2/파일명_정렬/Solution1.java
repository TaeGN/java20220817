package p99programmers.lv2.파일명_정렬;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution1 {
	public static void main(String[] args) {
		String[] files = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
		String[] answer = Sol1(files);
		System.out.println(Arrays.toString(answer));
	}

	private static String[] Sol1(String[] files) {
		Map<String[], String> map = new HashMap<>();
		String s1 = "";
		String s2 = "";
		String s3 = "";
		for(String file : files) {
			int i = 0;
			while(i < file.length() - 1) {
				if(file.charAt(i++) >= 0 && file.charAt(i++) <= 9) {
					s1 = file.substring(0,i).toLowerCase();
					break;
				}
			}
			
			int j = i;
			while(j < file.length() - 1) {
				if(!(file.charAt(j++) >= 0 && file.charAt(j++) <= 9)) {
					break;
				}
			}
			s2 = file.substring(i, j).replace("0", "");
			
			if(j < file.length()) {
				s3 = file.substring(j, file.length());
			}
			map.put(new String[] {s1, s2, s3}, file);
		}
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		map.keySet().stream().sorted();
		
		String[] answer = new String[files.length];
		int n = 0;
		for(String[] arr : map.keySet()) {
			answer[n++] = map.get(arr);
		}
		return answer;
	}
}

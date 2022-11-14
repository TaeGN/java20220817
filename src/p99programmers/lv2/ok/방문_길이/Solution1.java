package p99programmers.lv2.ok.방문_길이;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution1 {
	public static void main(String[] args) {
		String dirs = "ULURRDLLU";
		int answer = Sol2(dirs);
		System.out.println(answer);
	}

	private static int Sol2(String dirs) {
		Set<String> set = new HashSet<>();
		
		int[] pos = new int[2];
		String prev = "";
		String path = "";
		for(int i = 0; i < dirs.length(); i++) {
			prev = Arrays.toString(pos);
			switch(dirs.charAt(i)) {
			case 'U':
				if(pos[1] < 5) {
					pos[1] += 1;
					path = Arrays.toString(pos) + prev;
				}
				break;
			case 'D':
				if(pos[1] > -5) {
					pos[1] -= 1;
					path = prev + Arrays.toString(pos);
				}
				break;
			case 'R':
				if(pos[0] < 5) {
					pos[0] += 1;
					path = Arrays.toString(pos) + prev;
				}
				break;
			case 'L':
				if(pos[0] > -5) {
					pos[0] -= 1;
					path = prev + Arrays.toString(pos);
				}
				break;	
			}
			set.add(path);
		}
		return set.size();
	}

	private static int Sol1(String dirs) {
		Set<int[][]> set = new HashSet<>();
		
		int[] pos = {0, 0};
		int[][] path = new int[2][2];
		for(int i = 0; i < dirs.length(); i++) {
			int[] prev = pos;
			switch(dirs.charAt(i)) {
			case 'U':
				pos[1] += 1;
				path =  new int[][] {prev, pos};
				break;
			case 'D':
				pos[1] -= 1;
				path =  new int[][] {pos, prev};
				break;
			case 'R':
				pos[0] += 1;
				path =  new int[][] {prev, pos};
				break;
			case 'L':
				pos[0] -= 1;
				path =  new int[][] {pos, prev};
				break;	
			}
			if(set.contains(pos))
			set.add(path);
		}
		System.out.println(set);
		return set.size();
	}
}

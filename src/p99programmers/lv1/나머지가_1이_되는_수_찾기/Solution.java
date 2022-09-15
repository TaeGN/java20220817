package p99programmers.lv1.나머지가_1이_되는_수_찾기;

public class Solution {
	public static void main(String[] args) {
		int n = 10;
		int answer = n - 1;
		
		for(int i = 2; i <= (int)Math.sqrt(n - 1); i++) {
			if(((n - 1) % i) == 0) {
				answer = i;
			}
		}

    }
	}
}

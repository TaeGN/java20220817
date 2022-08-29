package p99programmers.lv1.최소직사각형;

public class Solution {
	public int solution(int[][] sizes) {
		int answer = 0;
		int max = Math.max(sizes[0][0], sizes[0][1]);
		int min = Math.min(sizes[0][0], sizes[0][1]);
		
        for(int i = 1; i < sizes.length; i++) {
        	max = (Math.max(max, Math.max(sizes[i][0], sizes[i][1])));
        	min = (Math.max(min, Math.min(sizes[i][0], sizes[i][1])));
        }
        answer = max * min;
        
        return answer;
    }
}

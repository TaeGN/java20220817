package p99programmers.lv2.ok.프린터;

public class Solution2 {

}

class Solution {
    public int solution(int[] priorities, int location) {
        int pos = -1;
		int answer = 0;
        int lastpos = 0;
		
		for(int i = 9; i >= 1; i--) {
			for(int j = 1; j <= priorities.length; j++) {
				if(priorities[(pos + j) % priorities.length] == i) {
					answer++;
					lastpos = (pos + j) % priorities.length;
					if(lastpos == location) {
						return answer;
					}
				}
               

			}
			 pos = lastpos;
		}
        return 1;
    }
}

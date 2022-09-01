package p99programmers.lv2.멀쩡한_사각형;

public class Answer {

}


class Solution {
    public long solution(int w, int h) {
        long ww = (long)w;
        long hh = (long)h;
        long answer = ww * hh;
		long a = 0;
		long b = 0;
		
		for(int i = 0; i < hh; i++) {
			if((ww * (i + 1)) % hh == 0) {
				a = (long)((ww * (i + 1)) / hh);
			} else {
				a = (long)((ww * (i + 1)) / hh) + 1;
			}
			b = (long) (ww * i / hh);
			answer -= (a - b);
		}
        return answer;
    }
}
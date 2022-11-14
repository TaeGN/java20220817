package p99programmers.lv2.ok.프린터;

public class Solution {
	public static void main(String[] args) {
		int[] priorities = {2, 1, 3, 2};
		int location = 0;
		int pos = -1;
		int lastpos = 0;
		int count = 0;
		
		for(int i = 9; i >= 1; i--) {
			for(int j = 1; j <= priorities.length; j++) {
				if(priorities[(pos + j) % priorities.length] == i) {
					count++;
					lastpos = (pos + j) % priorities.length;
					if(lastpos == location) {
						break;
					}
				}
				

			}
			pos = lastpos;
		}
		
		System.out.println(count);
		
	}
}


//public int solution(int[] priorities, int location) {
//    int answer = 0;
//    return answer;
//}

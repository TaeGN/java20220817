package p99programmers.lv1.같은_숫자는_싫어;


public class Solution {
    public int[] solution(int []arr) {

        int[] ans = new int[arr.length];
        int a = 0;
        
        for(int i = 0; i < arr.length; i++) {
        	if(i < arr.length-1 && arr[i] == arr[i+1]) {
        		i++;
        	} else {
	        	ans[a] = arr[i];
	        	a++;
        	}
        }
        int[] answer = new int[a+1];
        for(int i = 0; i <= a; i++) {
        	answer[i] = ans[i];
        }
        
        return answer;
    }
}
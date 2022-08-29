package p99programmers.lv1.크레인_인형뽑기_게임;

public class Solution {
	public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int j = 0;
        int[] arr = new int[moves.length];
        
        for(int i = 0; i < moves.length; i++) {
        	while(board[board.length - j][moves[i]] == 0) {
        		j++;
        	}
        	arr[i - answer * 2] = board[board.length - j][moves[i]];
        	if (i > 0 && arr[i - answer * 2] == arr[i - answer * 2 - 1]) {
        		arr[i - answer * 2] = 0;
        		arr[i - answer * 2 - 1] = 0;
        		answer++;
        	}
        	board[board.length - j][moves[i]] = 0;
        }
        
        return answer;
    }
}

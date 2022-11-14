package p99programmers.lv2.프렌즈4블록;

public class Solution1 {
	public static void main(String[] args) {
		int m = 4;
		int n = 5;
		String[] board = {"CCBDE", "AAADE", "AAABF", "CCBBF"};
		int answer =  Sol2(m, n, board);
		System.out.println(answer);
	}

	private static int Sol2(int m, int n, String[] board) {
		String[][] s = new String[m][n];
		String[][] tf = new String[m][n];
		return 0;
	}

//	private static int Sol1(int m, int n, String[] board) {
//		while(true) {
//			for(int i = 1; i < m; i++) {
//				for(int j = 1; j < n; j++) {
//					if(board[i].charAt(j) == board[i].charAt(j - 1)) {
//						if(board[i - 1].charAt(j) == board[i - 1].charAt(j - 1)) {
//							
//						}
//					}
//				}
// 			}
//		}
//		return 0;
//	}
}

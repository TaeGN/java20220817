package p99programmers.lv1.신고_결과_받기;

public class Solution {
	public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        String[][] count = new String[id_list.length][2];
        String[] a = report;
        String str = "";
        
        for (int i = 0; i < id_list.length; i++) {
        	a[i] = report[i].replaceAll(id_list[i], "");
        	int j = 1;
        	while(a[0] == " ") {
        		while(a[j] == " ") {
        			str += a[j];
        			j++;
        		}
        		for(int n = 0; n < id_list.length; n++) {
        			count[]
        		}
        	}
        }
        
        return answer;
    }
}



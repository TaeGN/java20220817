package p99programmers.lv1.신고_결과_받기;

public class Solution2 {
	public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        int[] num = new int[id_list.length];
        String[] str = report;        
        String[][] user = new String[id_list.length][id_list.length];
        
        for(int n = 0; n < id_list.length; n++) {
	        for(int i = 0; i < report.length; i++) {
	        	str[i] = report[i].replaceAll(id_list[n], "");
	        	if(str[i].substring(0,1) == " ") {
	        		for(int j = 0; j < id_list.length; j++) {
	        			if(id_list[j] == str[i].substring(1,str[i].length())) {
	        				user[n][j] = "1";
	        			}	       			
	        		}
	        	}
	        }
        }
        
        for(int i = 0; i < id_list.length; i++) {
        	for(int j = 0; j < id_list.length; j++) {
        		if(user[j][i].equals("1")) {
        			num[i] += 1;
        		}       		
        	}
        	if(num[i] >= k) {        		
        		for(int j = 0; j < id_list.length; j++) {
        			// 신고한 사람에게 메세지 보내기
        		}
        	}
        }
        
        return answer;
     }
        
}

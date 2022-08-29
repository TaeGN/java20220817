package p99programmers.lv1.숫자_문자열과_영단어;

public class Solution {
	public int solution(String s) {
        int answer = 0;
        String snum = "";
        int a = 0;
        
        for(int i = 1; i <= s.length(); i++) {
        	switch(s.substring(a,i)) {
        	case "0":
        	case "zero":
        		snum += "0";
        		a = i;
        		break;
        		
        	case "1":
        	case "one":
        		snum += "1";
        		a = i;
        		break;
        		
        	case "2":
        	case "two":
        		snum += "2";
        		a = i;
        		break;
        		
        	case "3":
        	case "three":
        		snum += "3";
        		a = i;
        		break;
        		
        	case "4":
        	case "four":
        		snum += "4";
        		a = i;
        		break;
        		
        	case "5":
        	case "five":
        		snum += "5";
        		a = i;
        		break;
        		
        	case "6":
        	case "six":
        		snum += "6";
        		a = i;
        		break;
        		
        	case "7":
        	case "seven":
        		snum += "7";
        		a = i;
        		break;
        		
        	case "8":
        	case "eight":
        		snum += "8";
        		a = i;
        		break;
        		
        	case "9":
        	case "nine":
        		snum += "9";
        		a = i;
        		break;
	
        	}

        }
        answer = Integer.parseInt(snum);
        
        return answer;
    }
}
